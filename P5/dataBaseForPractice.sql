/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50010
Source Host           : localhost:3306
Source Database       : unniversity

Target Server Type    : MYSQL
Target Server Version : 50010
File Encoding         : 65001

Date: 2019-06-18 18:38:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(20) NOT NULL,
  `name` varchar(20) default NULL,
  `sex` varchar(20) default NULL,
  `age` int(20) default NULL,
  `clas` varchar(20) default NULL,
  `province` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '王鑫雨', '男', '28', '12', '山西');
INSERT INTO `student` VALUES ('2', '盎司看', '女', '12', '2', '甘肃');
INSERT INTO `student` VALUES ('3', '的女婿', '男', '29', '22', '山东');
INSERT INTO `student` VALUES ('5', '挖的', '男', '19', '20', '山西');
INSERT INTO `student` VALUES ('7', '都是', '上的', '12', '的撒', '的撒');
INSERT INTO `student` VALUES ('19', '哇', '男', '12', '的撒', '的撒');
INSERT INTO `student` VALUES ('100', '王鑫雨', '女', '19', '计16', '阿拉斯加');
