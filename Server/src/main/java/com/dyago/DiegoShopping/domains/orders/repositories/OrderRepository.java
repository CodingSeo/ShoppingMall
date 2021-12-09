package com.dyago.DiegoShopping.domains.orders.repositories;


import com.dyago.DiegoShopping.domains.boards.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Board, Long> {
}
