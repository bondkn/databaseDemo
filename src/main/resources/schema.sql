create table person(
id integer not null,
name varchar(255) not null,
emailid varchar(45),
birthdate timestamp,

primary key(id)
);

insert into person(id,name,emailid,birthdate)
values(1,'nawab','nawab@gmail.com',sysdate());

insert into person(id,name,emailid,birthdate)
values(2,'nawab2','nawab@gmail.com',sysdate());

insert into person(id,name,emailid,birthdate)
values(3,'nawab3','nawab@gmail.com',sysdate());

insert into person(id,name,emailid,birthdate)
values(4,'nawab4','nawab@gmail.com',sysdate());
