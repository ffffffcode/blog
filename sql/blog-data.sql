-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.38 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5284
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 正在导出表  blog.t_article 的数据：~1 rows (大约)
DELETE FROM `t_article`;
/*!40000 ALTER TABLE `t_article` DISABLE KEYS */;
INSERT INTO `t_article` (`id`, `title`, `content`, `user_id`, `category_id`) VALUES
	(1, 'test-title', 'test-content', 1, 1),
	(2, 'test-title2', 'test-content2', 2, 2);
/*!40000 ALTER TABLE `t_article` ENABLE KEYS */;

-- 正在导出表  blog.t_article_tag 的数据：~2 rows (大约)
DELETE FROM `t_article_tag`;
/*!40000 ALTER TABLE `t_article_tag` DISABLE KEYS */;
INSERT INTO `t_article_tag` (`article_id`, `tag_id`) VALUES
	(1, 1),
	(1, 2);
/*!40000 ALTER TABLE `t_article_tag` ENABLE KEYS */;

-- 正在导出表  blog.t_category 的数据：~0 rows (大约)
DELETE FROM `t_category`;
/*!40000 ALTER TABLE `t_category` DISABLE KEYS */;
INSERT INTO `t_category` (`id`, `name`) VALUES
	(1, 'test-category'),
	(2, 'test-category2');
/*!40000 ALTER TABLE `t_category` ENABLE KEYS */;

-- 正在导出表  blog.t_comment 的数据：~0 rows (大约)
DELETE FROM `t_comment`;
/*!40000 ALTER TABLE `t_comment` DISABLE KEYS */;
INSERT INTO `t_comment` (`id`, `content`, `parent`, `user_id`, `article_id`) VALUES
	(1, 'test-comment', NULL, 1, 1),
	(2, 'test-comment2', NULL, 2, 2);
/*!40000 ALTER TABLE `t_comment` ENABLE KEYS */;

-- 正在导出表  blog.t_tag 的数据：~0 rows (大约)
DELETE FROM `t_tag`;
/*!40000 ALTER TABLE `t_tag` DISABLE KEYS */;
INSERT INTO `t_tag` (`id`, `name`) VALUES
	(1, 'test-tag'),
	(2, 'test-tag2');
/*!40000 ALTER TABLE `t_tag` ENABLE KEYS */;

-- 正在导出表  blog.t_user 的数据：~0 rows (大约)
DELETE FROM `t_user`;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`id`, `username`, `password`) VALUES
	(1, 'test-user', 'test-password'),
	(2, 'test-user2', 'test-password2');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
