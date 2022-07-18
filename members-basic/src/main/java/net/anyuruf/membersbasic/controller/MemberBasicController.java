package net.anyuruf.membersbasic;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MemberBasicController {

	private final MemberBasicRepository memberRepository;
    private final LinkRepository linkRepository

	public SampleController(DataRepository dataRepository) {
		this.repository = dataRepository;
	}

	@QueryMapping
	public String greeting() {
		return this.repository.getBasic();
	}

	@QueryMapping
	public Mono<String> greetingMono() {
		return this.repository.getGreeting();
	}

	@QueryMapping
	public Flux<String> greetingsFlux() {
		return this.repository.getGreetings();
	}

	@SubscriptionMapping
	public Flux<String> greetings() {
		return this.repository.getGreetingsStream();
	}

}