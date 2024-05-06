package com.aliboucoding.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {

  @Id
  private Integer id;

  private String firstName;

  private String lastName;

  private String email;

  private int age;
}
