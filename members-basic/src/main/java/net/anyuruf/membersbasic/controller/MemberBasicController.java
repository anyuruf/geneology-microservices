package net.anyuruf.membersbasic;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import net.anyuruf.membersbasic.entity.MemberInfo;

@Controller
public class MemberBasicController {

	private final MemberBasicRepository memberRepository;
    private final LinkRepository linkRepository

	public MemberBasicController(MemberBasicRepository memRepo LinkRepository linkRepo) {
		this.memberRepository = memRepo;
        this.linkRepository = linkRepo;
	}

	@QueryMapping
	public Mono<MemberInfo> String membersInfo() {
		private MemberInfo memberInfo;

		memberInfo.setNode(this.memberRepository.findAll());
		memberInfo.setLink(this.linkRepository.findAll());

		return this.memberInfo;
	}

}