CREATE SEQUENCE "SYSTEM_SEQUENCE_75887DA1_2891_45E8_BFD0_B1A3225221C2"
MINVALUE 1
MAXVALUE 999999999
INCREMENT BY 1
START WITH 1
NOCACHE
NOCYCLE;

CREATE TABLE PUBLIC.DIRECTORS (
	ID INTEGER DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_75887DA1_2891_45E8_BFD0_B1A3225221C2) NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(50)
);

insert into directors (id, name) values (1, 'Griffin Brookes');
insert into directors (id, name) values (2, 'Erroll Wellwood');
insert into directors (id, name) values (3, 'Grove Hendrichs');
insert into directors (id, name) values (4, 'Worthy Woakes');
insert into directors (id, name) values (5, 'Karyn Foulis');
insert into directors (id, name) values (6, 'Gladys Farrey');
insert into directors (id, name) values (7, 'Marieann Lintot');
insert into directors (id, name) values (8, 'Zorana MacGille');
insert into directors (id, name) values (9, 'Normie Durban');
insert into directors (id, name) values (10, 'Sari Lopes');
insert into directors (id, name) values (11, 'Rodolfo Medlicott');
insert into directors (id, name) values (12, 'Richmound Veregan');
insert into directors (id, name) values (13, 'Tobias Bellee');
insert into directors (id, name) values (14, 'Kerk Janouch');
insert into directors (id, name) values (15, 'Ware Dumbrill');
insert into directors (id, name) values (16, 'Pammi Dictus');
insert into directors (id, name) values (17, 'Angelique Melchior');
insert into directors (id, name) values (18, 'Meryl Mignot');
insert into directors (id, name) values (19, 'Nanon Longhirst');
insert into directors (id, name) values (20, 'Amalea Hodjetts');
