package net.anyuruf.membersbasic;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MemberBasicController {

	private final MemberBasicRepository memberRepository;
    private final LinkRepository linkRepository

	public MemberBasicController(MemberBasicRepository memRepo LinkRepository linkRepo) {
		this.memberRepository = memRepo;
        this.linkRepository = linkRepo;
	}

	@QueryMapping
	public String membersInfo() {
		return this.repository.getBasic();
	}

}