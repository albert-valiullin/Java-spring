create table Event(
     id int PRIMARY KEY,
     title VARCHAR(255) not null,
     place varchar(255),
     date Date);
create table Guest(
     id int PRIMARY KEY,
     name VARCHAR(255) not null);
create table "Order"(
     id int PRIMARY KEY auto_increment,
     eventID int not null,
     guestId int not null);

INSERT INTO Guest VALUES (1, 'Vasya');
INSERT INTO Guest VALUES (2, 'Gena');
INSERT INTO Guest VALUES (3, 'Steve');
INSERT INTO Event VALUES (1, 'First Event', 'Kazan', null);
INSERT INTO Event VALUES (2, 'Second Event', 'Oktyabrsky', null);
INSERT INTO "Order"(eventID, guestId) VALUES (1, 1);
INSERT INTO "Order"(eventID, guestId) VALUES (1, 3);
INSERT INTO "Order"(eventID, guestId) VALUES (2, 2);
