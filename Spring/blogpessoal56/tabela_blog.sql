USE db_farmaciatop;
INSERT INTO tb_produtos (data, produto_nome, produto_descricao)
VALUES (current_timestamp(), 'Dipirona', 'Usado para dor de cabeça');
INSERT INTO tb_produtos (data, produto_nome, produto_descricao)
VALUES (current_timestamp(), 'Ibuprofeno', 'Usado para alguma coisa');
SELECT * FROM tb_produtos;