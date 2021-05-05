package org.iesfm.company;

import java.util.Objects;
import java.util.TreeSet;

public class Client {
    private String id;
    private String name;
    private String surname;
    private TreeSet<Order> orderHistory;

    public Client(String id, String name, String surname, TreeSet<Order> orderHistory) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.orderHistory = orderHistory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TreeSet<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(TreeSet<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(orderHistory, client.orderHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, orderHistory);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }
}
