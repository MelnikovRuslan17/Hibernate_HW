package ru.netology.hibernate_hw.repository;

import ru.netology.hibernate_hw.entity.Person;

import java.util.List;

public interface GetRepository {
    List<Person> getPersonsByCity(String city);
}
