package ru.netology.hibernate_hw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate_hw.entity.Person;
import ru.netology.hibernate_hw.service.GetServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class GetController {
    public final GetServiceImpl service;
    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city")String city){
        return service.getPersonsByCity(city);
    }

}
