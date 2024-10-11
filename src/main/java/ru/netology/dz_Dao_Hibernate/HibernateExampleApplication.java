package ru.netology.dz_Dao_Hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.dz_Dao_Hibernate.repository.CustomizedCrudRepositoryPerson;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner {
    @Autowired
    private CustomizedCrudRepositoryPerson customizedCrudRepositoryPerson;


    public static void main(String[] args) {
        SpringApplication.run(HibernateExampleApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        var all = customizedCrudRepositoryPerson.findByCityOfLivingJPQL("22222222222");
        System.out.println(all);
    }


}