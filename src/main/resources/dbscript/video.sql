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





