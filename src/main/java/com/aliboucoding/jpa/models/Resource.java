package com.aliboucoding.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Resource extends BaseEntity {

  private String name;
  private int size;
  private String url;

  @OneToOne
  @JoinColumn(name = "lecture_id")
  private Lecture lecture;
}
