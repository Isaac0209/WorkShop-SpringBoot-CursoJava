package com.isaac.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaac.course.entities.OrderItem;
import com.isaac.course.entities.pk.OrdemItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK> {

}
