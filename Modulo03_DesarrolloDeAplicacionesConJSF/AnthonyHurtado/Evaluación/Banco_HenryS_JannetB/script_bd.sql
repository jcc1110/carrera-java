create database e_cajero_bd;

use e_cajero_bd;

create table usuario(
  usr_id 	varchar(12) 	not null,
  usr_cedula 	varchar(12) 	not null,
  nombre 	varchar(120) 	not null,
  usr_clave 	varchar(12)		,
  primary key(usr_id)
 );

create table cuenta(
  cta_tipo 	varchar(20) 	not null,
  cta_nombre 	varchar(120) 	not null,
  primary key(cta_tipo)
 );

create table movimiento(
  usr_id 	varchar(12) 	not null,
  cta_tipo 	varchar(20) 	not null,
  fecha 	datetime	not null,
  monto 	decimal (12,2)		,
  saldo 	decimal (12,2)		,
  primary key(usr_id,cta_tipo,fecha)
 );

create table afiliacion(
  usr_id 	varchar(12) 	not null,
  cta_tipo 	varchar(20) 	not null,
  nro_cuenta	varchar(20)	not null,
  banco		varchar(60)	not null,
  nombre	varchar(60)	not null,
  primary key(usr_id,cta_tipo,nro_cuenta)
 );

ALTER TABLE movimiento
ADD CONSTRAINT Usr_id_FK FOREIGN KEY (usr_id) REFERENCES usuario (usr_id) ON DELETE CASCADE ON UPDATE CASCADE
; 

ALTER TABLE movimiento
ADD CONSTRAINT cta_tipo_FK FOREIGN KEY (cta_tipo) REFERENCES cuenta (cta_tipo) ON DELETE CASCADE ON UPDATE CASCADE
; 

