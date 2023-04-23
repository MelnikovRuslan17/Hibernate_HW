package ru.netology.hibernate_hw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate_hw.entity.Person;
import ru.netology.hibernate_hw.repository.GetRepository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class GetController {
    public final GetRepository getRepository;
    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city){
        return getRepository.getPersonByCityOfLiving(city);

    }
    @GetMapping("/by-age")
    public List<Person> getPersonByAge(@RequestParam int age){
        return getRepository.getPersonByAge(age);

    }
    @GetMapping("/by-name-surname")
    public Optional<Person> getPersonByNameAndSurname (@RequestParam String name, @RequestParam String surname) {
        return getRepository.getPersonByNameAndSurname(name, surname);

    }
}
