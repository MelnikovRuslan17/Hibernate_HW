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
    private String phoneOfNumber;
    private String cityOfLiving;
}
