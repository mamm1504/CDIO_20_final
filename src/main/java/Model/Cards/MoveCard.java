package Model.Cards;
import Model.*;

public class MoveCard extends ChanceCard {
    private String description;
    private String type;
    private int value;

    public MoveCard(String description, String type, int value) {
        super(description, type, value);
        this.value = value;
        this.description = description;
        this.type = type;
    }
    public String getDescription() {
        return description;
    }
    public String getType() {
        return type;
    }
    public int getValue() {
        return value;
    }
}
