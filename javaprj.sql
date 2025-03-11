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

create table account( --bank account
    account_no varchar(50) not null primary key,
    user_id varchar(20) not null, -- FK
    bank varchar(20) not null,
    balance int not null,
    account_type varchar(20) not null,
    foreign key (user_id) references user(user_id)
);

create table cards(
    card_id varchar(20) primary key,
    account_no varchar(50) not null ,
    cvv int not null,
    expiry date not null,
    card_type varchar(20) not null,
    card_no bigint not null unique,
    foreign key (account_no) references account(account_no)
);

