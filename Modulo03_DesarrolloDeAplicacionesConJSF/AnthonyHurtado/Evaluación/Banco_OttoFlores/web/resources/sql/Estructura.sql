-- CREANDO LA BASE DE DATOS
DROP DATABASE IF EXISTS bank;
CREATE DATABASE bank DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
USE bank;

-- CREANDO LAS TABLAS
CREATE TABLE person (
    id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    ci INT(10) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    account INT(5) NOT NULL,
    balance DECIMAL(10,2) NOT NULL
) ENGINE=INNODB;

CREATE TABLE account (
    person_id INT(10) NOT NULL,
    account INT(5) NOT NULL,
    description VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE moves (
    origin_id INT(10) NOT NULL,
    destiny_id INT(10) NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    description VARCHAR(50) NOT NULL,
    type VARCHAR(1) NOT NULL
) ENGINE=INNODB;

-- RELACIONES
ALTER TABLE account ADD FOREIGN KEY (person_id) REFERENCES person (id);
ALTER TABLE moves ADD FOREIGN KEY (origin_id) REFERENCES person (id);
ALTER TABLE moves ADD FOREIGN KEY (destiny_id) REFERENCES person (id);

-- DATOS DE PRUEBA
INSERT INTO 
    person (first_name, last_name, ci, username, password, account, balance) 
    VALUES ("Otto", "Flores", 10345580, "oflores", "123456", 654321, 300.50);
INSERT INTO 
    person (first_name, last_name, ci, username, password, account, balance) 
    VALUES ("Anthony", "Hurtado", 19227055, "anhurtado", "123456", 12345, 100.45);
INSERT INTO 
    person (first_name, last_name, ci, username, password, account, balance) 
    VALUES ("Mirna", "Pico", 6078597, "mirnapico", "123456", 54321, 500.50);

INSERT INTO 
    account (person_id, account, description)
    VALUES (1, 654321, "Cuenta de Otto Flores");
INSERT INTO 
    account (person_id, account, description)
    VALUES (2, 54321, "Cuenta de Mirna Pico");
INSERT INTO 
    account (person_id, account, description)
    VALUES (3, 12345, "Cuenta de Anthony Hurtado");

INSERT INTO
    moves (origin_id, destiny_id, amount, description, type)
    VALUES (1, 2, 250.50, "Pago de Servicios", "T");
INSERT INTO
    moves (origin_id, destiny_id, amount, description, type)
    VALUES (1, 2, 250, "Pago de Servicios", "T");
INSERT INTO
    moves (origin_id, destiny_id, amount, description, type)
    VALUES (2, 1, 50.45, "Compra de Comida", "T");
INSERT INTO
    moves (origin_id, destiny_id, amount, description, type)
    VALUES (2, 1, 50, "Compra de Comida", "T");
INSERT INTO
    moves (origin_id, destiny_id, amount, description, type)
    VALUES (3, 1, 50.45, "Compra de Comida", "T");
INSERT INTO
    moves (origin_id, destiny_id, amount, description, type)
    VALUES (3, 2, 50, "Compra de Comida", "T"); 