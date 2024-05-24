package com.aliboucoding.jpa.repositories;

import com.aliboucoding.jpa.models.Author;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
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
