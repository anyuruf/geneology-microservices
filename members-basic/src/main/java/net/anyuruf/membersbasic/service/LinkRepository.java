package net.anyuruf.membersbasic;

import java.util.UUID;


import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import net.anyuruf.membersbasic.entity.Link;

interface LinkRepository extends ReactiveCassandraRepository<Link, UUID> { 
}