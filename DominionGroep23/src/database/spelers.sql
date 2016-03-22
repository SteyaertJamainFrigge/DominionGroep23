CREATE TABLE `playersinf` (
  `playerid` int(11) NOT NULL,
  `spelernm` char(20) NOT NULL,
  PRIMARY KEY (`playerid`)

CREATE TABLE `deckplayer` (
  `deckplayernr` int(11) NOT NULL DEFAULT '0',
  `deckplayernm` char(25) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `playerid` int(11) NOT NULL,
  PRIMARY KEY (`deckplayernr`),
  KEY `fk1_deckplayer` (`playerid`),
  CONSTRAINT `fk1_deckplayer` FOREIGN KEY (`playerid`) REFERENCES `playersinf` (`playerid`)

CREATE TABLE `deckgame` (
  `deckgamenr` int(11) NOT NULL,
  `cardnm` char(25) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`deckgamenr`)