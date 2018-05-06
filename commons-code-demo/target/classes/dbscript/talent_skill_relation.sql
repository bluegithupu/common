-- ----------------------------
-- Table structure for `talent_skill_relation`
-- ----------------------------
-- DROP TABLE IF EXISTS `talent_skill_relation`;
CREATE TABLE `talent_skill_relation` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `skill_id` bigint(20) NOT NULL   COMMENT '技能树id',  
    `talent_id` bigint(20) NOT NULL   COMMENT '人才id',  
    `degree` int(10)    COMMENT '等级',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人id',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人id',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





