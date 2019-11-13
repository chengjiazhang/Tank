/*
 Navicat Premium Data Transfer

 Source Server         : zbc
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : tank

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 06/11/2019 14:51:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for education_experience
-- ----------------------------
DROP TABLE IF EXISTS `education_experience`;
CREATE TABLE `education_experience` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `school_name` varchar(20) NOT NULL COMMENT '学校名称',
  `school_begin` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '入学时间',
  `school_end` varchar(20) NOT NULL COMMENT '毕业时间',
  `graduate` varchar(20) NOT NULL COMMENT '学历',
  `major` varchar(20) NOT NULL COMMENT '专业',
  `user_id` int(11) NOT NULL COMMENT '登陆用户id',
  `delete` int(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`),
  KEY `education_fk` (`user_id`),
  CONSTRAINT `education_fk` FOREIGN KEY (`user_id`) REFERENCES `login_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
