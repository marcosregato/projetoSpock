--CREATE database spockDB;

CREATE table usuario( 
	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,
	nome varchar(255)
);
CREATE table produto(
	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,
	nome varchar(255),
	tipo varchar(200)
);
CREATE table permissao(
	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,
	id_usuario INTEGER,
	tipo varchar(200),
	FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);
CREATE table preco(

	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,
	id_produto INTEGER NOT NULL,
	valor varchar(200),
	FOREIGN KEY (id_produto) REFERENCES produto(id)
)