USE db_blogspring;
INSERT INTO tb_temas (data, temas_descrição, temas_nome)
VALUES (current_timestamp(), 'Olá hoje eu estou com a minha namorada incrivel', 'Nós');
INSERT INTO tb_temas (data, temas_descrição, temas_nome)
VALUES (current_timestamp(), 'Hoje vou comer chocolate com a minha namorada incrivel', 'A gente');
INSERT INTO tb_temas(data, temas_descrição, temas_nome)
VALUES(CURRENT_TIMESTAMP(), 'Amo ela! <3', 'Ela');


SELECT * FROM tb_temas;