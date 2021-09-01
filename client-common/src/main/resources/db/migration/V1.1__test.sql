/*
 Navicat Premium Data Transfer

 Source Server         : fusionCompanyNet
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : 172.16.74.129:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 26/08/2021 18:26:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
                        `name` varchar(255) DEFAULT NULL,
                        `age` int(5) DEFAULT NULL,
                        `created_at` datetime(6) DEFAULT NULL,
                        `updated_at` datetime(6) DEFAULT NULL,
                        `attribute1` varchar(255) DEFAULT NULL,
                        `attribute2` varchar(255) DEFAULT NULL,
                        `attribute3` varchar(255) DEFAULT NULL,
                        `attribute4` varchar(255) DEFAULT NULL,
                        `attribute5` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '123123', 25, '2021-08-25 00:00:00.000000', '2021-08-25 00:00:00.000000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (2, '123123', 15, '2021-08-25 00:00:00.000000', '2021-08-25 18:56:47.137000', '111111', '111111', NULL, NULL, NULL);
INSERT INTO `user` VALUES (4, 'zxc', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (5, 'qweqwe', 10, '2021-08-25 00:00:00.000000', '2021-08-25 00:00:00.000000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (6, '567567', 20, '2021-08-25 18:56:20.191000', '2021-08-25 18:56:20.191000', NULL, NULL, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;


CREATE TABLE email (
	id INT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	user_id INT(20) NOT NULL,
	email VARCHAR(100)
);

INSERT INTO email (id , user_id , email) VALUES (1 , 1 , '1@rest.local');