package models;

public class Moves {
    private int originId;
    private int destinyId;
    private double amount;
    private String description;
    private String type;

    public Moves(int originId, int destinyId, double amount, String description, String type) {
        this.originId = originId;
        this.destinyId = destinyId;
        this.amount = amount;
        this.description = description;
        this.type = type;
    }
    
    public int getOriginId() {
        return originId;
    }

    public void setOriginId(int originId) {
        this.originId = originId;
    }

    public int getDestinyId() {
        return destinyId;
    }

    public void setDestinyId(int destinyId) {
        this.destinyId = destinyId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
