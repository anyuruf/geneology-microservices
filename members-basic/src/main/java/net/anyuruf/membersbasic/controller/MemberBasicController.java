package net.anyuruf.membersbasic.controller;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import net.anyuruf.membersbasic.service.MemberBasicRepository;
import net.anyuruf.membersbasic.service.LinkRepository;
import net.anyuruf.membersbasic.entity.MemberBasic;


@Controller
public class MemberBasicController {

	private final MemberBasicRepository memberRepository;
    private final LinkRepository linkRepository;

	public MemberBasicController(MemberBasicRepository memRepo, LinkRepository linkRepo) {
		this.memberRepository = memRepo;
        this.linkRepository = linkRepo;
	}

	@QueryMapping
	public Flux<MemberBasic> nodes() {
		return this.memberRepository.findAll();
	}

	@QueryMapping
	public Flux<MemberBasic> links() {
		return this.linkRepository.findAll();
	}


}