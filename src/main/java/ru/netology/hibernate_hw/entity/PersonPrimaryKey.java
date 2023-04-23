package ru.netology.hibernate_hw.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonPrimaryKey implements Serializable {
    @Id
    @Column
    private String name;
    @Id
    @Column
    private String surname;
    @Id
    @Column
    private int age;
    @Column(name = "phoneOfNumber")
    private String phoneNumber;
    @Column(name = "cityOfLiving")
    private String city;

}
