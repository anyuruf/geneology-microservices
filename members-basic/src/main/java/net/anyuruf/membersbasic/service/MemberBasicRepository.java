import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import java.util.UUID;

interface MemberBasicRepository extends ReactiveCassandraRepository<MemberBasic, UUID> { 
}