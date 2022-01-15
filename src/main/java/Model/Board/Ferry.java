package Model.Board;

import Model.Player;

public class Ferry extends Ownable {

    private int numberFerryOwned = 0;

    public Ferry(String name, int placement, String color, int[] rent, int price) {
        super(name, placement, color, rent, price);
    }

    @Override
    public int getCurrentRent() {
        int rent;
        if (owner != null) {
            if (mortgage) {
                return 0;
            }
            rent = RENT[numberFerryOwned];
            numberFerryOwned = 0;
        } else {
            rent = PRICE;
        }
        return rent;
    }

    public void updateNumberOfFerriesOwned(Player player, Board board) {
        int placement = player.getPlacement();
        boolean firstTime = true;
        for (int i = 0; i < board.getFields().length; i++) {
            if (board.getFields()[i] instanceof Ferry && ((Ownable) board.getFields()[i]).getOwner() == ((Ownable) board.getField(placement)).getOwner() && ((Ownable) board.getField(placement)).getOwner() != null) {
                if (firstTime) {
                    firstTime = false;
                    continue;
                }
                numberFerryOwned++;
            }
        }
    }

}
