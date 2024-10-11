package ru.netology.dz_Dao_Hibernate.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.dz_Dao_Hibernate.entity.Person;

import java.util.List;

@Service
public class ServicePerson {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p.dataPerson from Person p where p.city_of_living = ?1")
                .setParameter(1, city)
                .getResultList();
    }

    @Transactional
    public List<String> getPersonsNameByCity(String city) {
        return entityManager.createQuery("select p.dataPerson.name from Person p where p.city_of_living = ?1")
                .setParameter(1, city)
                .getResultList();
    }

}
