package com.hibernate.HibernateLazyLoading.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends CrudRepository<Book,Serializable> {
	public Book findByBookId(int bookId);
}