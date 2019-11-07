package com.bs.mall.dao;

import java.util.List;

import com.bs.mall.pojo.Cart;

public interface CartDao {
	List<Cart> referCartByUserId(Integer userId);
	Integer addCart(List<Cart>Carts);
	
	Integer delCart(Integer userId);

}
