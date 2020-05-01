
-- user表插入
insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('admin','Aa123456',2);

insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('皮皮虾','Aa123456',1);
insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('小六子','Aa123456',1);
insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('二麻子','Aa123456',1);
insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('钱串子','Aa123456',1);

insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('彬南电器厂','Aa123456',3);
insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('金鱼电器厂','Aa123456',3);
insert into user (USER_NAME,PASSWORD,USER_TYPE) values ('大商电器厂','Aa123456',3);


-- usermessage表插入
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (1,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/55ac239480c12c7a.jpg','大商物业');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (2,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/8a51146ffdab3502.jpg','赵皮皮');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (3,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/e57e5d0f5acbbafe.jpg','钱六六');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (4,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/2f85ac4d5647c110.jpg','孙麻子');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (5,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/91e0d9beb64f6c56.jpg','李二狗');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (6,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/f45ffffcf1ae294e.jpg','宁海县彬南电器厂');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (7,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/deb8f1b0597268cd.jpg','金龙鱼精细电器厂');
insert into usermessage (USER_ID,CID,ADDRESS,TEL_NUMBER,EMAIL,PIC,user_name) value (8,'612701111111111111','辽宁省大连市金州开发区图强街123号','13300001111','564654156@qq.com','http://i1.fuimg.com/717891/a031414e293864b7.jpg','大商自营电器厂');



-- brand表插入
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('华为','http://i1.fuimg.com/717891/801347d507715b12.jpg','诚信(Integrity)、专业(Professional)、创新(Innovation)');
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('三星','http://i1.fuimg.com/717891/4ed13a55712a4315.jpg','创新生活、移动时尚、健康生活');
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('松下','http://i1.fuimg.com/717891/98945ed3216c835f.png','A Better Life A Better World');
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('美的','http://i1.fuimg.com/717891/d8c6264f578d5481.png','原来生活可以更美的');
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('格力','http://i1.fuimg.com/717891/5bb5de41ed1ad02d.png','格力,让世界爱上中国造');
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('西门子','http://i1.fuimg.com/717891/0d4695cbe7785095.png','博大精深 同心致远');
insert into brand (BRAND_NAME,BRAND_PICTURE,BRAND_INTRODUCTION) values ('方太','http://i1.fuimg.com/717891/9388cca7ba6bc0c5.png','让家的感觉更好');



-- product表插入
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('Huawei P40 Pro智能手机','华为','5899','全时超清画质，超感知徕卡三摄','http://i2.tiimg.com/717891/c22f6566332b09f8.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('华为watch GT2','华为','1499','超强续航，运动健身，时刻关注身体健康','http://i2.tiimg.com/717891/7d9a492fabd73ab6.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('三星s20','三星','9999','一亿像素，4倍光学变焦，100倍变焦，超级夜景，安卓机皇','http://i2.tiimg.com/717891/6ba5255279ed01d0.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('三星臻尊W899','三星','11500','“臻尊”W899是中电信与三星联合推出的一款巅峰之作。','http://i2.tiimg.com/717891/62aaf48f0c4f9326.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('松下豪华商用微波炉','松下','8300','强大15段火力烹饪','http://i1.fuimg.com/717891/11a6db69da759036.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('松下电磁炉','松下','1250','电磁炉进入IR火力是时代','http://i1.fuimg.com/717891/65b1dcc0f5844758.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('美的电饭煲','美的','1249','一键柴火饭，黄晶内丹，拉丝不锈钢机身','http://i1.fuimg.com/717891/b5d3998bb0a43a01.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('美的热水器','美的','5899','安全分隔设计，热水快速，超大容量','http://i1.fuimg.com/717891/59cd17b38130b66c.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('格力变频空调','格力','3299','蒸发自清洁，省电更省心','http://i1.fuimg.com/717891/0079bbc076452ce8.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('格力净水器','格力','3599','高标准，喝上放心水','http://i1.fuimg.com/717891/a40e10d76974d349.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('西门子双开门冰箱','西门子','5899','更大空间，持久保鲜，省电设计','http://i1.fuimg.com/717891/1d0ca6ccf3c36a3b.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('西门子滚筒洗衣机','西门子','4299','8公斤静音变频，时尚豪华，3期免息','http://i1.fuimg.com/717891/34e533383a6d6640.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('方太油烟机','方太','6199','超强吸力，环保静音，科学设计','http://i1.fuimg.com/717891/e8294d92eef10e0a.jpg');
insert into product (PRODUCT_NAME,PRODUCT_BRAND,PRICE,DESCRIPTION,PIC) values ('方太燃气灶','方太','1499','多档位可调，时尚前卫','http://i1.fuimg.com/717891/c8d67e98d7130004.jpg');


