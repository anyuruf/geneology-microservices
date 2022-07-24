package net.anyuruf.membersbasic.service;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import java.util.UUID;

import net.anyuruf.membersbasic.entity.MemberBasic;

public interface MemberBasicRepository extends ReactiveCassandraRepository<MemberBasic, UUID> { 
}