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

 Date: 06/11/2019 14:51:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for project_experience
-- ----------------------------
DROP TABLE IF EXISTS `project_experience`;
CREATE TABLE `project_experience` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `project_name` varchar(20) NOT NULL COMMENT '项目名称',
  `project_url` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '项目链接\n项目链接\n项目链接\n项目链接',
  `begin_time` date NOT NULL COMMENT '开始时间',
  `end_time` date NOT NULL COMMENT '结束时间',
  `describe` varchar(2048) NOT NULL COMMENT '项目描述',
  `achievement` varchar(2048) NOT NULL COMMENT '你的成就',
  `user_id` int(11) NOT NULL COMMENT '登陆用户id',
  `delete_status` int(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`),
  KEY `project_fk` (`user_id`),
  CONSTRAINT `project_fk` FOREIGN KEY (`user_id`) REFERENCES `login_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
