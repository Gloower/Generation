CREATE DATABASE DB_RPG;

USE DB_RPG;

CREATE TABLE TB_CLASSE(

ID BIGINT AUTO_INCREMENT,
NOME VARCHAR(255),
ARMA VARCHAR(255),
DESCRICAO VARCHAR (255),
PRIMARY KEY(ID)
);

CREATE TABLE TB_PERSONAGEM(
ID BIGINT AUTO_INCREMENT,
NOME VARCHAR(255),
RACA VARCHAR(255),
ATAQUE DOUBLE,
DEFESA DOUBLE,
HP INT,
PRIMARY KEY (ID),
CLASSE_ID BIGINT,
FOREIGN KEY (CLASSE_ID) REFERENCES TB_CLASSE(ID)
);

SELECT * FROM TB_CLASSE;
SELECT * FROM TB_PERSONAGEM;

INSERT INTO TB_CLASSE (NOME, ARMA, DESCRICAO) VALUES ("ladrao","double adaga","rouba");
INSERT INTO TB_CLASSE (NOME, ARMA, DESCRICAO) VALUES ("maga","cajado","solta magia");
INSERT INTO TB_CLASSE (NOME, ARMA, DESCRICAO) VALUES ("paladino","espada grande","pela fe");

INSERT INTO TB_PERSONAGEM (NOME, RACA, ATAQUE, DEFESA, HP, CLASSE_ID) VALUES ("Nicolas"," humano", 2000, 700, 1000,1);

SELECT TB_PERSONAGEM.NOME, TB_PERSONAGEM.RACA FROM TB_PERSONAGEM INNER JOIN TB_CLASSE ON TB_CLASSE.ID = TB_PERSONAGEM.CLASSE_ID

SELECT TB_PERSONAGEM.NOME, TB_PERSONAGEM.RACA FROM TB_PERSONAGEM INNER JOIN TB_CLASSE ON TB_CLASSE.ID = TB_PERSONAGEM.CLASSE_ID WHERE TB_CLASSE.NOME = 'ladrao'









