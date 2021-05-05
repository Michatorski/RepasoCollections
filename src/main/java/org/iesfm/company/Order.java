package org.iesfm.company;

import java.time.LocalDateTime;
import java.util.List;

public class Order implements Comparable <Order>{
    private int numOrder;
    private LocalDateTime date;
    private List<OrderLine> orderLines;

    public Order(int numOrder, LocalDateTime date, List<OrderLine> orderLines) {
        this.numOrder = numOrder;
        this.date = date;
        this.orderLines = orderLines;
    }

    public int price(){
        int finalPrice = 0;

        for(OrderLine orderLine : orderLines){
            finalPrice = finalPrice + orderLine.calculatePrice();
        }

        return  finalPrice;
    }

   @Override
    public int compareTo(Order o){

        return date.compareTo(o.date);
    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<OrderLine> getItems() {
        return orderLines;
    }

    public void setItems(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Order order = (Order) object;
        return numOrder == order.numOrder && java.util.Objects.equals(date, order.date) && java.util.Objects.equals(orderLines, order.orderLines);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), numOrder, date, orderLines);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Order{" +
                "numOrder=" + numOrder +
                ", date=" + date +
                ", orderLines=" + orderLines +
                '}';
    }
}
