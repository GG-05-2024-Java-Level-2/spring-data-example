package net.groundgurus.level2.spring_data_example.dao;

import net.groundgurus.level2.spring_data_example.model.Person;
import org.springframework.data.repository.ListCrudRepository;

public interface PersonDao extends ListCrudRepository<Person, Integer> {

}
