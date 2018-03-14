# ************************************************************
# Sequel Pro SQL dump
# Versión 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.21)
# Base de datos: javacurso
# Tiempo de Generación: 2018-03-13 15:35:08 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Volcado de tabla ACCOUNT
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ACCOUNT`;

CREATE TABLE `ACCOUNT` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `accountnumber` text,
  `owner` varchar(45) DEFAULT NULL,
  `owner_id` varchar(45) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `ACCOUNT` WRITE;
/*!40000 ALTER TABLE `ACCOUNT` DISABLE KEYS */;

INSERT INTO `ACCOUNT` (`id`, `accountnumber`, `owner`, `owner_id`, `id_user`)
VALUES
	(1,'501878','jose luis','20000919',2),
	(2,'20001030','Enrique','2112232',2),
	(3,'7676767676','EVA UH AH AH','20088777',2),
	(7,'77777777','Pedro','1121212212',2);

/*!40000 ALTER TABLE `ACCOUNT` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla MOVEMENT
# ------------------------------------------------------------

DROP TABLE IF EXISTS `MOVEMENT`;

CREATE TABLE `MOVEMENT` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `movement_type` int(1) NOT NULL,
  `amount` double(10,2) DEFAULT '0.00',
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `MOVEMENT` WRITE;
/*!40000 ALTER TABLE `MOVEMENT` DISABLE KEYS */;

INSERT INTO `MOVEMENT` (`id`, `id_user`, `movement_type`, `amount`, `date`)
VALUES
	(26,2,1,12.00,'2018-02-11 00:32:38'),
	(27,2,2,12.00,'2018-02-11 00:32:42'),
	(28,2,1,34.00,'2018-02-11 00:32:48'),
	(29,2,2,12.00,'2018-02-11 00:44:17'),
	(30,2,2,12.00,'2018-02-11 00:44:21'),
	(31,2,1,55.00,'2018-02-11 00:47:10'),
	(32,2,2,10.00,'2018-03-11 00:25:13'),
	(33,2,2,5.00,'2018-03-11 00:29:41');

/*!40000 ALTER TABLE `MOVEMENT` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla USER
# ------------------------------------------------------------

DROP TABLE IF EXISTS `USER`;

CREATE TABLE `USER` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `card` varchar(5) NOT NULL DEFAULT '',
  `password` varchar(5) NOT NULL DEFAULT '',
  `name` varchar(20) DEFAULT '',
  `lastname` varchar(20) DEFAULT NULL,
  `address` text,
  `birthdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `USER` WRITE;
/*!40000 ALTER TABLE `USER` DISABLE KEYS */;

INSERT INTO `USER` (`id`, `card`, `password`, `name`, `lastname`, `address`, `birthdate`)
VALUES
	(2,'12345','java','ricardo','perez','CARACAS',NULL),
	(3,'98765','java2','pedro','Parare','Caracas',NULL);

/*!40000 ALTER TABLE `USER` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
