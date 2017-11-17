-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: redwings
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aeronave`
--

DROP TABLE IF EXISTS `aeronave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aeronave` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modelo` varchar(100) NOT NULL,
  `capacidade` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aeronave`
--

LOCK TABLES `aeronave` WRITE;
/*!40000 ALTER TABLE `aeronave` DISABLE KEYS */;
INSERT INTO `aeronave` VALUES (1,'Airbus 330',200),(2,'Boeing 727',160),(3,'Jato',25);
/*!40000 ALTER TABLE `aeronave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passageiro`
--

DROP TABLE IF EXISTS `passageiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passageiro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passageiro`
--

LOCK TABLES `passageiro` WRITE;
/*!40000 ALTER TABLE `passageiro` DISABLE KEYS */;
INSERT INTO `passageiro` VALUES (1,'Manoel Garcia','123','COMUM'),(2,'Rafael','123123123','PREFERENCIAL'),(3,'João Marcos','123123123','PREFERENCIAL'),(4,'Francisco Neto','123123123','VIP'),(5,'Aline Silva','123123123','COMUM'),(6,'Samuel Rosa','123123123','VIP'),(7,'Adão Thomas','123123123','VIP'),(8,'David Salles','123123123','COMUM'),(9,'Joel Santana','123123123','COMUM'),(10,'Marcia Goldschimdt','123123123','COMUM'),(11,'Joao Cleber','123123123','COMUM'),(12,'Claudia Raia','123123123','COMUM'),(13,'Roberto Justus','123123123','VIP'),(14,'Julius','123123123','COMUM'),(15,'Marcelo','123123123','COMUM'),(16,'Sandra','123123123','COMUM'),(17,'Madalena','123123123','COMUM'),(18,'Thomas','123123123','COMUM'),(19,'Jefferson','123123123','COMUM'),(20,'Marcelo','123123123','COMUM'),(21,'Sandra Rosa','123123123','COMUM'),(22,'Aline','123123123','COMUM'),(23,'Ben Afflec','123123123','VIP'),(24,'George Washington','123123123','COMUM'),(25,'Bill Gates','123123123','VIP'),(26,'Sara Cura','123123123','COMUM'),(27,'Zelda Melo','123123123','COMUM'),(28,'Jin Carrey','123123123','VIP'),(29,'Tom Cruise','123123123','COMUM'),(30,'Madonna','123123123','VIP'),(31,'Jesus Luz','123123123','COMUM'),(32,'Celton Melo','123123123','COMUM'),(33,'Princesa Isabel','123123123','COMUM'),(34,'Silvio Santos','123123123','COMUM'),(35,'Galinha Pintadinha','123123123','COMUM'),(36,'Patati Patata','123123123','COMUM'),(37,'Timão e Pumba','123123123','COMUM'),(38,'Pato Donald','123123123','COMUM'),(39,'Pateta','123123123','COMUM'),(40,'Max','123123123','COMUM'),(41,'Flintstones','123123123','COMUM'),(42,'Mark Zuck','123123123','VIP'),(43,'Dan Bizz','123123123','COMUM'),(44,'Barack Obama','123123123','PREFERENCIAL'),(45,'Barack Obama','123123123','PREFERENCIAL'),(46,'HIllary Clinton','123123123','PREFERENCIAL'),(47,'Steffen Howpkis','123123123','VIP'),(48,'Tim Maia','123123123','COMUM'),(49,'Anderson Silva','123123123','COMUM'),(50,'Minotouro','123123123','COMUM'),(51,'Orc','123123123','COMUM'),(52,'Troll','123123123','COMUM'),(53,'Peppa','123123123','COMUM'),(54,'Berry Allen','123123123','COMUM'),(55,'Oliver Queen','123123123','VIP'),(56,'Romeu','123123123','COMUM'),(57,'Julieta','123123123','COMUM'),(58,'Rosa','123123123','COMUM'),(59,'Bart Simp','123123123','COMUM'),(60,'Lisa Simp','123123123','COMUM'),(61,'Hommer Simp','123123123','COMUM'),(62,'Marggie Simp','123123123','COMUM'),(63,'Meggie Simp','123123123','COMUM'),(64,'Porco Aranha','123123123','COMUM'),(65,'Jack Sparrow','123123123','COMUM'),(66,'Captao Barbosa','123123123','VIP'),(67,'Bela e Fera','123123123','COMUM'),(68,'Homem Aranha','123123123','COMUM'),(69,'Super Homem','123123123','VIP'),(70,'Super Girl','123123123','COMUM'),(71,'Mega Mente','123123123','COMUM'),(72,'Thunder Cats','123123123','COMUM'),(73,'Power Rangers','123123123','COMUM'),(74,'Salomao','123123123','COMUM'),(75,'Indiana Jones','123123123','COMUM'),(76,'Jessi James','123123123','COMUM'),(77,'Pikachu','123123123','COMUM'),(78,'Blastoise','123123123','COMUM'),(79,'Snorlax','123123123','COMUM'),(80,'Pigeot','123123123','COMUM'),(81,'Sombra','123123123','COMUM'),(82,'Aston Martin','123123123','VIP'),(83,'Cavalo Manco','123123123','COMUM'),(84,'Sasi Perere','123123123','COMUM'),(85,'Boi Bumba','123123123','COMUM'),(86,'Curupira','123123123','COMUM'),(87,'Martin Lutherking','123123123','PREFERENCIAL'),(88,'Star Wars','123123123','COMUM'),(89,'John Williams','123123123','COMUM'),(90,'Jurassic Park','123123123','COMUM'),(91,'Palhaço Carequinha','123123123','COMUM'),(92,'Calvis Harris','123123123','COMUM'),(93,'Macoulie Cauculin','123123123','COMUM'),(94,'David Bourn','123123123','COMUM'),(95,'James Brown','123123123','VIP'),(96,'Freedie Mercury','123123123','COMUM'),(97,'Daniela Mercury','123123123','COMUM'),(98,'Ivete Sangalo','123123123','COMUM'),(99,'Ed Sheeran','123123123','COMUM'),(100,'Kung fu Panda','123123123','COMUM'),(101,'John Lennon','123123123','COMUM'),(102,'Michael Jackson','123123123','COMUM'),(103,'Jonas Brother','123123123','COMUM'),(104,'Xuxa Meneghel','123123123','VIP'),(105,'Ana Maria Braga','123123123','COMUM'),(106,'Letícia Espiller','123123123','COMUM'),(107,'Silvia Brand','123123123','COMUM'),(108,'Fausto Silva','123123123','COMUM'),(109,'Whinderson Nunes','123123123','COMUM'),(110,'Chicó','123123123','COMUM'),(111,'Francisco Coco','123123123','COMUM'),(112,'Marilia Pera','123123123','COMUM'),(113,'Mulher Melão','123123123','COMUM'),(114,'Robert Down Jr','123123123','VIP'),(115,'Homem de Ferro','123123123','COMUM'),(116,'Thor','123123123','COMUM'),(117,'Loki','123123123','COMUM'),(118,'Capitao Caverna','123123123','COMUM'),(119,'Gladiador','123123123','COMUM'),(120,'Conan','123123123','COMUM'),(121,'Hercules','123123123','COMUM'),(122,'Xena','123123123','COMUM'),(123,'Cicplops','123123123','COMUM'),(124,'Yolaus','123123123','COMUM'),(125,'Tempestade','123123123','COMUM'),(126,'Homem Formiga','123123123','VIP'),(127,'Edward','123123123','COMUM'),(128,'Alice','123123123','COMUM'),(129,'Joao','123123123','COMUM'),(130,'Maria','123123123','COMUM'),(131,'Claudio','123123123','COMUM'),(132,'Everton','123123123','COMUM'),(133,'Rodrigo','123123123','COMUM'),(134,'Matheus','123123123','COMUM'),(135,'Alex','123123123','COMUM'),(136,'André','123123123','VIP'),(137,'Rita','123123123','COMUM'),(138,'Maykon','123123123','COMUM'),(139,'Patricia','123123123','COMUM'),(140,'Osmar','123123123','COMUM'),(141,'Chris','123123123','COMUM'),(142,'Nair','123123123','COMUM'),(143,'Jessica','123123123','COMUM'),(144,'Cristina','123123123','COMUM'),(145,'Fabio','123123123','VIP'),(146,'Iolanda','123123123','COMUM'),(147,'Pedro','123123123','COMUM'),(148,'Dani Bananinha','123123123','COMUM'),(149,'Carol Dias','123123123','COMUM'),(150,'Matheus Ceará','123123123','COMUM'),(151,'Cezar Filho','123123123','COMUM'),(152,'Cezar Menotti','123123123','COMUM'),(153,'Faisca','123123123','COMUM'),(154,'Tião','123123123','COMUM'),(155,'Professor Girafalles','123123123','COMUM'),(156,'Chaves','123123123','VIP'),(157,'Sr. Madruga','123123123','COMUM'),(158,'Kiko','123123123','COMUM'),(159,'Chiquinha','123123123','COMUM'),(160,'Dona Florinda','123123123','VIP'),(161,'Sr. Barriga','123123123','COMUM'),(162,'Jaiminho','123123123','COMUM'),(163,'Poppys','123123123','COMUM'),(164,'Clarice','123123123','COMUM'),(165,'Damiao','123123123','COMUM'),(166,'Gustavo','123123123','COMUM'),(167,'Gertudres','123123123','COMUM'),(168,'Gean','123123123','COMUM'),(169,'Bruna','123123123','COMUM'),(170,'Olavo','123123123','COMUM'),(171,'Charles','123123123','COMUM'),(172,'Babi','123123123','COMUM'),(173,'Raul Gil','123123123','COMUM'),(174,'Carla Peres','123123123','COMUM'),(175,'Alexandre','123123123','COMUM'),(176,'Piologo','123123123','COMUM'),(177,'Julio','123123123','COMUM'),(178,'Telma','123123123','COMUM'),(179,'Adilson','123123123','COMUM'),(180,'Alisson','123123123','COMUM'),(181,'Manoel','123123123','COMUM'),(182,'Waldemar','123123123','COMUM'),(183,'Wolverine','123123123','COMUM'),(184,'Harry Potter','123123123','COMUM'),(185,'Zonta','123123123','COMUM'),(186,'Karoline','123123123','COMUM'),(187,'Zeeba','123123123','VIP'),(188,'Alok','123123123','COMUM'),(189,'David Guetta','123123123','COMUM'),(190,'Shrek','123123123','COMUM'),(191,'Fiona','123123123','COMUM'),(192,'Mickey','123123123','COMUM'),(193,'Minnie','123123123','COMUM'),(194,'Olivia','123123123','COMUM'),(195,'Brutus','123123123','COMUM'),(196,'Paulo','123123123','COMUM'),(197,'Pedro','123123123','COMUM'),(198,'Ruan','123123123','COMUM'),(199,'Pablo','123123123','COMUM'),(200,'Quiteria','123123123','COMUM'),(201,'Euclides','123123123','COMUM'),(202,'Marieta','123123123','COMUM'),(203,'Lineu','123123123','COMUM'),(204,'Janaina','123123123','COMUM'),(205,'Mel','123123123','COMUM'),(206,'Carlinhos','123123123','VIP'),(207,'Buda','123123123','COMUM'),(208,'Arícia','123123123','COMUM'),(209,'Dênis','123123123','VIP'),(210,'Silvano','123123123','COMUM');
/*!40000 ALTER TABLE `passageiro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-17 19:59:32
