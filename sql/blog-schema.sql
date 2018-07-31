-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.38 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 blog 的数据库结构
DROP DATABASE IF EXISTS `blog`;
CREATE DATABASE IF NOT EXISTS `blog` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `blog`;

-- 导出  表 blog.t_article 结构
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE IF NOT EXISTS `t_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `content` text NOT NULL,
  `user_id` int(11) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

-- 数据导出被取消选择。
-- 导出  表 blog.t_article_tag 结构
DROP TABLE IF EXISTS `t_article_tag`;
CREATE TABLE IF NOT EXISTS `t_article_tag` (
  `article_id` int(11) NOT NULL COMMENT '文章id',
  `tag_id` int(11) NOT NULL COMMENT '标签id',
  PRIMARY KEY (`article_id`,`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章，标签关联表';

-- 数据导出被取消选择。
-- 导出  表 blog.t_category 结构
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE IF NOT EXISTS `t_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) NOT NULL COMMENT '分类名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='分类表';

-- 数据导出被取消选择。
-- 导出  表 blog.t_comment 结构
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE IF NOT EXISTS `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `content` varchar(100) NOT NULL COMMENT '评论内容',
  `parent` int(11) DEFAULT NULL COMMENT '父评论',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `article_id` int(11) NOT NULL COMMENT '文章id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='评论表';

-- 数据导出被取消选择。
-- 导出  表 blog.t_tag 结构
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE IF NOT EXISTS `t_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) NOT NULL COMMENT '标签名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='标签表';

-- 数据导出被取消选择。
-- 导出  表 blog.t_user 结构
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 数据导出被取消选择。
-- 导出  视图 blog.v_article_info 结构
DROP VIEW IF EXISTS `v_article_info`;
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `v_article_info` (
	`id` INT(11) NOT NULL,
	`title` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`content` TEXT NOT NULL COLLATE 'utf8mb4_general_ci',
	`username` VARCHAR(16) NOT NULL COMMENT '用户名' COLLATE 'utf8mb4_general_ci',
	`category_name` VARCHAR(20) NULL COMMENT '分类名' COLLATE 'utf8mb4_general_ci'
) ENGINE=MyISAM;

-- 导出  视图 blog.v_article_info 结构
DROP VIEW IF EXISTS `v_article_info`;
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `v_article_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_article_info` AS select `a`.`id` AS `id`,`a`.`title` AS `title`,`a`.`content` AS `content`,`u`.`username` AS `username`,`ca`.`name` AS `category_name` from ((`t_article` `a` join `t_user` `u` on((`a`.`user_id` = `u`.`id`))) left join `t_category` `ca` on((`a`.`category_id` = `ca`.`id`)));

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
