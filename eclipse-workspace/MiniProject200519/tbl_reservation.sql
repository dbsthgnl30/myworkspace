create table customer (
id varchar2(21),
pwd varchar2(21),
name varchar2(21),
tel varchar2(21),
constraint pk_customer_id primary key(id)
)

create table movie(
mvNo varchar2(12),
title varchar2(21),
dir varchar2(21),
act varchar2(50),
genre varchar2(21),
age varchar2(12),
playTime varchar2(12),
constraint pk_movie_mvNO primary key(mvNO)
)

select * from movie

create rsv(
id varchar2(21),
mvNo varchar2(12),
theater varchar2(21),
day varchar2(21),
startTime varchar2(21),
num number(2),
constraint fk_rsv_id foreign key(did) reference customer(id)
)

create pay(
paymentMethod varchar2(12),
total number(7)
)

insert into movie (mvNO,title,dir,act,genre,age,playTime) values ('m001','신세계','박훈정','이정재,최민식','범죄,드라마','19금','134분')
insert into movie (mvNO,title,dir,act,genre,age,playTime) values ('m002','기생충','봉준호','송강호,조여정','범죄,드라마','15세','131분')
insert into movie (mvNO,title,dir,act,genre,age,playTime) values ('m003','타짜1','최동훈','조승우,김혜수','범죄,드라마','19세','139분')

insert into rsv (theater,day,startTime) values('서울역','20일','1시')
insert into rsv (theater,day,startTime) values('서울역','20일','3시')
insert into rsv (theater,day,startTime) values('서울역','20일','5시')
insert into rsv (theater,day,startTime) values('서울역','20일','7시')
insert into rsv (theater,day,startTime) values('서울역','21일','1시')

select * from 