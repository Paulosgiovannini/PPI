use eng2020_1_atividade_aula02;

CREATE TABLE usuario (
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (username))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

insert into usuario (username, password)
values
('paulo@santana.com', '*9g/YI¨a>?UÅ½');
/* a senha usada foi paulo */

