package com.dyago.DiegoShopping.domains.users.repositories;


import com.dyago.DiegoShopping.domains.boards.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Board, Long> {
}
