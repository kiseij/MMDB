CREATE SEQUENCE "SYSTEM_SEQUENCE_298BF5A8_AD6C_4FEB_B1D2_C110C9720579"
MINVALUE 1
MAXVALUE 999999999
INCREMENT BY 1
START WITH 1
NOCACHE
NOCYCLE;

CREATE TABLE PUBLIC.MOVIES (
	ID INTEGER DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_298BF5A8_AD6C_4FEB_B1D2_C110C9720579) NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(50) NOT NULL,
	"YEAR" VARCHAR(50),
	GENRE_ID INTEGER,
	DIRECTOR_ID INTEGER
);

insert into movies (id, name, `year`, genre_id, director_id) values (1, 'As Luck Would Have It (Chispa de la vida, La)', 2007, 1, 1);
insert into movies (id, name, `year`, genre_id, director_id) values (2, 'Caliber 9', 2007, 2, 2);
insert into movies (id, name, `year`, genre_id, director_id) values (3, 'Green Years, The', 1992, 3, 3);
insert into movies (id, name, `year`, genre_id, director_id) values (4, 'Identity Thief', 2012, 4, 4);
insert into movies (id, name, `year`, genre_id, director_id) values (5, 'Communion', 2001, 5, 5);
insert into movies (id, name, `year`, genre_id, director_id) values (6, 'I Shot a Man in Vegas', 2007, 6, 6);
insert into movies (id, name, `year`, genre_id, director_id) values (7, 'Beyond the Law (Lain ulkopuolella)', 2007, 7, 7);
insert into movies (id, name, `year`, genre_id, director_id) values (8, 'Order, The', 1993, 8, 8);
insert into movies (id, name, `year`, genre_id, director_id) values (9, 'Big Trail, The', 2008, 9, 9);
insert into movies (id, name, `year`, genre_id, director_id) values (10, 'Let''s Not Keep in Touch!', 1996, 10, 10);
insert into movies (id, name, `year`, genre_id, director_id) values (11, 'Paragraph 175', 2010, 11, 11);
insert into movies (id, name, `year`, genre_id, director_id) values (12, 'Lightning Strikes Twice', 2004, 12, 12);
insert into movies (id, name, `year`, genre_id, director_id) values (13, 'Everybody''s Fine', 2006, 13, 13);
insert into movies (id, name, `year`, genre_id, director_id) values (14, 'Die Frau des Frisörs', 2007, 14, 14);
insert into movies (id, name, `year`, genre_id, director_id) values (15, 'Nocturna Artificialia', 1994, 15, 15);
insert into movies (id, name, `year`, genre_id, director_id) values (16, 'Love Is the Devil', 1989, 16, 16);
insert into movies (id, name, `year`, genre_id, director_id) values (17, 'A True Mob Story', 2000, 17, 17);
insert into movies (id, name, `year`, genre_id, director_id) values (18, 'Boy, Did I Get a Wrong Number!', 2011, 18, 18);
insert into movies (id, name, `year`, genre_id, director_id) values (19, 'Devil''s Brigade, The', 2007, 19, 19);
insert into movies (id, name, `year`, genre_id, director_id) values (20, 'Beautiful Joe', 2011, 20, 20);

