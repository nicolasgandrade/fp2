drop database if exists Hotel;
create database Hotel;
use Hotel;

create table Cargos (
	id int primary key auto_increment,
    nome_cargo varchar(30)
);

insert into Cargos (nome_cargo) values (
	"Gerente"
),
(
	"Funcionário"
);

create table Usuarios (
	id int primary key auto_increment,
    nome varchar(255),
    nome_usuario varchar(30) unique,
    senha varchar(30),
    cargo_id int references Cargos(id)
);

insert into Usuarios (nome, nome_usuario, senha, cargo_id) values (
	"Administrador",
	"admin",
    "admin",
    1
),
(
	"Carlos Peçanha",
	"pecanha",
    "123",
    2
),
(
	"Fátima Silva",
	"fatima",
    "fafa123",
    2
);

create table Hospedes (
	id int primary key auto_increment,
    nome varchar(255) not null,
    telefone varchar(20),
    email varchar(60) unique,
    documento varchar(60) not null
);

insert into Hospedes (nome, telefone, email, documento) values (
	"João da Silva",
    "5515998767456",
    "joao.da.silva@hotel.com",
    "38746589234"
),
(
	"Pedro Mendonça",
    "5576384637484",
    "pedro.mendonca@hotel.com",
    "638929873784"
),
(
	"Joana Darc",
    "12492787387287",
    "joana.darc@hotel.com",
    "032923897828"
),
(
	"Carlos Ortega",
    "9828874839982",
    "carlos.ortega@hotel.com",
    "9837487892395233425"
),
(
	"John McLean",
    "1237846578737",
    "john.mclean@hotel.com",
    "981351309834729385"
),
(
	"Manoel Juarez",
    "837485661123",
    "manoel.juarez@hotel.com",
    "932874838298"
);

create table Categorias (
	id int primary key auto_increment,
    nome varchar(30)
);

insert into Categorias (nome) values (
	"Solteiro"
),
(
	"Duplo solteiro"
),
(
	"Casal"
),
(
	"Dormitório"
);

create table Quartos (
	numero int primary key auto_increment,
    andar int,
    categoria_id int references Categorias(id),
    ocupado boolean
);

insert into Quartos values (
	1,
    1,
    1,
    false
),
(
	2,
    1,
    2,
    true
),
(
	3,
    1,
    3,
    false
),
(
	4,
    1,
    4,
    false
),
(
	5,
    1,
    2,
    false
),
(
	6,
    2,
    1,
    false
),
(
	7,
    2,
    2,
    true
),
(
	8,
    2,
    3,
    false
),
(
	9,
    2,
    4,
    false
),
(
	10,
    2,
    2,
    false
),
(
	11,
    3,
    1,
    false
),
(
	12,
    3,
    2,
    false
),
(
	13,
    3,
    3,
    false
),
(
	14,
    3,
    4,
    true
),
(
	15,
    3,
    2,
    false
);

create table Reservas (
	id int primary key auto_increment,
    numero_quarto int references Quartos(numero),
    hospede_id int references Hospedes(id),
    entrada datetime not null default now(),
    saida datetime
);

insert into Reservas (numero_quarto, hospede_id, entrada, saida) values (
	7,
    2,
    '2022-08-10 14:00:00',
    '2022-08-17 10:00:00'
),
(
	2,
    1,
    '2022-06-01 13:23:54',
    '2022-06-22 10:11:32'
),
(
	14,
    3,
    '2022-08-12 13:40:52',
    '2022-08-20 10:22:32'
);
