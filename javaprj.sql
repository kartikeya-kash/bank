create database javaprj; -- created a database
use javaprj; -- using the database

create table user (
    user_id varchar(20) not null primary key,
    name varchar(60) not null,
    email varchar(256) not null unique,
    dob date not null,
    pass varchar(16) not null,
    phone bigint not null unique,
    address varchar(256) not null
);