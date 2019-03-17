[![HitCount](http://hits.dwyl.io/teamtact/https://github.com/teamtact/spring-base-rest-mysql.svg)](http://hits.dwyl.io/teamtact/https://github.com/teamtact/spring-base-rest-mysql)

# spring-base-rest-mysql
Spring REST Boot with MySQL

```
CREATE USER tact WITH ENCRYPTED PASSWORD 'tact';
GRANT ALL PRIVILEGES ON DATABASE test TO tact;

CREATE TABLE CITY(
	ID SERIAL PRIMARY KEY,
	NAME VARCHAR(50),
	STATE VARCHAR(50),
	COUNTRY VARCHAR(50)
);
```
