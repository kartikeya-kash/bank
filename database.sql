create database apexbms;
use apexbms;

create table user(
    userID varchar(256) primary key,
    firstName varchar(50) not null,
    lastName varchar(50) not null,
    phoneNo bigint not null,
    emailId varchar(256) not null,
    dob date not null,
    age int not null
);