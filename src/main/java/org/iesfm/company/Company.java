package org.iesfm.company;

import org.iesfm.company.exceptions.ClientNotFoundException;
import org.iesfm.company.exceptions.OrderNotFoundException;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Company implements ICompany{
    private String name;
    private String cif;
    private Map <String, Client> clients;

    public Company(String name, String cif, Map<String, Client> clients) {
        this.name = name;
        this.cif = cif;
        this.clients = clients;
    }

    @Override
    public Set<Order> getClientOrder(String id) throws ClientNotFoundException {
        if(!clients.containsKey(id)){
            throw new ClientNotFoundException();
        }
        return clients.get(id).getOrderHistory();

    }

    @Override
    public int getOrderPrice(String id, int numOrder) throws ClientNotFoundException, OrderNotFoundException {
        Set <Order> orders = getClientOrder(id);

        Order customerOrder = null;

        for (Order order: orders){
            if (order.getNumOrder()==numOrder){
                customerOrder = order;
            }
        }
        if(customerOrder == null){
            throw new OrderNotFoundException();
        }
        return customerOrder.price();
    }

    @Override
    public TreeSet<String> getClientProduct(String id) throws ClientNotFoundException {
        return null;
    }

    @Override
    public int calculateTotalSpend() throws ClientNotFoundException {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Map<String, Client> getClients() {
        return clients;
    }

    public void setClients(Map<String, Client> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(cif, company.cif) &&
                Objects.equals(clients, company.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, clients);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", clients=" + clients +
                '}';
    }


}
