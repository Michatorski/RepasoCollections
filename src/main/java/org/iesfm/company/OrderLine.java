package org.iesfm.company;

import java.util.Objects;

public class OrderLine {
    private int amount;
    private String name;
    private int price;

    public OrderLine(int amount, String name, int price) {
        this.amount = amount;
        this.name = name;
        this.price = price;
    }

    public int calculatePrice(){
        return amount * price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return amount == orderLine.amount &&
                price == orderLine.price &&
                Objects.equals(name, orderLine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, name, price);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
