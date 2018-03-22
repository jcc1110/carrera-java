-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 13-03-2018 a las 18:45:13
-- Versión del servidor: 5.0.45
-- Versión de PHP: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `mibanco`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tab_clientes`
-- 

CREATE TABLE `tab_clientes` (
  `fld_co_cliente` int(11) NOT NULL auto_increment,
  `fld_nombres` varchar(50) NOT NULL,
  `fld_apellidos` varchar(50) NOT NULL,
  `fld_direccion` varchar(100) NOT NULL,
  `fld_telefono` varchar(15) NOT NULL,
  PRIMARY KEY  (`fld_co_cliente`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `tab_clientes`
-- 

INSERT INTO `tab_clientes` VALUES (1, 'Johan Antonio', 'Bolívar Suárez', 'Av Andres Bello', '04142728893');
INSERT INTO `tab_clientes` VALUES (2, 'Georgina', 'Ascanio García', 'Catia', '04242754328');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tab_ctas_afiliadas`
-- 

CREATE TABLE `tab_ctas_afiliadas` (
  `fld_co_cuenta` int(11) NOT NULL auto_increment,
  `fld_num_cta` varchar(20) NOT NULL,
  `fld_nombre` varchar(50) NOT NULL,
  `fld_cedula` varchar(12) NOT NULL,
  `fld_correo` varchar(50) NOT NULL,
  `fld_co_cliente` int(11) NOT NULL,
  PRIMARY KEY  (`fld_co_cuenta`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

-- 
-- Volcar la base de datos para la tabla `tab_ctas_afiliadas`
-- 

INSERT INTO `tab_ctas_afiliadas` VALUES (1, '8388607', 'Johan Bolívar', '15208801', 'johan92@hotmail.com', 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tab_login`
-- 

CREATE TABLE `tab_login` (
  `fld_co_login` int(11) NOT NULL auto_increment,
  `fld_usuario` varchar(15) NOT NULL,
  `fld_clave` varchar(15) NOT NULL,
  `fld_co_cliente` int(11) NOT NULL,
  `fld_saldo` double NOT NULL,
  PRIMARY KEY  (`fld_co_login`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `tab_login`
-- 

INSERT INTO `tab_login` VALUES (1, '15208801', '1234', 1, 0);
INSERT INTO `tab_login` VALUES (2, '20128767', '1234', 2, 0);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tab_movimientos`
-- 

CREATE TABLE `tab_movimientos` (
  `fld_co_movimiento` int(11) NOT NULL auto_increment,
  `fld_tipo` varchar(1) NOT NULL,
  `fld_monto` double NOT NULL,
  `fld_co_cliente` int(11) NOT NULL,
  `fld_co_cuenta` int(11) NOT NULL,
  `fld_concepto` varchar(100) NOT NULL,
  PRIMARY KEY  (`fld_co_movimiento`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `tab_movimientos`
-- 

INSERT INTO `tab_movimientos` VALUES (1, 'D', 10000, 1, 1, 'personal');
INSERT INTO `tab_movimientos` VALUES (2, 'C', 100000, 1, 1, 'PAgo');
