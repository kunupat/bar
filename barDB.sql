CREATE DATABASE "BarDB"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


CREATE TABLE movies(
   movie_id serial PRIMARY KEY,
   movie_name VARCHAR (50) NOT NULL,
   release_year VARCHAR (4) NOT NULL
);
commit;

insert into movies (movie_name, release_year) values('The Shawshank Redemption','1994');
insert into movies (movie_name, release_year) values('Se7en','1995');
insert into movies (movie_name, release_year) values('Fight Club','1999');
commit;