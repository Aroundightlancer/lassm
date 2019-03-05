/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : 127.0.0.1:33889
Source Database       : yly

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-03-05 15:55:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `id` int(11) NOT NULL,
  `oldid` int(11) DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `activity` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of activity
-- ----------------------------

-- ----------------------------
-- Table structure for allergy
-- ----------------------------
DROP TABLE IF EXISTS `allergy`;
CREATE TABLE `allergy` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `degree` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '???????س̶',
  `reaction` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '??????Ӧ',
  `measures` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '??ʩ',
  `old_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of allergy
-- ----------------------------

-- ----------------------------
-- Table structure for bloodpressure
-- ----------------------------
DROP TABLE IF EXISTS `bloodpressure`;
CREATE TABLE `bloodpressure` (
  `id` int(11) NOT NULL,
  `old_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `high` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '??ѹ',
  `low` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '??ѹ',
  `createtime` datetime DEFAULT NULL COMMENT '????ʱ?',
  `isok` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ?????',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of bloodpressure
-- ----------------------------

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `id` int(11) NOT NULL,
  `old_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `breakfast` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `lunch` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `dinner` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `cloth` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of food
-- ----------------------------

-- ----------------------------
-- Table structure for health
-- ----------------------------
DROP TABLE IF EXISTS `health`;
CREATE TABLE `health` (
  `id` int(11) NOT NULL,
  `oldname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `rate` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '???',
  `blood` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'Ѫѹ',
  `sleep` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '˯?',
  `oldid` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of health
-- ----------------------------

-- ----------------------------
-- Table structure for heartrate
-- ----------------------------
DROP TABLE IF EXISTS `heartrate`;
CREATE TABLE `heartrate` (
  `id` int(11) NOT NULL,
  `old_id` int(11) DEFAULT NULL,
  `rate` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '???',
  `createtime` datetime DEFAULT NULL COMMENT 'ʱ?',
  `isok` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ?????',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of heartrate
-- ----------------------------

-- ----------------------------
-- Table structure for illness
-- ----------------------------
DROP TABLE IF EXISTS `illness`;
CREATE TABLE `illness` (
  `id` int(11) NOT NULL,
  `oldid` int(11) DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `illnessname` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '????',
  `date` date DEFAULT NULL COMMENT 'ʱ?',
  `medi` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT ' ʹ??ҩƷ',
  `isok` varchar(0) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ?Ȭ??',
  `method` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '???Ʒ???',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of illness
-- ----------------------------

-- ----------------------------
-- Table structure for illnessnow
-- ----------------------------
DROP TABLE IF EXISTS `illnessnow`;
CREATE TABLE `illnessnow` (
  `id` int(11) NOT NULL,
  `oldid` int(11) DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `illnessnow` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `date` date DEFAULT NULL,
  `med` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of illnessnow
-- ----------------------------

-- ----------------------------
-- Table structure for important
-- ----------------------------
DROP TABLE IF EXISTS `important`;
CREATE TABLE `important` (
  `id` int(11) NOT NULL,
  `oldid` int(11) DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `importantname` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '????',
  `degree` varchar(0) COLLATE utf8_bin DEFAULT NULL COMMENT '???س̶',
  `method` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '???Ʒ???',
  `isok` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ?Ȭ??',
  `createtime` datetime DEFAULT NULL COMMENT 'ʱ?',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of important
-- ----------------------------

-- ----------------------------
-- Table structure for love
-- ----------------------------
DROP TABLE IF EXISTS `love`;
CREATE TABLE `love` (
  `id` int(5) NOT NULL,
  `old_id` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `love` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '???',
  `fen` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'ϲ??????',
  `degree` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'ϲ???̶',
  `proposal` int(5) DEFAULT NULL COMMENT 'ҽ?????',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of love
-- ----------------------------

-- ----------------------------
-- Table structure for loveactivity
-- ----------------------------
DROP TABLE IF EXISTS `loveactivity`;
CREATE TABLE `loveactivity` (
  `id` int(11) NOT NULL,
  `oldid` int(11) DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `loveactivity` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of loveactivity
-- ----------------------------

-- ----------------------------
-- Table structure for medicine
-- ----------------------------
DROP TABLE IF EXISTS `medicine`;
CREATE TABLE `medicine` (
  `id` int(11) NOT NULL,
  `old_id` int(11) DEFAULT NULL,
  `oldname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `medicinename` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'ҩ??',
  `num` int(11) DEFAULT NULL COMMENT '????',
  `result` int(11) DEFAULT NULL COMMENT '??ҩԭ?',
  `createtime` date DEFAULT NULL COMMENT 'ʱ?',
  `is` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ????',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of medicine
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `icon` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  `userType` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='1子女，2亲属，3朋友';

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for old
-- ----------------------------
DROP TABLE IF EXISTS `old`;
CREATE TABLE `old` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `birthday` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `age` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  `sex` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `msg` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '????ǩ??',
  `img` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '??Ƭ',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of old
-- ----------------------------

-- ----------------------------
-- Table structure for olduser
-- ----------------------------
DROP TABLE IF EXISTS `olduser`;
CREATE TABLE `olduser` (
  `id` int(11) NOT NULL,
  `oldname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `con` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `old_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of olduser
-- ----------------------------

-- ----------------------------
-- Table structure for praise
-- ----------------------------
DROP TABLE IF EXISTS `praise`;
CREATE TABLE `praise` (
  `id` int(11) NOT NULL,
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `pyqid` int(5) DEFAULT NULL,
  `msg` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of praise
-- ----------------------------

-- ----------------------------
-- Table structure for pyq
-- ----------------------------
DROP TABLE IF EXISTS `pyq`;
CREATE TABLE `pyq` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `old_id` int(11) DEFAULT NULL,
  `main` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '???',
  `fid` int(11) DEFAULT NULL COMMENT '?ظ????ˣ??Լ????ľ???-1',
  `img` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'ͼƬ',
  `createtime` datetime DEFAULT NULL COMMENT 'ʱ?',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of pyq
-- ----------------------------

-- ----------------------------
-- Table structure for sleep
-- ----------------------------
DROP TABLE IF EXISTS `sleep`;
CREATE TABLE `sleep` (
  `id` int(11) NOT NULL,
  `old_id` int(11) DEFAULT NULL,
  `shutime` varchar(0) COLLATE utf8_bin DEFAULT NULL COMMENT '??˯ʱ?',
  `ise` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ????',
  `fen` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '???',
  `createtime` datetime DEFAULT NULL COMMENT 'ʱ?',
  `isok` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '?Ƿ?????',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sleep
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `pwd` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `img` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zxd', '1', '');
