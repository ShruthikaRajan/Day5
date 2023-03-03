package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {

	 @Autowired
	  BookRepo serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/getbooks")
	   List<Book> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/postbook")
	  public Book create(@RequestBody Book b) {
		 return serviceRepository.save(b);
	 }
	 
	 @GetMapping("/getbooks/{id}")
	 public Optional<Book> getbyid(@PathVariable int id){
		
		return service.getBook(id);
	 }
	 
	 @PutMapping("/book")
	 public String update(@RequestBody Book b) {
		 return service.updateDetails(b);
	 }
	 
	 @DeleteMapping("/book/{id}")
	 public String delete(@PathVariable int id) {
		 return service.deleteDetails(id);
	 }
}