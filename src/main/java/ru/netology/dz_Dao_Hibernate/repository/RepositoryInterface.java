package ru.netology.dz_Dao_Hibernate.repository;

import ru.netology.dz_Dao_Hibernate.entity.Person;

import java.util.List;

public interface RepositoryInterface {
    List<Person> getPersonsByCity(String city);
    List<String> getPersonsNameByCity(String city);
}
