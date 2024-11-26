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

 Date: 26/11/2024 17:38:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `category_id` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `category_id`(`category_id`) USING BTREE,
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '电视机', 5000, 1);
INSERT INTO `product` VALUES (2, '冰箱', 4000, 2);
INSERT INTO `product` VALUES (3, '空调', 5000, 2);
INSERT INTO `product` VALUES (4, '洗衣机', 2000, 2);

SET FOREIGN_KEY_CHECKS = 1;
