package ru.netology.hibernate_hw.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernate_hw.entity.Person;
import ru.netology.hibernate_hw.repository.GetRepositoryImpl;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetServiceImpl implements GetService{
    public final GetRepositoryImpl repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
