-- ----------------------------
-- Table structure for `skill`
-- ----------------------------
-- DROP TABLE IF EXISTS `skill`;
CREATE TABLE `skill` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `talent_id` bigint(20) NOT NULL   COMMENT '人才id',  
    `appraisal_id` bigint(20) NOT NULL   COMMENT '测评报告id',  
    `occupation_id` bigint(20) NOT NULL   COMMENT '职业id',  
    `parent_id` bigint(20) NOT NULL   COMMENT '父id',  
    `name` varchar(50)    COMMENT '姓名',  
    `content` varchar(500)    COMMENT '技能介绍',  
    `priority` int(10)    COMMENT '级别',  
    `sort` smallint(6)    COMMENT '排序',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人id',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人id',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





