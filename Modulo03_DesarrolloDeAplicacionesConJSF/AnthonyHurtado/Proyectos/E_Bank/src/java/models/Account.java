package models;

public class Account {
    private int personId;
    private int account;
    private String description;

    public Account(int personId, int account, String description) {
        this.personId = personId;
        this.account = account;
        this.description = description;
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
