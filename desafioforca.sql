create database desafioforca;

use desafioforca;

create table situacao(
	id int auto_increment primary key,
    nome varchar(255)
);

create table dificuldade(
	id int auto_increment primary key,
    nome varchar(255)
);

create table jogo(
	id int auto_increment primary key,
    nome varchar(200),
    idDificuldade int,
    vidas int,
    palavra varchar(255),
    chute varchar(255),
    idSituacao int,
    dataInicio datetime,
    dataFim datetime,
    FOREIGN KEY (idDificuldade)
      REFERENCES dificuldade(id)
);

insert into dificuldade(nome)
values('facil'),('medio'),('dificil');

insert into Situacao(nome)
values('iniciado'),('perdido'),('finalizado'),('abandonado');

