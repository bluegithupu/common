-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
-- DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '员工名称',  
    `phone` varchar(20)    COMMENT '电话',  
    `email` varchar(30)    COMMENT '邮箱',  
    `school` varchar(20)    COMMENT '毕业学校',  
    `education` varchar(20)    COMMENT '学历',  
    `major` varchar(20)    COMMENT '专业',  
    `account` varchar(100)    COMMENT '账号',  
    `address` varchar（30）    COMMENT '籍贯',  
    `age` varchar(10)    COMMENT '年龄',  
    `induction_time` bigint    COMMENT '入职时间',  
    `city` varchar（300）    COMMENT '工作城市',  
    `company_id` bigint    COMMENT '公司id',  
    `company` varchar（300）    COMMENT '公司名称',  
    `department_id` bigint    COMMENT '部门id',  
    `department` varchar（300）    COMMENT '部门名称',  
    `position` varchar（300）    COMMENT '职位',  
    `card_img` varchar(100)    COMMENT '身份证',  
    `photo` varchar(100)    COMMENT '照片',  
    `diploma` varchar(100)    COMMENT '毕业证',  
    `skill_certificate` varchar(100)    COMMENT '技能证书',  
    `other_certificate` varchar(100)    COMMENT '其他证书',  
    `sign_agreement` varchar(100)    COMMENT '签订协议',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





