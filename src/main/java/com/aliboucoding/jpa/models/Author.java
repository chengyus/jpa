package com.aliboucoding.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// @Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {

  // @SequenceGenerator(name = "author_seq", sequenceName = "author_seq",
  // allocationSize = 1)
  /*
   * @TableGenerator(
   * name = "author_id_gen",
   * table = "id_generator",
   * pkColumnName = "id_name",
   * valueColumnName = "id_value",
   * allocationSize = 1
   * )
   */

  @Column(name = "f_name", length = 35)
  private String firstName;

  private String lastName;

  @Column(unique = true, nullable = false)
  private String email;

  private int age;

  @ManyToMany(mappedBy = "authors")
  private List<Course> courses;

  // @Column(updatable = false, nullable = false)
  // private LocalDateTime createdAt;

  // @Column(insertable = false)
  // private LocalDateTime lastModified;
}
