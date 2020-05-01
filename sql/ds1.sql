create table user(
	USER_ID INT primary key AUTO_INCREMENT,
    USER_NAME varchar(30) not null,
    PASSWORD varchar(30) not null,
    USER_TYPE INT NOT NULL
);

create table usermessage(
	USER_ID INT primary key,
    CID varchar(30) not null, 
    ADDRESS varchar(200) not null,
    TEL_NUMBER varchar(30) not null,
    EMAIL varchar(200) not null,
    PIC varchar(200) ,
    user_name varchar(200),
    foreign key(USER_ID) references user(USER_ID)
);



create table product(
	PRODUCT_ID INT primary key AUTO_INCREMENT,
    PRODUCT_NAME varchar(30) not null,
    PRODUCT_BRAND varchar(30) not null,
    PRICE INT NOT NULL,
    DESCRIPTION varchar(200) ,
    PIC varchar(200)
);


create table shoppingList(
    PRODUCT_ID INT not null,
    USER_ID INT not null,
    primary key(PRODUCT_ID,USER_ID), 
    foreign key(PRODUCT_ID) references product(PRODUCT_ID),
    foreign key(USER_ID) references user(USER_ID)
);

create table orders(
	ORDER_ID INT primary key AUTO_INCREMENT,
    PRODUCT_ID INT not null,
    USER_ID INT not null,
    NUMS INT not null,
    RECEIPT BOOL not null,
    foreign key(PRODUCT_ID) references product(PRODUCT_ID),
    foreign key(USER_ID) references user(USER_ID)
);

create table purchase(
	PURCHASE_ID INT primary key AUTO_INCREMENT,
    PRODUCT_ID INT not null,
    NUMS INT not null,
    foreign key(PRODUCT_ID) references product(PRODUCT_ID)
);

create table task(
	TASK_ID INT primary key AUTO_INCREMENT,
    TASK_STATE INT not null, 
    PRODUCT_ID INT not null,
    NUMS INT not null,
    PRICE INT,
    USER_ID INT,
    foreign key(PRODUCT_ID) references product(PRODUCT_ID),
    foreign key(USER_ID) references user(USER_ID)
);

create table firmProducts(
    PRODUCT_ID INT not null,
    USER_ID INT not null,
    PRICE INT NOT NULL,
    primary key(PRODUCT_ID,USER_ID), 
    foreign key(PRODUCT_ID) references product(PRODUCT_ID),
    foreign key(USER_ID) references user(USER_ID)
);

create table brand(
  BRAND_ID INT primary key AUTO_INCREMENT,
    BRAND_NAME varchar(200) not null,
  BRAND_PICTURE varchar(200) not null,
    BRAND_INTRODUCTION varchar(200) not null
);


