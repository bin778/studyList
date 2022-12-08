create database test;
use test;

create table tb_user (
	user_idx bigint primary key auto_increment,
    user_email varchar(50) not null,
	user_pw varchar(100) not null
);

-- Create --
/*주석*/
insert into tb_user (user_email, user_pw) values ("test@test.com", "test");
insert into tb_user (user_email, user_pw) values ("test2@test.com", "test");
insert into tb_user (user_email, user_pw) values ("test3@test.com", "test");

select * from tb_user;
select * from tb_user where user_email = "test2@test.com";
select user_pw from tb_user;
select user_pw, user_email from tb_user;

update tb_user set USER_EMAIL  = "test4@test.com" where user_idx = 3;
delete from tb_user where user_idx = 1;