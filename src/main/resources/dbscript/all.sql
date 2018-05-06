-- ----------------------------
-- Table structure for `user`
-- ----------------------------
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `open_id` varchar(30) NOT NULL   COMMENT '微信OpenID',  
    `phone` varchar(15) NOT NULL   COMMENT '手机号',  
    `email` varchar(30) NOT NULL   COMMENT '邮箱',  
    `password` varchar(18) NOT NULL   COMMENT '密码',  
    `nick_name` varchar(18) NOT NULL   COMMENT '昵称',  
    `grade` tinyint(2) NOT NULL   COMMENT '年级',  
    `avatar` varchar NOT NULL   COMMENT '头像url',  
    `adress` varchar(10) NOT NULL   COMMENT '省份+市区',  
    `status` tinyint(1) NOT NULL   COMMENT '是否冻结',  
    `sex` tinyint(1) NOT NULL   COMMENT '性别',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `article`
-- ----------------------------
-- DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `title` varchar(25) NOT NULL   COMMENT '标题',  
    `type` tinyint(1) NOT NULL   COMMENT '分类',  
    `cover` varchar NOT NULL   COMMENT '封面url',  
    `author` varchar(14) NOT NULL   COMMENT '作者',  
    `summary` varchar(28) NOT NULL   COMMENT '简介',  
    `status` tinyint(1) NOT NULL   COMMENT '状态（上下架）',  
    `content` longtext NOT NULL   COMMENT '内容',  
    `collected_number` int NOT NULL   COMMENT '被收藏数',  
    `liked_number` int NOT NULL   COMMENT '被点赞数',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `video`
-- ----------------------------
-- DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `title` varchar(25) NOT NULL   COMMENT '标题',  
    `type` tinyint(1) NOT NULL   COMMENT 'banner/car',  
    `grade` tinyint(2) NOT NULL   COMMENT '年级',  
    `subject` tinyint NOT NULL   COMMENT '科目',  
    `teacher_id` tinyint NOT NULL   COMMENT '老师id',  
    `status` tinyint(1) NOT NULL   COMMENT '是否冻结',  
    `url` varchar NOT NULL   COMMENT '视频url',  
    `cover` varchar NOT NULL   COMMENT '视频封面',  
    `summary` varchar(28) NOT NULL   COMMENT '简介',  
    `content` longtext NOT NULL   COMMENT '正文',  
    `collected_number` int NOT NULL   COMMENT '收藏数',  
    `liked_number` int NOT NULL   COMMENT '点赞数',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
-- DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `nick_name` varchar(30) NOT NULL   COMMENT '昵称',  
    `avatar` varchar(255) NOT NULL   COMMENT '头像url',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `user_sign`
-- ----------------------------
-- DROP TABLE IF EXISTS `user_sign`;
CREATE TABLE `user_sign` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `user_id` bigint(20) NOT NULL   COMMENT '用户id',  
    `total_sign` int NOT NULL   COMMENT '累计签到数',  
    `max_sign` tinyint NOT NULL   COMMENT '最大连续签到',  
    `continuous_number` tinyint NOT NULL   COMMENT '连续签到',  
    `record_sign` char(35) NOT NULL   COMMENT '签到记录',  
    `bean` int NOT NULL   COMMENT '逆袭豆',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `user_article`
-- ----------------------------
-- DROP TABLE IF EXISTS `user_article`;
CREATE TABLE `user_article` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `user_id` bigint(20) NOT NULL   COMMENT '用户id',  
    `article_id` bigint(20) NOT NULL   COMMENT '文章id',  
    `collection_status` tinyint(1) NOT NULL   COMMENT '收藏状态',  
    `liked_status` tinyint(1) NOT NULL   COMMENT '点赞状态',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `user_video`
-- ----------------------------
-- DROP TABLE IF EXISTS `user_video`;
CREATE TABLE `user_video` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `user_id` bigint(20) NOT NULL   COMMENT '用户id',  
    `video_id` bigint(20) NOT NULL   COMMENT '文章id',  
    `collection_status` tinyint(1) NOT NULL   COMMENT '收藏状态',  
    `liked_status` tinyint(1) NOT NULL   COMMENT '点赞状态',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `temporary_data`
-- ----------------------------
-- DROP TABLE IF EXISTS `temporary_data`;
CREATE TABLE `temporary_data` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `open_id` varchar NOT NULL   COMMENT 'openID',  
    `access_token` varchar NOT NULL   COMMENT '授权token',  
    `email_code` int(5) NOT NULL   COMMENT '邮件激活码',  
    `phone_code` int(5) NOT NULL   COMMENT '手机激活码',  
    `email_code_times` tinyint(1) NOT NULL   COMMENT '邮件当天激活次数',  
    `phone_code_times` tinyint(1) NOT NULL   COMMENT '手机当天激活次数',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `module`
-- ----------------------------
-- DROP TABLE IF EXISTS `module`;
CREATE TABLE `module` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(10) NOT NULL   COMMENT '模块名',  
    `url` varchar(255) NOT NULL   COMMENT 'url',  
    `parent_id` bigint(20) NOT NULL   COMMENT '父模块',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `role`
-- ----------------------------
-- DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `role_name` varchar(10) NOT NULL   COMMENT '角色名',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `module_role`
-- ----------------------------
-- DROP TABLE IF EXISTS `module_role`;
CREATE TABLE `module_role` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `role_id` bigint(20) NOT NULL   COMMENT '角色id',  
    `module_id` bigint(20) NOT NULL   COMMENT '模块id',  
    `create_by` varchar(10) NOT NULL   COMMENT '创建人',  
    `update_by` varchar(10) NOT NULL   COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
-- DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `role_id` bigint(20) NOT NULL   COMMENT '角色id',  
    `salt` varchar(255) NOT NULL   COMMENT '盐',  
    `username` varchar(20) NOT NULL   COMMENT '用户名',  
    `password` varchar(20) NOT NULL   COMMENT '密码',  
    `phone` varchar(15) NOT NULL   COMMENT '手机',  
    `create_by` varchar(10)    COMMENT '创建人',  
    `update_by` varchar(10)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





