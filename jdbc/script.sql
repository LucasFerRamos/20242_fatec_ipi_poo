-- Active: 1731007712846@@127.0.0.1@5432@20242_fatec_ipi_poo_pessoas@public
SELECT * from tb_pessoa
ORDER BY cod_pessoa;
DELETE  FROM tb_pessoa WHERE cod_pessoa=3;
-- SELECT * from tb_pessoa;


-- UPDATE tb_pessoa set nome='José da Silva'
-- WHERE cod_pessoa=2;


-- Select * from tb_pessoa WHERE nome LIKE 'J%';

-- SELECT *  from tb_pessoa where  cod_pessoa='2';




-- SELECT * from tb_pessoa;
-- select cod_pessoa, nome, telefone, email from tb_pessoa;

-- SELECT nome, email from tb_pessoa;

-- INSERT INTO tb_pessoa (nome, telefone, email)
-- VALUES 
-- ('João','44774477', 'joao@email.com'),
-- ('Maria', '77889966', 'maria@email.com');




-- INSERT INTO tb_pessoa (nome, telefone, email)
-- VALUES ('Jose', '11223344', 'jose@email.com');








-- CREATE TABLE tb_pessoa(
--     cod_pessoa SERIAL PRIMARY KEY,
--     nome VARCHAR(200),
--     telefone VARCHAR(200),
--     email VARCHAR(200)
-- ); 