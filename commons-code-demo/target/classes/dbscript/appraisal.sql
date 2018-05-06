-- ----------------------------
-- Table structure for `appraisal`
-- ----------------------------
-- DROP TABLE IF EXISTS `appraisal`;
CREATE TABLE `appraisal` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `talent_id` bigint(20) NOT NULL   COMMENT '人才id',  
    `name` varchar(20)    COMMENT '姓名',  
    `profession` varchar(2)    COMMENT '职位',  
    `experience` varchar(2)    COMMENT '工作经验',  
    `province` varchar(100)    COMMENT '省',  
    `city` varchar(100)    COMMENT '市',  
    `county` varchar(100)    COMMENT '县',  
    `work_condition` varchar(2)    COMMENT '工作状态',  
    `comment` varchar(500)    COMMENT '说明',  
    `skill_explain` varchar(20)    COMMENT '技能图例',  
    `knowledge` varchar(50)    COMMENT '知识结构',  
    `knowledge_exceed` bigint(20)    COMMENT '知识结构超过',  
    `project_remark` varchar(500)    COMMENT '项目评语',  
    `profession_quality` varchar(50)    COMMENT '职业素养',  
    `profession_exceed` bigint(20)    COMMENT '职业素养超过',  
    `quality_remark` varchar(500)    COMMENT '素养评语',  
    `project` varchar(50)    COMMENT '项目经验',  
    `project_exceed` bigint(20)    COMMENT '项目经验超过',  
    `skill_remark` varchar(500)    COMMENT '素养评语',  
    `skill_award_marks` varchar(255)    COMMENT '项目加分项',  
    `basic_information` varchar(2)    COMMENT '基础信息调查',  
    `work_record` varchar(2)    COMMENT '工作履历调查',  
    `work_ability` bigint(20)    COMMENT '工作能力程度',  
    `post` bigint(20)    COMMENT '岗位匹配程度',  
    `talent_grade` varchar(2)    COMMENT '人才等级',  
    `synthesize` bigint(20)    COMMENT '综合评定',  
    `sources_sum` bigint(20)    COMMENT '得分总计',  
    `min_pay` bigint(20)    COMMENT '最少薪资',  
    `max_pay` bigint(20)    COMMENT '最大薪资',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人id',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人id',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





