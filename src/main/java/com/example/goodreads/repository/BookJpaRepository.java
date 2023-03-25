package com.example.goodreads.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.goodreads.model.Book;
import org.springframework.stereotype.Repository;
@Repository
public interface BookJpaRepository extends JpaRepository<Book,Integer>
{

}