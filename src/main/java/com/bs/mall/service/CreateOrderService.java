package com.bs.mall.service;

import com.bs.mall.pojo.CreateOrder;
import com.bs.mall.pojo.ReceiveAddress;

public interface CreateOrderService {
	boolean addOrder(CreateOrder order);

	boolean addOrderAddress(ReceiveAddress address);
}
