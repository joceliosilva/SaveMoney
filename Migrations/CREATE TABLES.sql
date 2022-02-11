#--------------------- CREATE DATABASE SAVEMONEY ---------------------

DROP DATABASE IF EXISTS SaveMoney;
CREATE DATABASE SaveMoney;
USE SaveMoney;

#--------------------- CREATE TABLE ACCOUNT ---------------------

DROP TABLE IF EXISTS savemoney.Account;
CREATE TABLE `savemoney`.`Account` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `FullName` VARCHAR(200) NOT NULL,
  `Email` VARCHAR(100) NOT NULL,
  `Password` VARCHAR(100) NOT NULL,
  `Avatar` LONGBLOB NULL,
  `CreationDate` DATE NOT NULL
  PRIMARY KEY (`Id`)
);

#--------------------- CREATE TABLE CATEGORY ---------------------

DROP TABLE IF EXISTS savemoney.Category;
CREATE TABLE `savemoney`.`Category` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`Id`)
);

#--------------------- CREATE TABLE CARD ---------------------

DROP TABLE IF EXISTS savemoney.Card;
CREATE TABLE `savemoney`.`Card` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `AccountId` INT NOT NULL,
  `Number` INT NOT NULL,
  `Type` INT NOT NULL,
  `Flag` INT NOT NULL,
  `CardLimit` DECIMAL NOT NULL,
  `AnnualValue` DECIMAL,
  `ClosingDate` DATE,
  PRIMARY KEY (`Id`)
);

ALTER TABLE `savemoney`.`Card` ADD CONSTRAINT `CARD_ACCOUNT` FOREIGN KEY(`AccountId`) REFERENCES savemoney.account(`Id`);

#--------------------- CREATE TABLE EXPENSE ---------------------

DROP TABLE IF EXISTS savemoney.Expense;
CREATE TABLE `savemoney`.`Expense` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `AccountId` INT NOT NULL,  
  `CategoryId` INT,
  `CardId` INT,
  `Value` DECIMAL NOT NULL,
  `Date` DATE NOT NULL,
  `Description` VARCHAR(200),
  `FormOfPayment` INT NOT NULL,
  `NumberOfInstallments` INT, 
  `Status` INT NOT NULL,
  PRIMARY KEY (`Id`)
);

ALTER TABLE `savemoney`.`Expense` ADD CONSTRAINT `EXPENSE_ACCOUNT` FOREIGN KEY(`AccountId`) REFERENCES savemoney.account(`Id`);
ALTER TABLE `savemoney`.`Expense` ADD CONSTRAINT `EXPENSE_CATEGORY` FOREIGN KEY(`CategoryId`) REFERENCES savemoney.category(`Id`);
ALTER TABLE `savemoney`.`Expense` ADD CONSTRAINT `EXPENSE_CARD` FOREIGN KEY(`CardId`) REFERENCES savemoney.card(`Id`);

#--------------------- CREATE TABLE REVENUE ---------------------

DROP TABLE IF EXISTS savemoney.Revenue;
CREATE TABLE `savemoney`.`Revenue` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `AccountId` INT NOT NULL,
  `Value` DECIMAL NOT NULL,
  `ReferenceMonth` INT NOT NULL,
  `Date` DATE NOT NULL,
  `Description` VARCHAR(200),
  PRIMARY KEY (`Id`)
);

ALTER TABLE `savemoney`.`Revenue` ADD CONSTRAINT `REVENUE_ACCOUNT` FOREIGN KEY(`AccountId`) REFERENCES savemoney.account(`Id`);
