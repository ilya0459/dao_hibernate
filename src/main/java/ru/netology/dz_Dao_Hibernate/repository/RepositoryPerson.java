package ru.netology.dz_Dao_Hibernate.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.dz_Dao_Hibernate.entity.Person;
import ru.netology.dz_Dao_Hibernate.service.ServicePerson;

import java.util.List;

@Repository
@AllArgsConstructor
public class RepositoryPerson implements RepositoryInterface {
    private ServicePerson servicePerson;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return servicePerson.getPersonsByCity(city);
    }

    @Override
    public List<String> getPersonsNameByCity(String city) {
        return servicePerson.getPersonsNameByCity(city);
    }

}
