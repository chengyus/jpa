package com.aliboucoding.jpa.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Section extends BaseEntity {

  private String name;

  private int sectionOrder;

  @ManyToOne
  @JoinColumn(name = "course_id")
  private Course course;

  @OneToMany
  private List<Lecture> lectures;
}
