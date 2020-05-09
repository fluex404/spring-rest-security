package com.fluex404.springrestsecurity.repository;

import com.fluex404.springrestsecurity.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
