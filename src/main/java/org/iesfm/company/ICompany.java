package org.iesfm.company;

import org.iesfm.company.exceptions.ClientNotFoundException;
import org.iesfm.company.exceptions.OrderNotFoundException;

import java.util.Set;
import java.util.TreeSet;

public interface ICompany {
    /**
     * Devuelve pedidos de un cliente segun su id.
     * @param id
     * @return pedidos del cliente dado.
     */
     Set<Order> getClientOrder(String id) throws ClientNotFoundException;

    /**
     * Dado cliente y numero pedido, devuelve el precio del mismo.
     * @param id
     * @param price
     * @return Precio del pedido del cliente.
     * @throws ClientNotFoundException Si no hay cliente se crea una excepcion.
     * @throws OrderNotFoundException Si no hay pedido se crea una excepcion.
     */
     int getOrderPrice(String id, int price) throws ClientNotFoundException, OrderNotFoundException;

    /**
     * Coge el id del cliente y devuelve los productos.
     * @param id
     * @return Productos del cliente dado.
     * @throws ClientNotFoundException
     */
     TreeSet<String> getClientProduct(String id) throws ClientNotFoundException;

    /**
     * Calcula la suma del total lo que se ha gastado el cliente.
     * @return
     * @throws ClientNotFoundException
     */
     int calculateTotalSpend ()throws ClientNotFoundException;

     Set<String> getClientNoOrderded();
}
