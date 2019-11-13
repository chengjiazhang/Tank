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

 Date: 06/11/2019 14:52:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for work_experience
-- ----------------------------
DROP TABLE IF EXISTS `work_experience`;
CREATE TABLE `work_experience` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `company` varchar(20) DEFAULT NULL COMMENT '公司名称',
  `is_visible` int(1) NOT NULL COMMENT '是否可见',
  `department` varchar(20) NOT NULL COMMENT '部门',
  `position` varchar(20) NOT NULL COMMENT '职位名称',
  `hire_time` varchar(11) NOT NULL COMMENT '入职时间',
  `leave_time` varchar(11) NOT NULL COMMENT '离职时间',
  `work_content` varchar(2048) NOT NULL COMMENT '工作内容',
  `user_id` int(11) NOT NULL COMMENT '登陆用户id',
  `delete_status` int(1) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`),
  KEY `basic_fk` (`user_id`),
  CONSTRAINT `basic_fk` FOREIGN KEY (`user_id`) REFERENCES `login_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
