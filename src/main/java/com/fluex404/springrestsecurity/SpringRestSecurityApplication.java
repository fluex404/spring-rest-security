package com.fluex404.springrestsecurity;

import com.fluex404.springrestsecurity.entity.Book;
import com.fluex404.springrestsecurity.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringRestSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(BookRepository bookRepository) {
		return args -> {
			List<Book> books = Arrays.asList(
					new Book(null,"A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")),
					new Book(null,"The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")),
					new Book(null,"Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99"))
			);
			bookRepository.saveAll(books);
		};
	}

}