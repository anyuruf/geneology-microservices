package com.example.accessingdatacassandra;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Link {
  
  @PrimaryKey
  private UUID id;
  private String firstName;
  private String lastName;
  private LocalDate dob;
}