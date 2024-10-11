package ru.netology.dz_Dao_Hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.dz_Dao_Hibernate.entity.DataPerson;
import ru.netology.dz_Dao_Hibernate.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomizedCrudRepositoryPerson extends JpaRepository<Person, DataPerson> {

    List<Person> findByCityOfLiving(String cityOfLiving);

    Optional<Person> findByCityOfLivingStartsWith(String cityOfLiving);

    @Query(value = "select p from Person p where p.phoneNumber = :phoneNumber ")
    Optional<Person> findByCityOfLivingJPQL(@Param("phoneNumber") String phoneNumber1);

}
