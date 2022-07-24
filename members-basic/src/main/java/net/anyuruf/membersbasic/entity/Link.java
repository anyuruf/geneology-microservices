package net.anyuruf.membersbasic.entity;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import net.anyuruf.membersbasic.entity.ParentEnum.Parent;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Link {
  
  @PrimaryKey
  private UUID id;
  private UUID source;
  private UUID target;
  private Parent parent;
}