package ru.netology.hibernate_hw.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.hibernate_hw.entity.Person;
import ru.netology.hibernate_hw.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

public interface GetRepository extends CrudRepository<Person, PersonPrimaryKey> {
    public List<Person> getPersonByCityOfLiving(String city);
    public List<Person> getPersonByAge(int age);
    public Optional<Person> getPersonByNameAndSurname(String name, String surname);
}
