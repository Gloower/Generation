USE db_blogspring;
INSERT INTO tb_postagens (data, texto, titulo)
VALUES (current_timestamp(), 'Olá hoje eu estou com a minha namorada incrivel', 'Primeira postagem');
INSERT INTO tb_postagens (data, texto, titulo)
VALUES (current_timestamp(), 'Hoje vou comer chocolate com a minha namorada incrivel', 'Segunda postagem');
INSERT INTO tb_postagens(data, texto, titulo)
VALUES(CURRENT_TIMESTAMP(), 'Amo ela! <3', 'Terceira postagem desse blog top!');


SELECT * FROM tb_postagens;