package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 create table testa (
  key          char(16) primary key,
  val1        integer,
  val2        integer
);

 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "testa")
@Entity
public class TestaEntity {
    
    @Id
    private int key;

    private int val1;

    private int val2;

}
