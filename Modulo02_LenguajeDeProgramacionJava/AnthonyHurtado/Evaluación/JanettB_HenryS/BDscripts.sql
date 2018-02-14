 show databases;
 use test;
 create table usuario (tarjeta varchar(15), clave varchar(15));
 insert into usuario values('123123','123123');
 insert into usuario values('456456','456456');
 commit;
 create table cuenta (tarjeta varchar(15), saldo int(12.2));
 insert into cuenta values('123123',275000.50);
 insert into cuenta values('456456',500000);
 commit;
 Select * from usuario;
 Select * from cuenta;

