package net.anyuruf.membersbasic;

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
public class MemberBasic {
  
  @PrimaryKey
  private UUID id;
  private String firstName;
  private String lastName;
  private Gender gender;
  private LocalDate dob;
}