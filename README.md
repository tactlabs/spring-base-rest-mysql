[![HitCount](http://hits.dwyl.io/teamtact/https://github.com/teamtact/spring-base-rest-mysql.svg)](http://hits.dwyl.io/teamtact/https://github.com/teamtact/spring-base-rest-mysql)

# spring-base-rest-mysql
Spring REST Boot with MySQL

```
drop table if exists city;

create table city (id int primary key auto_increment, name varchar(100), state varchar(100), country varchar(100));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into city (name, state, country) values ('Chennai', 'TA', 'India');
insert into city (name, state, country) values ('Madurai', 'TA', 'India');
insert into city (name, state, country) values ('Bengalore', 'KA', 'India');

CREATE USER 'test'@'localhost' IDENTIFIED BY 'test';
GRANT ALL PRIVILEGES ON test . * TO 'test'@'localhost';
```
