package ru.netology.hibernate_hw.repository;

import ru.netology.hibernate_hw.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GetRepositoryImpl implements GetRepository{
    @PersistenceContext
    private EntityManager entityManager;
    private static final String query = "SELECT Person.personPrimaryKey.name from Person p where p.city_of_living = :city";

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(query)
                .setParameter("city",city)
                .getResultList();
    }
}
