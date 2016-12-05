CREATE DATABASE  IF NOT EXISTS `project_group` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `project_group`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: project_group
-- ------------------------------------------------------
-- Server version	5.7.11

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
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `game_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--


--
-- Table structure for table `game_consule`
--

DROP TABLE IF EXISTS `game_consule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game_consule` (
  `game_id` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `consule` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game_consule`
--

INSERT INTO `game_consule` VALUES (1,1,'Playstation 4');
INSERT INTO `game_consule` VALUES (1,2,'Xbox One');
INSERT INTO `game_consule` VALUES (1,3,'PC');

--
-- Table structure for table `game_genre`
--

DROP TABLE IF EXISTS `game_genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game_genre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `genre` varchar(45) DEFAULT NULL,
  `game_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game_genre`
--


--
-- Table structure for table `game_reviews`
--

DROP TABLE IF EXISTS `game_reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game_reviews` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `game_id` int(11) DEFAULT NULL,
  `review` varchar(256) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game_reviews`
--


--
-- Table structure for table `games`
--

DROP TABLE IF EXISTS `games`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `games` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `img` varchar(256) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `publisher` varchar(256) DEFAULT NULL,
  `developer` varchar(256) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `games`
--

INSERT INTO `games` VALUES (1,'Mafia 3','2016-10-07','https://upload.wikimedia.org/wikipedia/en/thumb/9/9f/Mafia_III_cover_art.jpg/250px-Mafia_III_cover_art.jpg',' Set in 1968 in the city of New Bordeaux, a fictional recreation of New Orleans, the story revolves around Lincoln Clay, an orphan and Vietnam veteran, who is on a quest to build a new crime organization to confront the Italian mob','2K Games','Hanger 13',60,100);
INSERT INTO `games` VALUES (2,'Gears of War 4','2016-10-11','https://upload.wikimedia.org/wikipedia/en/thumb/f/ff/Gears_of_War_4.jpg/250px-Gears_of_War_4.jpg','A NEW SAGA BEGINS FOR ONE OF THE MOST ACCLAIMED VIDEO GAME FRANCHISES IN HISTORY. AFTER NARROWLY ESCAPING AN ATTACK ON THEIR VILLAGE, JD FENIX AND HIS FRIENDS, KAIT AND DEL, MUST RESCUE THE ONES THEY LOVE AND DISCOVER THE SOURCE OF A MONSTROUS NEW ENEMY.','Microsoft Studios','The Coalition',60,104);
INSERT INTO `games` VALUES (3,'Dishonored 2','2016-11-11','https://upload.wikimedia.org/wikipedia/en/5/5f/Dishonored_2_cover_art.jpg','After Empress Emily Kaldwin is deposed by an \"otherworldly usurper\". Play as Emily or her bodyguard and father Corvo Attano as they attempt to reclaim the throne.','Bethesda Softworks','Arkane Studios',60,50);
INSERT INTO `games` VALUES (4,'BioShock: The Collection','2016-09-16','https://upload.wikimedia.org/wikipedia/en/thumb/e/e7/BioShock-_The_Collection.jpg/250px-BioShock-_The_Collection.jpg','Remastered collection of the BioShock video game series: BioShock, BioShock 2, and BioShock Infinite','2K Games','Irrational Games',60,50);
INSERT INTO `games` VALUES (5,'Fire Emblem Fates','2016-02-19','https://en.wikipedia.org/wiki/File:Fire_Emblem_Fates_special_edition_cover_art.jpg','The player is unwillingly drawn into a war between the Kingdoms of Hoshido (their birthplace) and Nohr (their adopted home), and must choose which side to support','Nintendo','Intelligent Systems',40,50);
INSERT INTO `games` VALUES (6,'Earth Defense Force 4.1: The Shadow of New Despair','2015-12-08','https://fanboydestroy.files.wordpress.com/2015/11/edf-4-1-ps4.jpg','In the year 2025, the EDF must protect the Earth again from the alien invaders','D3 Publisher','Sandlot',40,150);
INSERT INTO `games` VALUES (7,'Valkyria Chronicles','2008-11-04','https://upload.wikimedia.org/wikipedia/en/thumb/a/a2/Valkyria_cover.jpg/250px-Valkyria_cover.jpg','Basically Anime World War 2','Sega','Sega',30,30);
INSERT INTO `games` VALUES (8,'Overwatch','2016-05-24','https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Overwatch_cover_art_%28PC%29.jpg/250px-Overwatch_cover_art_%28PC%29.jpg','Overwatch is a first-person shooter that features squad-based combat with two opposing teams of six players each.[1] Players choose one of several hero characters, each with their own unique abilities and role classes','Blizzard Entertainment','Blizzard Entertainment',60,200);
INSERT INTO `games` VALUES (9,'NBA 2K17','2016-09-20','https://upload.wikimedia.org/wikipedia/en/thumb/a/a0/NBA_2K17_cover_art.jpg/250px-NBA_2K17_cover_art.jpg','NBA 2K17 is a basketball simulation game which strives to realistically depict the experience of the National Basketball Association (NBA. The player mainly plays NBA basketball games with real-life or customized players and teams.','2K Sports','Visual Concepts',60,125);
INSERT INTO `games` VALUES (10,'Bloodborne','2015-03-24','https://upload.wikimedia.org/wikipedia/en/6/68/Bloodborne_Cover_Wallpaper.jpg','Upon mysteriously awakening in Yharnam during the night of \"The Hunt\". The Hunter begins to unravel Yharnams intriguing mysteries while hunting down its many terrifying beasts.','Sony Computer Entertainment','FromSoftware',30,30);
INSERT INTO `games` VALUES (11,'The Witcher 3: Wild Hunt','2015-05-19','https://upload.wikimedia.org/wikipedia/en/0/0c/Witcher_3_cover_art.jpg','In the past he has raised and overthrown monarchs, battled legendary monsters and saved the lives of many. Now Geralt embarks on his most personal quest to save his loved ones and protect the world from an ancient threat.','CD Projekt','CD Projekt RED',50,50);
INSERT INTO `games` VALUES (12,'Uncharted 4','2016-05-10','https://upload.wikimedia.org/wikipedia/en/1/1a/Uncharted_4_box_artwork.jpg','Set several years after the events of Uncharted 3, Nathan Drake, who has retired from fortune hunting, reunites with his older brother Sam and longtime partner Sully to search for clues for the location of long-lost treasure to save his brother','Sony Interactive Entertainment','Naughty Dog',50,75);
INSERT INTO `games` VALUES (13,'The Last of Us','2013-06-14','https://upload.wikimedia.org/wikipedia/en/4/46/Video_Game_Cover_-_The_Last_of_Us.jpg','Set in the post-apocalyptic United States, the game tells the story of survivors Joel and Ellie as they work together to survive their westward journey across what remains of the country to find a possible cure for the modern fungal plague.','Sony Interactive Entertainment','Naughty Dog',40,85);
INSERT INTO `games` VALUES (14,'Life Is Strange','2015-10-20','https://upload.wikimedia.org/wikipedia/en/9/9e/Life_Is_Strange_cover.jpg','The protagonist is Max, a photography senior who discovers she can manipulate time after rewinding it to save her old best friend, Chloe Price.','Square Enix','Dontnod Entertainment',50,50);
INSERT INTO `games` VALUES (15,'Harry Potter and the Chamber of Secrets','2002-11-12','https://upload.wikimedia.org/wikipedia/en/9/9c/Harry_Potter_and_the_Chamber_of_Secrets_Coverart.png','Taking control of Harry, the player explores Hogwarts castle and grounds. Throughout the course of the game, the player will encounter events that tie into the storyline of the second book','Electronic Arts','KnowWonder',10,5);
INSERT INTO `games` VALUES (16,'Saints Row IV','2013-08-20','https://upload.wikimedia.org/wikipedia/en/5/5d/SaintsRowIV.jpg','As the leader of the Saints, a street gang that has become the world\'s most \"powerful and popular\" organization, the player is elected President of the United States, receives superpowers, and fends off an alien invasion','Deep Silver','Volition',30,25);
INSERT INTO `games` VALUES (17,'Max Payne 2','2003-10-14','https://upload.wikimedia.org/wikipedia/en/2/21/Max_Payne_2.jpg','Max Payne 2: The Fall of Max Payne is a violent, film-noir love story. Dark, tragic and intense, the in-depth story is a thrill-ride of shocking twists and revelations.','Rockstar Games','Remedy Entertainment',25,25);
INSERT INTO `games` VALUES (18,'Portal 2','2011-04-19','https://upload.wikimedia.org/wikipedia/en/f/f9/Portal2cover.jpg','Portal 2 is the sequel to Portal. It features a single-player story set after the events of Portal\'s story; and a brand-new Co-op game mode, featuring additional test chambers designed specifically for Co-operative play','Valve Corporation','Valve Corporation',20,25);
INSERT INTO `games` VALUES (19,'Tomb Raider','2013-03-05','https://upload.wikimedia.org/wikipedia/en/f/f1/TombRaider2013.jpg','Tomb Raider is set on Yamatai, an island from which Lara, who is untested and not yet the battle-hardened explorer she is in other titles in the series, must save her friends and escape while being hunted down by a malevolent cult.','Square Enix','Crystal Dynamics',30,55);
INSERT INTO `games` VALUES (20,'Mafia II','2010-08-24','https://upload.wikimedia.org/wikipedia/en/0/0d/Mafia_II_Boxart.jpg','Mafia II is a third-person, sandbox shooter that provides a look into the dark and unforgiving world of the Mob.','2K Games','2K Czech',20,13);
INSERT INTO `games` VALUES (21,'The Legend of Zelda: Ocarina of Time','1998-11-21','https://upload.wikimedia.org/wikipedia/en/8/8e/The_Legend_of_Zelda_Ocarina_of_Time_box_art.png','In Ocarina of Time, the player controls Link in the land of Hyrule. Link sets out on a quest to stop Ganondorf, king of the Gerudo tribe, from obtaining the Triforce, a sacred relic that grants the wishes of its holder.','Nintendo','Nintendo EAD',50,5);
INSERT INTO `games` VALUES (22,'Golden Sun','2001-11-11','https://upload.wikimedia.org/wikipedia/en/8/87/Gsbox.jpg','Golden Sun\'s story follows a band of magic-attuned \"Adepts\" whose purpose, as it is revealed early on, is to protect the world of Weyard from alchemy, a potentially destructive power that was sealed away long ago.','Nintendo','Camelot Software Planning',35,7);
INSERT INTO `games` VALUES (23,'Final Fantasy IX','2000-11-13','https://upload.wikimedia.org/wikipedia/en/5/51/Ffixbox.jpg','Final Fantasy IX\'s plot centers on a war between nations. Players follow a young thief named Zidane Tribal, who joins with others to defeat Queen Brahne of Alexandria, the one responsible for starting the war.','Square','Square',45,12);
INSERT INTO `games` VALUES (24,'Super Mario 64','1996-09-29','https://upload.wikimedia.org/wikipedia/en/6/6a/Super_Mario_64_box_cover.jpg','In the game, Mario explores Princess Peach\'s castle and must rescue her from Bowser.','Nintendo','Nintendo EAD',45,10);
INSERT INTO `games` VALUES (25,'Pokémon Gold','2000-10-15','https://upload.wikimedia.org/wikipedia/en/4/4c/Pok%C3%A9mon_box_art_-_Gold_Version.png','Pokemon generation 2','The Pokémon Company','Game Freak',57,17);
INSERT INTO `games` VALUES (26,'Fable II','2008-10-21','https://upload.wikimedia.org/wikipedia/en/7/7f/Fable_II.jpg','The game takes place in the fictional land of Albion, five hundred years after Fable\'s original setting, in a colonial era resembling the time of highwaymen or the Enlightenment.','Microsoft Game Studios','Lionhead Studios',30,20);
INSERT INTO `games` VALUES (27,'GoldenEye 007','1997-08-25','https://upload.wikimedia.org/wikipedia/en/3/36/GoldenEye007box.jpg','A campaign in which players assume the role of British Secret Intelligence Service agent James Bond as he fights to prevent a criminal syndicate from using a satellite weapon against London to cause a global financial meltdown.','Nintendo','Rare',60,2);
INSERT INTO `games` VALUES (28,'Bomberman','2005-06-21','https://upload.wikimedia.org/wikipedia/en/thumb/6/6b/BombermanDScover.png/384px-BombermanDScover.png','There are 10 levels with 10 stages each, a bonus stage after the 5th stage, and a boss battle for the 10th stage.','Ubisoft','Hudson Soft',15,5);
INSERT INTO `games` VALUES (29,'Mario Kart: Double Dash','2003-11-17','https://upload.wikimedia.org/wikipedia/en/7/78/Mario_Kart_Double_Dash.jpg','Mario Kart ruining families and friendships since \'96','Nintendo','Nintendo EAD',30,12);
INSERT INTO `games` VALUES (30,'Need for Speed: Underground','2003-11-17','https://upload.wikimedia.org/wikipedia/en/7/78/Mario_Kart_Double_Dash.jpg','Underground completely rebooted the franchise, ignoring the previous Need for Speed games which featured sports cars and exotics. It was the first game in the series to offer a career mode featuring a storyline and car customization','EA Black Box','Electronic Arts',10,20);

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--


--
-- Dumping events for database 'project_group'
--

--
-- Dumping routines for database 'project_group'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-01 17:31:52
