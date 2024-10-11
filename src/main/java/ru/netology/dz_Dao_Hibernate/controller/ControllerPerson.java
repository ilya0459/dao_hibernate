package ru.netology.dz_Dao_Hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dz_Dao_Hibernate.entity.Person;
import ru.netology.dz_Dao_Hibernate.repository.RepositoryInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class ControllerPerson {

    private RepositoryInterface repositoryPerson;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return repositoryPerson.getPersonsByCity(city);
    }

    @GetMapping("/by-name")
    public List<String> getPersonsNameByCity(@RequestParam(value = "city", required = false) String city) {
        return repositoryPerson.getPersonsNameByCity(city);
    }

}
