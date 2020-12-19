package com.sprintrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintrest.springrest.entities.Book;

public interface BookDao extends JpaRepository<Book, Long> {

}
