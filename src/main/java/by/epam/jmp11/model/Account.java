package by.epam.jmp11.model;

/**
 * Created by Vitali on 02.10.2016.
 */
public class Account {
    private int money;
    private String id;

    public Account() {
    }

    public Account(int money, String id) {
        this.money = money;
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
