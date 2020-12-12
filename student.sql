
use projectdb;

create table studenttab(
id int PRIMARY KEY AUTO_INCREMENT,
sname varchar(20),
scourse varchar(30),
sfee int
);

insert into studenttab value(1,'Tom','English',99);
insert into studenttab value(2,'Alice','Physics',61);
select * from studenttab;
#select * from studenttab where id=1;

#drop table studenttab;