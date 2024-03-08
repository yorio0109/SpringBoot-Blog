CREATE DATABASE IF NOT EXISTS blog CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE blog;

CREATE TABLE `posts` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `title` VARCHAR(255) NOT NULL,
  `content` TEXT NOT NULL,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `posts` (`title`, `content`) VALUES ('サンプルタイトル1', 'サンプルコンテンツ1');
INSERT INTO `posts` (`title`, `content`) VALUES ('サンプルタイトル2', 'サンプルコンテンツ2');
INSERT INTO `posts` (`title`, `content`) VALUES ('サンプルタイトル3', 'サンプルコンテンツ3');
INSERT INTO `posts` (`title`, `content`) VALUES ('サンプルタイトル4', 'サンプルコンテンツ4');
INSERT INTO `posts` (`title`, `content`) VALUES ('サンプルタイトル5', 'サンプルコンテンツ5');

