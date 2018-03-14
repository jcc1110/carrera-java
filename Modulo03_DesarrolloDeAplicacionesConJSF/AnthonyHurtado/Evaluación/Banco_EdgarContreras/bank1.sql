-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 13, 2018 at 03:20 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank1`
--

-- --------------------------------------------------------

--
-- Table structure for table `afiliados`
--

CREATE TABLE `afiliados` (
  `id_usuario` int(11) DEFAULT NULL,
  `nombre` varchar(19) DEFAULT NULL,
  `cedula` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `afiliados`
--

INSERT INTO `afiliados` (`id_usuario`, `nombre`, `cedula`) VALUES
(1, 'Anthony Hurtado', '21617589.00'),
(2, 'Edgar Contreras', '27615106.00'),
(1, NULL, '0.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(1, NULL, '0.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(1, NULL, '0.00'),
(1, NULL, '0.00'),
(1, NULL, '0.00'),
(1, NULL, '0.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(1, NULL, '0.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(2, 'Edgar Contreras', '27615106.00'),
(1, 'Anthony Hurtado', '21617589.00'),
(2, 'Edgar Contreras', '27615106.00'),
(1, 'Anthony Hurtado', '21617589.00');

-- --------------------------------------------------------

--
-- Table structure for table `movimiento`
--

CREATE TABLE `movimiento` (
  `id_usuario` int(11) DEFAULT NULL,
  `tipo_movimiento` varchar(12) DEFAULT NULL,
  `monto` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movimiento`
--

INSERT INTO `movimiento` (`id_usuario`, `tipo_movimiento`, `monto`) VALUES
(1, 'Credito', '200.00'),
(1, 'Debito', '100.00'),
(1, 'Credito', '1100.00'),
(2, 'Credito', '2000.00'),
(2, 'Debito', '1000.00'),
(2, 'Credito', '1000.00');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `tarjeta` varchar(5) DEFAULT NULL,
  `clave` varchar(5) DEFAULT NULL,
  `saldo` decimal(10,2) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `cedula` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `tarjeta`, `clave`, `saldo`, `nombre`, `cedula`) VALUES
(1, '12345', '12345', '1200.00', 'Edgar Contreras', 27615106),
(2, '54321', '12345', '1500.00', 'Anthony Hurtado', 21617589);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
