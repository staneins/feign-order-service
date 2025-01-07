package com.kaminsky.orderservice.repo;

import com.kaminsky.orderservice.entity.SavedOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<SavedOrder, Long> {
}
