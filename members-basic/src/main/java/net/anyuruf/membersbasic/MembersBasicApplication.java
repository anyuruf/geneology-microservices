package net.anyuruf.membersbasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MembersBasicApplication {

	private final static Logger log = LoggerFactory.getLogger(MembersBasicApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MembersBasicApplication.class, args);
	}

	@Bean
  	public CommandLineRunner clr(MemberBasicRepository memberRepository) {
    return args -> {
      memberRepository.deleteAll();
      
      MemberBasic john = new MemberBasic(UUID.randomUUID(), "Jenesio Omodo", "Anyuru", LocalDate.of(1927, Month.NOVEMBER, 11), new HashSet<>());
      MemberBasic jane = new MemberBasic(UUID.randomUUID(), "Anna Mary", "Kababito", new HashSet<>());
      
      MemberBasic savedJohn = memberRepository.save(john);
      MemberBasic savedJane = memberRepository.save(jane);

      memberRepository.findAll()
        .forEach(v -> log.info("Vet: {}", v.getFirstName()));
      
      memberRepository.findById(savedJohn.getId())
        .ifPresent(v -> log.info("Vet by id: {}", v.getFirstName()));
    };
  }

}
