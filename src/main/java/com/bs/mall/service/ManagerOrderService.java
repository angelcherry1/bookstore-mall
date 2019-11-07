package com.bs.mall.service;

import java.util.List;

import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderDetail;

public interface ManagerOrderService {
	List<Order> getOrderByUserIds(Integer userId);
	boolean updateOrders(String orderId,String orderStatus);
	OrderDetail getOrderDetails(String orderId, Integer userId);
	List<Order> getOrderNoComment(Integer userId);
}
