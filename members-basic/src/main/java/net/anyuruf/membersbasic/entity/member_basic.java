package com.example.accessingdatacassandra;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class MemberBasic {
  
  @PrimaryKey
  private UUID id;
  private String firstName;
  private String lastName;
  private LocalDate dob;
  private Set<UUID> children;

  
  public MemberBasic(UUID id, String firstName, String lastName, Set<UUID> children) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.children = children;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Set<String> getChildren() {
    return children;
  }

  public void setSpecialties(Set<UUID> children) {
    this.children = children;
  }
}