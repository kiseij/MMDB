CREATE SEQUENCE "SYSTEM_SEQUENCE_182D931F_4977_4DA8_AB7D_A2DF99862FFA"
MINVALUE 1
MAXVALUE 999999999
INCREMENT BY 1
START WITH 1
NOCACHE
NOCYCLE;

CREATE TABLE PUBLIC.GENRES (
	ID INTEGER DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_182D931F_4977_4DA8_AB7D_A2DF99862FFA) NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(50)
);

insert into genres (id, name) values (1, 'Action|Crime|Drama');
insert into genres (id, name) values (2, 'Comedy|Drama|Fantasy');
insert into genres (id, name) values (3, 'Horror|Sci-Fi|Thriller');
insert into genres (id, name) values (4, 'Drama|Romance');
insert into genres (id, name) values (5, 'Comedy|Horror|Musical');
insert into genres (id, name) values (6, '(no genres listed)');
insert into genres (id, name) values (7, 'Documentary');
insert into genres (id, name) values (8, 'Crime|Drama|Mystery');
insert into genres (id, name) values (9, 'Drama|War');
insert into genres (id, name) values (10, 'Documentary');
insert into genres (id, name) values (11, 'Comedy|Romance');
insert into genres (id, name) values (12, 'Western');
insert into genres (id, name) values (13, 'Comedy|Musical');
insert into genres (id, name) values (14, 'Drama|War');
insert into genres (id, name) values (15, 'Drama|Romance|War');
insert into genres (id, name) values (16, 'Crime|Drama');
insert into genres (id, name) values (17, 'Drama|Romance');
insert into genres (id, name) values (18, 'Comedy|Romance');
insert into genres (id, name) values (19, 'Drama|War');
insert into genres (id, name) values (20, 'Drama|War');
