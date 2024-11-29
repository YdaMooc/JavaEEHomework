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

 Date: 29/11/2024 20:00:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_students_2
-- ----------------------------
DROP TABLE IF EXISTS `t_students_2`;
CREATE TABLE `t_students_2`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `cid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `cid`(`cid`) USING BTREE,
  CONSTRAINT `t_students_2_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `t_class` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_students_2
-- ----------------------------
INSERT INTO `t_students_2` VALUES (1, '张三', 18, 1);
INSERT INTO `t_students_2` VALUES (2, '李四', 18, 2);
INSERT INTO `t_students_2` VALUES (3, '王五', 19, 2);
INSERT INTO `t_students_2` VALUES (4, '赵六', 20, 1);

SET FOREIGN_KEY_CHECKS = 1;
