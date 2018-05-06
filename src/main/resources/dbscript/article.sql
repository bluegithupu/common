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





