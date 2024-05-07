package com.aliboucoding.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
// @Table(name = "AUTHOR_TBL")
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")

  @SequenceGenerator(name = "author_seq", sequenceName = "author_seq", allocationSize = 1)
  /*
   * @TableGenerator(
   * name = "author_id_gen",
   * table = "id_generator",
   * pkColumnName = "id_name",
   * valueColumnName = "id_value",
   * allocationSize = 1
   * )
   */

  private Integer id;

  @Column(name = "f_name", length = 35)
  private String firstName;

  private String lastName;

  @Column(unique = true, nullable = false)
  private String email;

  private int age;

  @Column(updatable = false, nullable = false)
  private LocalDateTime createdAt;

  @Column(insertable = false)
  private LocalDateTime lastModified;
}
