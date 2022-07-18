import java.util.UUID;

import net.anyuruf.entity.Link

interface LinkRepository extends ReactiveCassandraRepository<Link, UUID> { 
}