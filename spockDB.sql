--CREATE database spockDB;

--CREATE TABLE usuario(
--	id int NOT NULL PRIMARY KEY,
--	nome VARCHAR(255)
--);

--CREATE TABLE produto(
--	id int NOT NULL PRIMARY KEY,
--	nome VARCHAR(255),
--	tipo VARCHAR(200)
--);

--CREATE TABLE permissao(
--	id int NOT NULL PRIMARY KEY,
--	id_usuario int,
--	tipo VARCHAR(200),
--	FOREIGN KEY (id_usuario) REFERENCES usuario(id)
--);

--CREATE TABLE preco(
--	id int NOT NULL PRIMARY KEY,
--	id_produto int,
--	valor VARCHAR(200),
--	FOREIGN KEY (id_produto) REFERENCES produto(id));