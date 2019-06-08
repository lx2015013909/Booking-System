/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : jcyd

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-04-23 20:18:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `chubanshe`
-- ----------------------------
DROP TABLE IF EXISTS `chubanshe`;
CREATE TABLE `chubanshe` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `xuenian` varchar(10) NOT NULL,
  `baoming` varchar(100) DEFAULT NULL,
  `chubanshe` varchar(100) DEFAULT NULL,
  `zhekou` decimal(5,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of chubanshe
-- ----------------------------
INSERT INTO `chubanshe` VALUES ('1', '2019春', '高教文科包', '西安电子科技大学出版社', '0.8000');
INSERT INTO `chubanshe` VALUES ('2', '2019秋', '高教理科包', '成都电子科技大学', '0.8000');

-- ----------------------------
-- Table structure for `dingjia`
-- ----------------------------
DROP TABLE IF EXISTS `dingjia`;
CREATE TABLE `dingjia` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `xuenian` varchar(20) DEFAULT NULL,
  `jiaocaimingcheng` varchar(20) DEFAULT NULL,
  `dingjia` decimal(5,2) DEFAULT NULL,
  `beizhu` varchar(100) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dingjia
-- ----------------------------
INSERT INTO `dingjia` VALUES ('1', '2019春', '微波技术基础', '20.50', '123', 'admin2');
INSERT INTO `dingjia` VALUES ('2', '2019春', '微波技术基础', '25.00', '', 'admin2');

-- ----------------------------
-- Table structure for `earphone`
-- ----------------------------
DROP TABLE IF EXISTS `earphone`;
CREATE TABLE `earphone` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `xuenian` varchar(20) DEFAULT NULL,
  `zhuanyenianji` varchar(20) DEFAULT NULL,
  `danjia` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of earphone
-- ----------------------------
INSERT INTO `earphone` VALUES ('7', '2019春', '计科16', '2.00');
INSERT INTO `earphone` VALUES ('10', '2019春', '计科15', '20.00');

-- ----------------------------
-- Table structure for `jcyd`
-- ----------------------------
DROP TABLE IF EXISTS `jcyd`;
CREATE TABLE `jcyd` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `xuenian` varchar(10) DEFAULT NULL,
  `kechengmingcheng` varchar(50) DEFAULT NULL,
  `shuhao` varchar(50) DEFAULT NULL,
  `jiaocaimingcheng` varchar(50) DEFAULT NULL,
  `zuozhe` varchar(50) DEFAULT NULL,
  `chubanshe` varchar(100) DEFAULT NULL,
  `chubanshijian` varchar(100) DEFAULT NULL,
  `jiaocaileibie` varchar(100) DEFAULT NULL,
  `zhuanyenianji` varchar(30) DEFAULT NULL,
  `xueshengshu` int(10) DEFAULT NULL,
  `jiaoben` int(3) DEFAULT NULL,
  `hejibenshu` int(10) DEFAULT NULL,
  `dingjia` decimal(5,2) DEFAULT NULL,
  `zhekou` decimal(5,4) DEFAULT NULL,
  `danjia` decimal(10,2) DEFAULT NULL,
  `academy` int(2) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `flag` int(2) NOT NULL,
  `beizhu` varchar(200) DEFAULT NULL,
  `shijian` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcyd
-- ----------------------------
INSERT INTO `jcyd` VALUES ('1', '2019春', '123', '1', '微波技术基础', '周树人', '西安电子科技大学出版社', '第五版', '高等教育出版社电子信息类教材规划', '计科15', '213', '213', '213', '25.00', '0.8000', '20.00', '3', 'admin', '4', '这是什么什么什么的书', '2019-03-20 19:06:34');
INSERT INTO `jcyd` VALUES ('2', '2019春', '123', '1', '1212', '21', '西安电子科技大学出版社', '21', '21', '21', '213', '213', '426', '213.00', '0.8800', '170.40', '3', 'admin', '4', null, '2019-03-08 14:01:29');
INSERT INTO `jcyd` VALUES ('3', '2019春', 'C语言', '213', '213', '213', '西安电子科技大学出版社', '213', '213', '计科15', '213', '213', '426', null, '0.8800', null, '3', 'admin', '0', '', '2019-03-07 15:37:00');
INSERT INTO `jcyd` VALUES ('4', '2019春', 'C语言', '123', '213', '213', '西安电子科技大学出版社', '213', '213', '计科15', '123', '123', '246', '50.50', '0.8800', '44.88', '3', 'admin', '4', '', '2019-03-07 17:09:11');
INSERT INTO `jcyd` VALUES ('5', '2019春', 'C语言', '123', '213', '213', '西安电子科技大学出版社', '213', '213', '计科15', '321', '213', '534', null, '0.8800', null, '3', 'admin', '0', null, '2019-03-07 15:37:02');
INSERT INTO `jcyd` VALUES ('6', '2019春', 'C语言', '123', '213', '321', '西安电子科技大学出版社', '123', '213', '计科15', '123', '123', '246', '50.50', '0.8800', null, '3', 'admin', '0', null, '2019-03-07 17:09:19');
INSERT INTO `jcyd` VALUES ('7', '2019春', 'C语言', '213', '231', '321', '西安电子科技大学出版社', '213', '213', '计科15', '213', '321', '534', null, '0.8800', null, '3', 'admin', '0', null, '2019-03-07 15:37:03');
INSERT INTO `jcyd` VALUES ('17', '2019春', 'C语言', '11', '11', '111', '西安电子科技大学出版社', '11', '11', '计科15', '213', '213', '426', '55.50', '0.8000', '49.33', '3', 'admin', '0', '123', '2019-03-07 17:09:25');
INSERT INTO `jcyd` VALUES ('19', '2019春', '高等数学', '123', '高等数学第7版', '周树人', '213', '213', '123', '金数15', '100', '5', '105', '30.00', '0.8000', '24.00', '7', 'someone', '4', null, '2019-03-07 17:56:57');
INSERT INTO `jcyd` VALUES ('20', '2019春', '高等数学', null, '高等数学第7版', '周树人', '213', '213', '123', '计科15', '20', '20', '40', '30.00', '0.8000', '24.00', '3', 'admin2', '4', '', '2019-03-08 10:37:26');
INSERT INTO `jcyd` VALUES ('21', '2019春', '大学英语', null, null, null, null, null, null, '计科15', null, null, null, null, null, null, '3', 'admin2', '0', '213', '2019-03-08 10:37:58');
INSERT INTO `jcyd` VALUES ('23', '2019春', 'C语言', null, 'C语言第7版', '谭浩强', '西安电子科技大学出版社', '11', '11', '金数15', '20', '20', '40', '30.00', '0.8000', '24.00', '7', 'admin7', '4', '123', '2019-03-08 12:26:14');
INSERT INTO `jcyd` VALUES ('24', '2019春', 'C语言', '8888', '算法与数据结构', '严蔚敏', '西安电子科技大学出版社', '8888888', '第五版', '计科15', '40', '3', '43', '20.00', '0.8000', '16.00', '3', 'admin', '4', null, '2019-03-11 20:42:49');
INSERT INTO `jcyd` VALUES ('25', '2019春', 'C语言', '8888', '算法与数据结构', '严蔚敏', '西安电子科技大学出版社', '888', '第七版', '计科15', null, null, null, '20.00', '0.8000', '16.00', '3', 'admin', '0', null, '2019-03-11 20:42:49');
INSERT INTO `jcyd` VALUES ('26', '2019春', 'C语言', '888', '算法与数据结构', '严蔚敏', '西安电子科技大学出版社', '888', '第七版', '计科15', null, null, null, '20.00', '0.8000', '16.00', '3', 'admin', '0', null, '2019-03-11 20:42:49');
INSERT INTO `jcyd` VALUES ('27', '2019春', '高等数学', '', '高等数学第7版', '周树人', '213', '213', '123', '计科15', '50', '3', '53', '30.00', '0.8000', '24.00', '3', 'admin2', '4', '', '2019-03-08 15:07:09');
INSERT INTO `jcyd` VALUES ('28', '2019春', 'C语言', '', 'C语言第7版', '谭浩强', '西安电子科技大学出版社', '11', '11', '金数15', '50', '50', '100', '30.00', '0.8000', '24.00', '7', 'admin7', '4', '', '2019-03-08 14:58:09');
INSERT INTO `jcyd` VALUES ('29', '2019春', 'C语言', '', '算法与数据结构', '严蔚敏', '西安电子科技大学出版社', '2017.7', '第七版', '计科15', '50', '2', '52', '20.00', '0.8000', '16.00', '3', 'admin', '4', '计科15', '2019-03-11 20:42:49');
INSERT INTO `jcyd` VALUES ('30', '2019春', '高等数学', '', '高等数学第7版', '周树人', '213', '213', '123', '计科15', '50', '5', '55', '30.00', '0.8000', '24.00', '3', 'admin2', '4', '', '2019-03-09 13:17:27');
INSERT INTO `jcyd` VALUES ('31', '2019春', 'C语言', '', 'C语言第7版', '谭浩强', '西安电子科技大学出版社', '11', '11', '金数15', '200', '5', '205', '30.00', '0.8000', '24.00', '7', 'admin7', '4', '', '2019-03-09 13:33:21');
INSERT INTO `jcyd` VALUES ('32', '2019春', 'C语言', '1', '1', '1', '西安电子科技大学出版社', '1', '1', '计科15', null, null, null, null, '0.8000', null, '3', 'admin', '1', null, '2019-04-11 21:51:39');
INSERT INTO `jcyd` VALUES ('33', '2019春', '高等数学', '', '高等数学第7版', '周树人', '213', '213', '123', '计科15', '1', '1', '2', '30.00', '0.8000', '24.00', '3', 'admin2', '4', '', '2019-04-12 22:45:41');
INSERT INTO `jcyd` VALUES ('34', '2019春', '高等数学', '', '高等数学第7版', '周树人', '213', '213', '123', '计科15', '22', '22', '24', '30.00', '0.8000', '24.00', '3', 'admin2', '4', '', '2019-04-12 22:49:55');
INSERT INTO `jcyd` VALUES ('35', '2019春', 'C语言', '', '1', '1', '西安电子科技大学出版社', '123', '213', '计科15', '1', '1', '2', '58.00', '0.8000', '46.40', '3', 'admin', '4', null, '2019-04-21 20:55:53');
INSERT INTO `jcyd` VALUES ('36', '2019春', 'C语言', '1', '1', '1', '西安电子科技大学出版社', '1', '1', '计科15', '22', '22', '24', '22.00', '0.8000', '17.60', '3', 'admin', '4', null, '2019-04-22 00:32:19');

-- ----------------------------
-- Table structure for `kechengbiao`
-- ----------------------------
DROP TABLE IF EXISTS `kechengbiao`;
CREATE TABLE `kechengbiao` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `kechengmingcheng` varchar(100) DEFAULT NULL,
  `flag` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of kechengbiao
-- ----------------------------
INSERT INTO `kechengbiao` VALUES ('1', 'C语言', '3');
INSERT INTO `kechengbiao` VALUES ('2', '高等数学', '0');
INSERT INTO `kechengbiao` VALUES ('3', '数据结构', '3');
INSERT INTO `kechengbiao` VALUES ('4', '大学英语', '0');
INSERT INTO `kechengbiao` VALUES ('5', '操作系统', '3');
INSERT INTO `kechengbiao` VALUES ('6', '大学物理', '0');

-- ----------------------------
-- Table structure for `otherfee`
-- ----------------------------
DROP TABLE IF EXISTS `otherfee`;
CREATE TABLE `otherfee` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `xuenian` varchar(20) DEFAULT NULL,
  `zhuanyenianji` varchar(20) DEFAULT NULL,
  `danjia` decimal(4,2) DEFAULT NULL,
  `beizhu` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of otherfee
-- ----------------------------
INSERT INTO `otherfee` VALUES ('1', '2019春', '计科15', '20.08', '2');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(6) NOT NULL,
  `academy` varchar(2) NOT NULL,
  `flag` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'admin', '李旭', '3', '1');
