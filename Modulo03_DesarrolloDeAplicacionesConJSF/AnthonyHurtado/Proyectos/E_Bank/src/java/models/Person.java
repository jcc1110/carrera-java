package models;

public class Person {
    private int id;
    private String firstname;
    private String lastname;
    private int ci;
    private String username;
    private String password;
    private int account;
    private double balance;

    public Person(int id, String firstname, String lastname, int ci, String username, String password, int account, double balance) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ci = ci;
        this.username = username;
        this.password = password;
        this.account = account;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
