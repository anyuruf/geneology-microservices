import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import java.util.UUID;

import net.anyuruf.entity.MemberBasic

interface MemberBasicRepository extends ReactiveCassandraRepository<MemberBasic, UUID> { 
}