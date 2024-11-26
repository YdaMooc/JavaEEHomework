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

 Date: 26/11/2024 16:46:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `major` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sno` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (1, '张三', '数学', '10001');
INSERT INTO `t_student` VALUES (2, '李四', '英语', '10002');
INSERT INTO `t_student` VALUES (3, '王五', '计算机', '10003');
INSERT INTO `t_student` VALUES (4, '王刚', '化学', '10004');
INSERT INTO `t_student` VALUES (5, '李华', '物理', '10005');
INSERT INTO `t_student` VALUES (6, '李雷', '中文', '10006');
INSERT INTO `t_student` VALUES (7, '张飞', '英语', '10007');

SET FOREIGN_KEY_CHECKS = 1;
