CREATE DATABASE  IF NOT EXISTS `healthcaredb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `healthcaredb`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: healthcaredb
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appointmenttable`
--

DROP TABLE IF EXISTS `appointmenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `appointmenttable` (
  `appointmentNo` int(3) NOT NULL AUTO_INCREMENT,
  `patientName` varchar(60) DEFAULT NULL,
  `patientType` varchar(10) DEFAULT NULL,
  `appointmentDate` varchar(20) NOT NULL,
  `appointmentTime` varchar(20) DEFAULT NULL,
  `channellingStatus` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`appointmentNo`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=ascii;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointmenttable`
--

LOCK TABLES `appointmenttable` WRITE;
/*!40000 ALTER TABLE `appointmenttable` DISABLE KEYS */;
INSERT INTO `appointmenttable` VALUES (1,'Tanushi','student','1 January 2020','9.00','checked'),(6,'Deshan','other','2 Janurary 2020','9.00','checked');
/*!40000 ALTER TABLE `appointmenttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctortable`
--

DROP TABLE IF EXISTS `doctortable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `doctortable` (
  `doctorId` char(8) DEFAULT NULL,
  `doctorName` varchar(20) DEFAULT NULL,
  `fieldofexpertise` varchar(20) DEFAULT NULL,
  `contactNo` char(10) DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `userPassword` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctortable`
--

LOCK TABLES `doctortable` WRITE;
/*!40000 ALTER TABLE `doctortable` DISABLE KEYS */;
INSERT INTO `doctortable` VALUES ('21009876','Menik Hettihewa','immunopharmocology','0777321123','hettihewamenik','tanu'),('21009866','punchihewa','physician','0777331126','punchihewa','punchihewa');
/*!40000 ALTER TABLE `doctortable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturertable`
--

DROP TABLE IF EXISTS `lecturertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `lecturertable` (
  `lec_Id` char(8) NOT NULL,
  `lec_FullName` varchar(70) NOT NULL,
  `lec_Contact` int(10) NOT NULL,
  `lec_Email` varchar(50) NOT NULL,
  `userName` varchar(15) NOT NULL,
  `userPassword` varchar(15) NOT NULL,
  PRIMARY KEY (`lec_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturertable`
--

LOCK TABLES `lecturertable` WRITE;
/*!40000 ALTER TABLE `lecturertable` DISABLE KEYS */;
INSERT INTO `lecturertable` VALUES ('11111111','john',773683682,'john@gmail.com','john','john'),('12345677','newton',770770000,'newton@gmail.com','newton','newton'),('21002100','John Doe',777364211,'Johndoe@nsbm.lk','Johndoe','password'),('21002101','Tesh James',777364211,'teshjames@nsbm.lk','teshjames','tesh123');
/*!40000 ALTER TABLE `lecturertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nursetable`
--

DROP TABLE IF EXISTS `nursetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nursetable` (
  `nurseId` char(8) DEFAULT NULL,
  `nursename` varchar(10) DEFAULT NULL,
  `field` varchar(25) DEFAULT NULL,
  `username` varchar(13) DEFAULT NULL,
  `userPassword` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nursetable`
--

LOCK TABLES `nursetable` WRITE;
/*!40000 ALTER TABLE `nursetable` DISABLE KEYS */;
INSERT INTO `nursetable` VALUES ('21004576','Amila','nurse practioner','amila','amila1234');
/*!40000 ALTER TABLE `nursetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studenttable`
--

DROP TABLE IF EXISTS `studenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `studenttable` (
  `studentId` int(11) NOT NULL,
  `studentFullName` varchar(65) NOT NULL,
  `studentContact` char(10) NOT NULL,
  `studentEmail` varchar(45) NOT NULL,
  `studentUserName` varchar(15) NOT NULL,
  `studentPassword` varchar(10) NOT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studenttable`
--

LOCK TABLES `studenttable` WRITE;
/*!40000 ALTER TABLE `studenttable` DISABLE KEYS */;
INSERT INTO `studenttable` VALUES (12345676,'Kevin','0773332222','kevin@gmail.com','kevin','kevin'),(21009839,'Deshan Maduranga','0773685922','deshanm123@gmail.com','hddmaduranga','qwerty'),(21009870,'Tanushi Umaya','0721463322','kgtuimendra@gmail.com','tanushiumaya','9893');
/*!40000 ALTER TABLE `studenttable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-22  7:58:16
