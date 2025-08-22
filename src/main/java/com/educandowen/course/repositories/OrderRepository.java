package com.educandowen.course.repositories;

import com.educandowen.course.entities.Order;
import com.educandowen.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
