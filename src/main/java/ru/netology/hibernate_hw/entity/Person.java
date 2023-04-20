package ru.netology.hibernate_hw.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;
    private String phone_of_number;
    private String city_of_living;
}
