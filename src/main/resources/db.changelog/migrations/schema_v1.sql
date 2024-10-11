--liquibase formatted sql

--name: 1

create table if not exists migration.person
(
name varchar(50) not null,
surname varchar(100) not null,
age int not null and age > 0 and age < 150,
phone_number varchar(30),
city_of_living varchar(100) not null,
primary key(name, surname, age)
);