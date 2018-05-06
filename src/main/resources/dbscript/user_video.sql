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





