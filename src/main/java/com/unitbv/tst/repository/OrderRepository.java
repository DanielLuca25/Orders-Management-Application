package com.unitbv.tst.repository;

import com.unitbv.tst.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	List<Order> findByCustomerIdOrderByDate(Integer customerId);

}
