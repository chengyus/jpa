package com.aliboucoding.jpa.repositories;

import com.aliboucoding.jpa.models.Author;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

  @Transactional
  List<Author> findByNamedQuery(@Param("age") int age);

  @Modifying
  @Transactional
  void updateByNamedQuery(@Param("age") int age);

  @Modifying
  @Transactional
  @Query("update Author a set a.age = :age where a.id = :id")
  int updateAuthor(int age, int id);

  @Modifying
  @Transactional
  @Query("update Author a set a.age = :age")
  void updateAllAuthorsAges(int age);

  // select * from author where first_name = 'ali'
  List<Author> findAllByFirstName(String fn);

  // select * from author where first_name ILIKE 'al'
  List<Author> findAllByFirstNameIgnoreCase(String fn);

  // select * from author where first_name ILIKE '%al%'
  List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

  // select * from author where first_name ILIKE 'al%'
  List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

  // select * from author where first_name ILIKE '%al'
  List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

  // Select * from author where firstname IN ('ali', 'bou', 'coding')
  List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
