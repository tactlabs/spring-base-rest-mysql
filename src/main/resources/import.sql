--
--    Copyright 2015-2017 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

drop table if exists city;

create table city (id int primary key auto_increment, name varchar(100), state varchar(100), country varchar(100));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into city (name, state, country) values ('Chennai', 'TA', 'India');
insert into city (name, state, country) values ('Madurai', 'TA', 'India');
insert into city (name, state, country) values ('Bengalore', 'KA', 'India');

CREATE TABLE users
(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    salary float(10) DEFAULT NULL,
    PRIMARY KEY (id)
);


CREATE USER 'test'@'localhost' IDENTIFIED BY 'test';
GRANT ALL PRIVILEGES ON test . * TO 'test'@'localhost';