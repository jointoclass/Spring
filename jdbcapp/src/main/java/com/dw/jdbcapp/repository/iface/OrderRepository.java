package com.dw.jdbcapp.repository.iface;

import com.dw.jdbcapp.model.Order;

import java.util.List;

public interface OrderRepository {
    public List<Order> getAllOrders();
    public Order getOrderById(String orderNumber);
    public List<Order> getOrderByIdAndCustomer(int productNumber, String customerId);
}
