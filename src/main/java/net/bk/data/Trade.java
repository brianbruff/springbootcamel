package net.bk.data;

public class Trade {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Trade setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Trade setName(String name) {
        this.name = name;
        return this;
    }
}
