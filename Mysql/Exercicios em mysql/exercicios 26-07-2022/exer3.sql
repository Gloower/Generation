CREATE DATABASE DB_FARMACIA_BEM_ESTAR;

USE DB_FARMACIA_BEM_ESTAR;

CREATE TABLE TB_CATEGORIAS(
ID BIGINT AUTO_INCREMENT,
CLASSE VARCHAR(255),
FABRICANTE VARCHAR(255),
GENERICO BOOLEAN,
PRIMARY KEY (ID)
);

INSERT INTO TB_CATEGORIAS (CLASSE, FABRICANTE, GENERICO) VALUES ("Analgésico", "ache", true);
INSERT INTO TB_CATEGORIAS (CLASSE, FABRICANTE, GENERICO) VALUES ("Sedativo", "eurofarma", false);
INSERT INTO TB_CATEGORIAS (CLASSE, FABRICANTE, GENERICO) VALUES ("Sedativo", "bayer", false);
INSERT INTO TB_CATEGORIAS (CLASSE, FABRICANTE, GENERICO) VALUES ("Anticoagulantes", "sanofi", true);
INSERT INTO TB_CATEGORIAS (CLASSE, FABRICANTE, GENERICO) VALUES ("Analgésico", "eurofarma", true);

CREATE TABLE TB_PRODUTO(
ID BIGINT AUTO_INCREMENT,
NOME VARCHAR(255),
PRECO DECIMAL (8,2),
RECOMENDACAO VARCHAR(255),
HORA VARCHAR(255),
CATEGORIA_ID BIGINT,
PRIMARY KEY (ID),
FOREIGN KEY (CATEGORIA_ID) REFERENCES TB_CATEGORIAS(ID)
);

INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 29.99, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 1);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 37.99, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 2);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 38.99, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 3);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 60.00, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 1);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 49.99, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 2);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 56.78, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 1);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 4.99, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 3);
INSERT INTO TB_PRODUTO (NOME, PRECO, RECOMENDACAO, HORA, CATEGORIA_ID) VALUES ("Ibuprofeno", 17.99, "Trata-se de um princípio ativo que age contra inflamações não tão intensas","12-12 horas", 1);

SELECT TB_PRODUTO.NOME, TB_PRODUTO.PRECO, TB_PRODUTO.RECOMENDACAO, TB_PRODUTO.HORA, TB_CATEGORIAS.CLASSE, TB_CATEGORIAS.FABRICANTE, TB_CATEGORIAS.GENERICO FROM TB_PRODUTO INNER JOIN TB_CATEGORIAS ON TB_CATEGORIAS.ID = TB_PRODUTO.CATEGORIA_ID WHERE PRECO > 50;

SELECT TB_PRODUTO.NOME, TB_PRODUTO.PRECO, TB_PRODUTO.RECOMENDACAO, TB_PRODUTO.HORA, TB_CATEGORIAS.CLASSE, TB_CATEGORIAS.FABRICANTE, TB_CATEGORIAS.GENERICO FROM TB_PRODUTO INNER JOIN TB_CATEGORIAS ON TB_CATEGORIAS.ID = TB_PRODUTO.CATEGORIA_ID WHERE PRECO BETWEEN 5 AND 60; 

SELECT * FROM TB_PRODUTO WHERE NOME LIKE "%C%";

SELECT TB_PRODUTO.NOME, TB_PRODUTO.PRECO, TB_PRODUTO.RECOMENDACAO, TB_PRODUTO.HORA, TB_CATEGORIAS.CLASSE, TB_CATEGORIAS.FABRICANTE, TB_CATEGORIAS.GENERICO FROM TB_PRODUTO INNER JOIN TB_CATEGORIAS ON TB_CATEGORIAS.ID = TB_PRODUTO.CATEGORIA_ID;

SELECT TB_PRODUTO.NOME, TB_PRODUTO.PRECO, TB_PRODUTO.RECOMENDACAO, TB_PRODUTO.HORA, TB_CATEGORIAS.CLASSE, TB_CATEGORIAS.FABRICANTE, TB_CATEGORIAS.GENERICO FROM TB_PRODUTO INNER JOIN TB_CATEGORIAS ON TB_CATEGORIAS.ID = TB_PRODUTO.CATEGORIA_ID WHERE TB_CATEGORIAS.CLASSE = "Analgésico";