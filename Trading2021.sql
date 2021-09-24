create database Trading2021
go

use Trading2021
go
 
select * from Categories


create table Categories
(
   ID varchar(6) primary key,
   [name] nvarchar(30) ,
   describe nvarchar(50), 
)
go

insert into Categories values('N','Nokia',N'gọn nhẹ, pin lâu')
insert into Categories values('S','Samsung',N'dáng đẹp, nhiều chức năng')
insert into Categories values('IP','Iphone',N'Hiện đại, chụp ảnh 20GPixel...')
insert into Categories values('Ga','Galaxy',N'Hiện đại, chụp ảnh 10GPixel...')
go

create table products
(
   ID varchar(8)  primary key,
   [name] varchar(30) ,
   cat_ID varchar(6) references Categories(ID),
   [image] varchar(100),
   price float,
   quantity int,
   describe nvarchar(50),
   status nvarchar(20),
   adddate datetime, 
)
go

insert into products values('N8','Nokia N8','N','images/8800.jpg',
                              2300,12,N'Màu hồng cho nữ ','còn hàng','8/5/2019')
insert into products values('E72','Nokia E72','N','images/B2000.jpg',
                              3200,12,N'Màu đồng cho nam',N'hết hàng','2/12/2019')
insert into products values('S2','Samsung Corby II','S','images/X500.jpg',
                              3400,8,N'Lướt Web thoải gà mái','còn hàng','4/13/2019')
insert into products values('E1050','Samsung E1050','S','images/X300.jpg',
                              2100,10,N'Pin lâu','còn hàng','3/23/2019')
insert into products values('S23','Samsung E1050','S','images/X300.jpg',
                              2100,10,N'Pin lâu','còn hàng','5/19/2019')
insert into products values('E19','Nokia E72','N','images/B2000.jpg',
                              3200,12,N'chụp ảnh đẹp','còn hàng','5/13/2019')
insert into products values('S22','Samsung Corby II','S','images/X500.jpg',
                              3400,8,N'lướt web đỉnh','còn hàng','4/20/2019')
insert into products values('E10','Samsung E1050','S','images/X300.jpg',
                              2100,10,N'nồi đồng cối đá','còn hàng','10/12/2018')
insert into products values('S28','Samsung E1050','S','images/X300.jpg',   
                             2100,10,N'đập không vỡ','còn hàng','10/12/2018')
go
