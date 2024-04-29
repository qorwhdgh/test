package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Customer;

public interface CustomerService {

	List<Customer> list();

	void add(Customer item);

	Customer item(Long custid);

	void update(Customer item);

	void delete(Long custid);

	
}
