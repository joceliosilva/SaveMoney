-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Fev-2022 às 02:05
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `savemoney`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `account`
--

CREATE TABLE `account` (
  `Id` int(11) NOT NULL,
  `FullName` varchar(200) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Avatar` longblob DEFAULT NULL,
  `CreationDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `account`
--

INSERT INTO `account` (`Id`, `FullName`, `Email`, `Password`, `Avatar`, `CreationDate`) VALUES
(1, 'Jairo Gomes Evaristo', 'jairoevaristodev@gmail.com', '@ninja300', NULL, '2022-02-02');

-- --------------------------------------------------------

--
-- Estrutura da tabela `card`
--

CREATE TABLE `card` (
  `Id` int(11) NOT NULL,
  `AccountId` int(11) NOT NULL,
  `Number` int(11) NOT NULL,
  `Type` int(11) NOT NULL,
  `Flag` int(11) NOT NULL,
  `CardLimit` decimal(10,0) NOT NULL,
  `AnnualValue` decimal(10,0) DEFAULT NULL,
  `ClosingDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `category`
--

CREATE TABLE `category` (
  `Id` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `category`
--

INSERT INTO `category` (`Id`, `Name`) VALUES
(1, 'Mercado'),
(2, 'Academia'),
(3, 'saude');

-- --------------------------------------------------------

--
-- Estrutura da tabela `expense`
--

CREATE TABLE `expense` (
  `Id` int(11) NOT NULL,
  `AccountId` int(11) NOT NULL,
  `CategoryId` int(11) DEFAULT NULL,
  `CardId` int(11) DEFAULT NULL,
  `Value` decimal(10,0) NOT NULL,
  `Date` date NOT NULL,
  `Description` varchar(200) DEFAULT NULL,
  `FormOfPayment` int(11) NOT NULL,
  `NumberOfInstallments` int(11) DEFAULT NULL,
  `Status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `revenue`
--

CREATE TABLE `revenue` (
  `Id` int(11) NOT NULL,
  `AccountId` int(11) NOT NULL,
  `Value` decimal(10,0) NOT NULL,
  `ReferenceMonth` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Description` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `CARD_ACCOUNT` (`AccountId`);

--
-- Índices para tabela `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `expense`
--
ALTER TABLE `expense`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `EXPENSE_ACCOUNT` (`AccountId`),
  ADD KEY `EXPENSE_CATEGORY` (`CategoryId`),
  ADD KEY `EXPENSE_CARD` (`CardId`);

--
-- Índices para tabela `revenue`
--
ALTER TABLE `revenue`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `REVENUE_ACCOUNT` (`AccountId`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `account`
--
ALTER TABLE `account`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `card`
--
ALTER TABLE `card`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `category`
--
ALTER TABLE `category`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `expense`
--
ALTER TABLE `expense`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `revenue`
--
ALTER TABLE `revenue`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `CARD_ACCOUNT` FOREIGN KEY (`AccountId`) REFERENCES `account` (`Id`);

--
-- Limitadores para a tabela `expense`
--
ALTER TABLE `expense`
  ADD CONSTRAINT `EXPENSE_ACCOUNT` FOREIGN KEY (`AccountId`) REFERENCES `account` (`Id`),
  ADD CONSTRAINT `EXPENSE_CARD` FOREIGN KEY (`CardId`) REFERENCES `card` (`Id`),
  ADD CONSTRAINT `EXPENSE_CATEGORY` FOREIGN KEY (`CategoryId`) REFERENCES `category` (`Id`);

--
-- Limitadores para a tabela `revenue`
--
ALTER TABLE `revenue`
  ADD CONSTRAINT `REVENUE_ACCOUNT` FOREIGN KEY (`AccountId`) REFERENCES `account` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
