package com.axsos.LoginReg.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.LoginReg.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
public List<Book> findAll();
List<Book> findByborrow(boolean bul);
}
