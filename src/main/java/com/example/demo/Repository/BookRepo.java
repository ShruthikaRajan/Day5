package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}