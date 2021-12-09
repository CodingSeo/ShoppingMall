package com.dyago.DiegoShopping.domains.boards.repositories;


import com.dyago.DiegoShopping.domains.boards.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
