package com.hibernate.HibernateLazyLoading.impl;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.HibernateLazyLoading.BookRepository;
import com.hibernate.HibernateLazyLoading.entity.Book;
import com.hibernate.HibernateLazyLoading.service.BookService;


@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StoryRepository storyRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Book saveBook(Book book) {
		book = bookRepository.save(book);
		return book;
	}

	public Book findByBookId(int bookId) {
		Optional<Book> bookResponse = bookRepository.findById(bookId);
		Book book = bookResponse.get();
		return book;
	}
}