
drop table if exists users;
create table users (
  seq          SERIAL  primary key,
  email        char(100),
  passwd       char(100)
);

drop table if exists testa;
create table testa (
  key         SERIAL  primary key,
  val1        integer,
  val2        integer
);

drop table if exists testb;
create table testb (
  key         SERIAL  primary key,
  val1        integer,
  val2        integer,
  val3        integer,
  val4        integer
);