INSERT INTO `users` VALUES ('2', 'admin1', 'admin1', '李旭', '3', '2');
INSERT INTO `users` VALUES ('3', 'admin2', 'admin2', '李旭', '3', '3');
INSERT INTO `users` VALUES ('4', 'admin3', 'admin3', '李旭', '17', '1');
INSERT INTO `users` VALUES ('5', 'admin7', 'admin7', '金数李旭', '7', '3');

-- ----------------------------
-- Table structure for `zhuanyenianji`
-- ----------------------------
DROP TABLE IF EXISTS `zhuanyenianji`;
CREATE TABLE `zhuanyenianji` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `zhuanyenianji` varchar(50) DEFAULT NULL,
  `academy` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of zhuanyenianji
-- ----------------------------
INSERT INTO `zhuanyenianji` VALUES ('1', '计科15', '3');
INSERT INTO `zhuanyenianji` VALUES ('2', '计科16', '3');
INSERT INTO `zhuanyenianji` VALUES ('3', '电子15', '3');
INSERT INTO `zhuanyenianji` VALUES ('4', '电子16', '3');
INSERT INTO `zhuanyenianji` VALUES ('5', '计科17', '3');
INSERT INTO `zhuanyenianji` VALUES ('6', '电子17', '3');
INSERT INTO `zhuanyenianji` VALUES ('7', '通信15', '3');
INSERT INTO `zhuanyenianji` VALUES ('8', '通信16', '3');
INSERT INTO `zhuanyenianji` VALUES ('9', '通信17', '3');
INSERT INTO `zhuanyenianji` VALUES ('10', '金数15', '7');
