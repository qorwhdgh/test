package kr.ac.kopo.bookshop.dao;

import java.util.List;

import kr.ac.kopo.bookshop.model.Orders;

public interface OrdersDao {

	List<Orders> list();

	void add(Orders item);

	Orders item(Long orderid);

	void update(Orders item);

	void delete(Long orderid);

}