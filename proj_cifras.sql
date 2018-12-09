-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Dez-2018 às 21:59
-- Versão do servidor: 10.1.30-MariaDB
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
-- Database: `proj_cifras`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Giovanny', 'geovanny@hotmail.com', '12345');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cifras`
--

CREATE TABLE `cifras` (
  `id` int(11) NOT NULL,
  `nome_usuario` varchar(100) NOT NULL,
  `nome_musica` varchar(100) NOT NULL,
  `nome_cantor` varchar(100) NOT NULL,
  `tom` varchar(7) NOT NULL,
  `cifra` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cifras`
--

INSERT INTO `cifras` (`id`, `nome_usuario`, `nome_musica`, `nome_cantor`, `tom`, `cifra`) VALUES
(3, 'Giovanny', 'Um dia', 'Gaviões', 'Cm', 's fe e s se e  a w a'),
(5, 'Giovanny', 'Maré Viva!', 'Fresnow', 'GM', 'Eu Sou a Maré Viva\n\nFresno\n\nCifra: Principal (teclado)  \n\nTom: G\n\n         G9\nA casa cheia, o coração vazio\n                 C9\nEscorre do meu rosto, um lamento arredio\n\n              Em7/9             D4\nO veneno acabou, a festa esvaziou\n                G5 G4       G\nO tempo da inocência terminou\n\n                  G9\nOs amigos que eu fiz, e quem jamais voltou\n                 C9\nFerida que eu abri, e a que jamais fechou\n              Em7/9                   D4\nPara passar a luz, que vence a escuridão\n                   G5 G4           G\nPra eu tentar aquecer, o meu coração');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` text NOT NULL,
  `senha` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Giovanny', 'geovannylucas2013@outlook.com', '12345'),
(2, 'Lucas', 'lucas@hotmail.com', 'qwerty');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cifras`
--
ALTER TABLE `cifras`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `cifras`
--
ALTER TABLE `cifras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
