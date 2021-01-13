-- MySQL dump 10.16  Distrib 10.1.38-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: java_app
-- ------------------------------------------------------
-- Server version	10.1.38-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendajava`
--

DROP TABLE IF EXISTS `agendajava`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agendajava` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Nume` varchar(20) NOT NULL,
  `Prenume` varchar(30) NOT NULL,
  `Data_nasterii` date NOT NULL,
  `Numar_de_telefon` varchar(10) NOT NULL,
  `Tip_telefon` varchar(6) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`,`Nume`,`Prenume`,`Data_nasterii`,`Numar_de_telefon`),
  UNIQUE KEY `duplicate` (`Nume`,`Prenume`,`Data_nasterii`,`Numar_de_telefon`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendajava`
--

LOCK TABLES `agendajava` WRITE;
/*!40000 ALTER TABLE `agendajava` DISABLE KEYS */;
INSERT INTO `agendajava` VALUES (1,'Ioan','Catalin','1992-11-25','0701234567','Mobil'),(10,'Moroi','Alex','1994-04-14','0314457689','Fix'),(11,'Pix','Ttet','2019-07-04','0213354678','Fix'),(19,'abc','eer','1994-09-10','0723456255','Mobil'),(20,'ab','bg','1990-10-03','0212267890','Fix'),(21,'ab','bc','1990-10-03','0723456236','Mobil'),(22,'Muncitorul','Dorel','2019-07-23','0723467267','Mobil'),(23,'Pavel','Mircea','1970-07-07','0213343576','Fix'),(24,'Badea','Mircea','2019-07-13','0723456246','Mobil'),(25,'Barbut','Mihai','1950-07-13','0723543667','Mobil'),(26,'White','Walter','1960-07-03','0701234566','Mobil'),(27,'Fring','Gustavo','1980-10-09','0793456256','Mobil'),(28,'White','Skylar','1965-07-21','0219986060','Fix'),(29,'White','Flynn','2000-07-25','0780005643','Mobil');
/*!40000 ALTER TABLE `agendajava` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table2`
--

DROP TABLE IF EXISTS `table2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `table2` (
  `name` varchar(15) CHARACTER SET utf8 COLLATE utf8_persian_ci NOT NULL,
  `city` varchar(15) CHARACTER SET utf8 COLLATE utf8_persian_ci NOT NULL,
  `phone` varchar(15) NOT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table2`
--

LOCK TABLES `table2` WRITE;
/*!40000 ALTER TABLE `table2` DISABLE KEYS */;
/*!40000 ALTER TABLE `table2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-23 19:52:29
