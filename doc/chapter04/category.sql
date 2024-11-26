/*
 Navicat Premium Data Transfer

 Source Server         : YdaMooc
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : javaee

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 26/11/2024 17:38:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `typename` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '黑色家电');
INSERT INTO `category` VALUES (2, '白色家电');

SET FOREIGN_KEY_CHECKS = 1;
