CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE accounts (
  id INTEGER PRIMARY KEY,
  dni varchar (10),
  name varchar(255),
  balance decimal(15,2)
);
CREATE INDEX accounts_balance ON accounts(balance);