package net.anyuruf.membersbasic.service;

import java.util.UUID;


import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import net.anyuruf.membersbasic.entity.Link;

public interface LinkRepository extends ReactiveCassandraRepository<Link, UUID> { 
}