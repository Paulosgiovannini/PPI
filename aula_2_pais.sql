create database eng2020_1_Atividadade_Aula02
default character set utf8
default collate utf8_general_ci;

create table pais(
id int auto_increment,
nome varchar(100),
populacao bigint,
area numeric(15.2),
primary key (id)
) default charset = utf8;

insert into pais
(nome, populacao, area)
values
('Australia', '2460000', '7692000'),
('Holanda', '17180000', '41543'),
('Japao', '126800000', '377915'),
('Espanha', '46600000', '505990'),
('Russia', '144500000', '17100000');

describe pais;
select * from pais;


