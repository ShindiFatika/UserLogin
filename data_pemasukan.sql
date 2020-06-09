-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2020 at 02:58 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_pemasukan`
--

-- --------------------------------------------------------

--
-- Table structure for table `pemasukan`
--

CREATE TABLE `pemasukan` (
  `Tanggal` date NOT NULL,
  `Nama` varchar(25) CHARACTER SET latin1 NOT NULL,
  `Menu makanan` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Banyaknya makan` int(10) NOT NULL,
  `Menu minuman` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Banyaknya minum` int(10) NOT NULL,
  `Total` int(30) NOT NULL,
  `Pembayaran` int(30) NOT NULL,
  `Kembalian` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemasukan`
--

INSERT INTO `pemasukan` (`Tanggal`, `Nama`, `Menu makanan`, `Banyaknya makan`, `Menu minuman`, `Banyaknya minum`, `Total`, `Pembayaran`, `Kembalian`) VALUES
('2020-01-01', 'shindi', 'bakso biasa', 1, 'Es teh', 1, 11500, 12000, 500);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
