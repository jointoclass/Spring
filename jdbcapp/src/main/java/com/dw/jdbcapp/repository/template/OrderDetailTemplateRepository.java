package com.dw.jdbcapp.repository.template;

import com.dw.jdbcapp.model.Order;
import com.dw.jdbcapp.repository.iface.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDetailTemplateRepository implements OrderRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Order> getAllOrders() {
        return List.of();
    }

    @Override
    public Order getOrderById(String orderNumber) {
        return null;
    }

    @Override
    public List<Order> getOrderByIdAndCustomer(int productNumber, String customerId) {
        return List.of();
    }
}
