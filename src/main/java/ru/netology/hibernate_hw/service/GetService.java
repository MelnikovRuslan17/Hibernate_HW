package ru.netology.hibernate_hw.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernate_hw.entity.Person;

import java.util.List;


public interface GetService {
    List<Person> getPersonsByCity(String city);
}
