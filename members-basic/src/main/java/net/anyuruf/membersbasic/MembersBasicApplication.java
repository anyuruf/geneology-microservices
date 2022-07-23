package net.anyuruf.membersbasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;
import java.util.Set;
import java.time.LocalDate;
import java.time.Month;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.anyuruf.membersbasic.service.MemberBasicRepository;
import net.anyuruf.membersbasic.entity.Gender;

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
      
      MemberBasic john = new MemberBasic(UUID.randomUUID(), "Jenesio Omodo", "Anyuru", Gender.MALE, LocalDate.of(1927, Month.NOVEMBER, 11));
      MemberBasic jane = new MemberBasic(UUID.randomUUID(), "Anna Mary", "Kababito", Gender.FEMALE, LocalDate.of(1957, Month.APRIL, 22));
      MemberBasic francis = new MemberBasic(UUID.randomUUID(), "Francis", "Anyuru", Gender.MALE, LocalDate.of(1981, Month.OCTOBER, 28));
      MemberBasic paul = new MemberBasic(UUID.randomUUID(), "Paul", "Atim", Gender.MALE, LocalDate.of(1983, Month.APRIL, 11));

      Set<MemberBasic> members = Set.of(john, jane, francis, paul);

      return args -> {
        repository
                .deleteAll() 
                .thenMany(
                        Flux
                                .just(members)
                                .flatMap(repository::saveAll)
                )
                .thenMany(repository.findAll())
                .subscribe(memberBasic -> log.info("saving " + memberBasic.toString())); 
      };



    };
  }

}
