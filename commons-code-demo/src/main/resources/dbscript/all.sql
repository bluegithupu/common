-- ----------------------------
-- Table structure for `team`
-- ----------------------------
-- DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '团队名字',  
    `type` varchar(50)    COMMENT '团队属性(属于厂家还是第三方)',  
    `count` int    COMMENT '团队队员数量',  
    `belong_to_id` bigint    COMMENT '团队所属厂家或第三方id',  
    `belong_to_name` varchar(50)    COMMENT '团队所属厂家或第三方名字',  
    `is_forbidden` bit    COMMENT '团队是否被禁用',  
    `create_by` bigint    COMMENT '创建人ID',  
    `update_by` bigint    COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `member`
-- ----------------------------
-- DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '队员名字',  
    `phone` bigint    COMMENT '队员手机号',  
    `account` varchar(50)    COMMENT '队员账号',  
    `pwd` varchar(50)    COMMENT '队员密码',  
    `team_id` bigint    COMMENT '所属团队id',  
    `status` int    COMMENT '状态是(正常0，请假1，迟到2)',  
    `create_by` bigint    COMMENT '创建人ID',  
    `update_by` bigint    COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `leave`
-- ----------------------------
-- DROP TABLE IF EXISTS `leave`;
CREATE TABLE `leave` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `member_id` bigint    COMMENT '队员id',  
    `member_name` varchar(50)    COMMENT '队员姓名',  
    `member_phone` bigint    COMMENT '队员手机号',  
    `submit_at` bigint    COMMENT '请假申请提交时间',  
    `reason` varchar(500)    COMMENT '请假原因',  
    `start_at` bigint    COMMENT '假期开始时间',  
    `days` int    COMMENT '请假天数',  
    `verify_status` int    COMMENT '申请状态（申请中、通过、拒绝）',  
    `create_by` bigint    COMMENT '创建人ID',  
    `update_by` bigint    COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `late`
-- ----------------------------
-- DROP TABLE IF EXISTS `late`;
CREATE TABLE `late` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `member_id` bigint    COMMENT '队员id',  
    `task_id` int    COMMENT '任务id',  
    `task_storage` varchar(50)    COMMENT '任务对应库位',  
    `member_name` varchar(50)    COMMENT '队员名字',  
    `member_phone` bigint    COMMENT '队员手机号',  
    `dealer_id` bigint    COMMENT '经销商id',  
    `submit_at` bigint    COMMENT '迟到申请时间',  
    `task_at` bigint    COMMENT '任务计划开始时间',  
    `arrive_at` bigint    COMMENT '实际到场时间',  
    `img_url` varchar(500)    COMMENT '现场照片url',  
    `reason` varchar(500)    COMMENT '迟到原因',  
    `verify_status` int    COMMENT '申请状态',  
    `create_by` bigint    COMMENT '创建人ID',  
    `update_by` bigint    COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `vender`
-- ----------------------------
-- DROP TABLE IF EXISTS `vender`;
CREATE TABLE `vender` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '厂家名称',  
    `status` varchar(1)    COMMENT '状态 (禁用0 正常1)',  
    `manager_id` bigint    COMMENT '登录账号ID',  
    `create_by` bigint    COMMENT '创建时间',  
    `update_by` bigint    COMMENT '更新时间',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `distributor`
-- ----------------------------
-- DROP TABLE IF EXISTS `distributor`;
CREATE TABLE `distributor` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `company_name` varchar(50)    COMMENT '公司名称',  
    `company_short_name` varchar(50)    COMMENT '公司简称',  
    `privince` varchar（30）    COMMENT '省',  
    `city` varchar(30)    COMMENT '市',  
    `contacts_name` varchar（30）    COMMENT '联系人',  
    `contacts_post` varchar(30)    COMMENT '联系人岗位',  
    `contacts_phone` varchar(30)    COMMENT '联系人电话',  
    `internal_remark` varchar（300）    COMMENT '内部备注',  
    `suditor_remark` varchar（300）    COMMENT '审计员备注',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `create_by` bigint    COMMENT '创建人ID',  
    `update_by` bigint    COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `storage`
-- ----------------------------
-- DROP TABLE IF EXISTS `storage`;
CREATE TABLE `storage` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '库位名称',  
    `attribute` varchar    COMMENT '属性 (1本部库位、2二网库位、3临展库位)',  
    `latitude` varchar(10)    COMMENT '经度',  
    `longitude` varchar(10)    COMMENT '纬度',  
    `privince` varchar(20)    COMMENT '省',  
    `city` varchar(20)    COMMENT '市',  
    `address` varchar(100)    COMMENT '详细地址',  
    `contacts_name` varchar（30）    COMMENT '联系人',  
    `contacts_post` varchar(30)    COMMENT '联系人岗位',  
    `contacts_phone` varchar(30)    COMMENT '联系人电话',  
    `internal_remark` varchar（300）    COMMENT '内部备注',  
    `suditor_remark` varchar（300）    COMMENT '审计员备注',  
    `activity_start_time` bigint(20)    COMMENT '活动开始时间 (当属性为临展车位时使用)',  
    `activity_end_time` bigint(20)    COMMENT '活动结束时间 (当属性为临展车位时使用)',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `create_by` bigint    COMMENT '创建人ID',  
    `update_by` bigint    COMMENT '更新人ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `company`
-- ----------------------------
-- DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '公司名称',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `department`
-- ----------------------------
-- DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
    `id` bigint NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(50)    COMMENT '部门名称',  
    `status` varchar(1)    COMMENT '状态 (1正常0禁用)',  
    `company_id` bigint    COMMENT '公司ID',  
    `update_at` bigint NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




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





