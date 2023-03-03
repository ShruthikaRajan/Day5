package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;


@Service
public class ApiService {
	@Autowired
	BookRepo repository;
		public Optional<Book> getbook(int id){
			return repository.findById(id);
		}

		public String updateDetails(Book b) {
			repository.save(b);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}

}