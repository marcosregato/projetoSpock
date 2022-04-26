--create database spockDB;

create table usuario(
	id int NOT NULL PRIMARY KEY,
	nome varchar(255)
);

create table produto(
	id int NOT NULL PRIMARY KEY,
	nome varchar(255)
);

create table permissao(
	id int NOT NULL PRIMARY KEY,
	id_usuario int,
	tipo varchar(200),
	FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);