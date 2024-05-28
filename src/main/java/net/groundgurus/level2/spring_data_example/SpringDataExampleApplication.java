package net.groundgurus.level2.spring_data_example;

import net.groundgurus.level2.spring_data_example.dao.PersonDao;
import net.groundgurus.level2.spring_data_example.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDataExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(PersonDao personDao) {
        return args -> {
            var people = List.of(
                    new Person(1, "Dean", "Winchester"),
                    new Person(2, "Sam", "Winchester"),
                    new Person(3, "Castiel", ""),
                    new Person(4, "Bobby", "Singer"),
                    new Person(5, "Rufus", "Turner")
            );
            personDao.saveAll(people);
            personDao.findAll()
                    .forEach(System.out::println);
        };
    }
}
