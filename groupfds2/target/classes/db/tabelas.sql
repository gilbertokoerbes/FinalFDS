/* 
SCRIPT SQL PARA CRIAR AS TABELAS EM UM SERVIDOR DE BANCO DE DADOS
SQL BASEADO EM JAVADB
*/


create table aux_tipo_logradouro(
    id_tipo numeric(3) not null,
    nome char(50) not null,
    abrev char(5) not null,
    primary key (id_tipo)
)


create table aux_tipo_contato(
    id_tipo numeric(3) not null,
    nome char(50) not null,
    abrev char(5) not null,
    primary key(id_tipo)
)

create table aux_tipo_reclamacao(
    id_tipo numeric(3) not null,
    categoria_reclamacao varchar(50) not null,
    secretaria_responsavel varchar(5) not null,
    primary key(id_tipo)
)

create table cidadao(
    id_cidadao numeric(9) not null,
    cpf numeric(11) not null,
    nome varchar(254) not null,
    primary key (id_cidadao)
)


create table empresas(
    id_empresa numeric(6) not null,
    cnpj numeric(14) not null,
    razao_social varchar(255) not null,
    responsavel numeric(9) not null,
    primary key(id_empresa),
    foreign key(responsavel) references cidadao(id_cidadao)
)


create table usuario(
    id_usuario numeric(9) not null,
    usuario_empresa boolean,
    id_cidadao numeric(9),
    id_empresa numeric(6),
    senha varchar(50) not null,
    primary key (id_usuario),
    foreign key(id_cidadao) references cidadao(id_cidadao),
    foreign key(id_empresa) references empresas(id_empresa)
)


create table bairros(
    id_bairro numeric(3) not null,
    nome varchar(254) not null,
    abreviatura varchar(10),
    zona_geo char(1) not null,
    primary key(id_bairro)
)


create table enderecos(
    id_endereco numeric(9) not null,
    id_usuario numeric(9) not null,
    tipo_logradouro numeric(3) not null,
    logradouro char(254) not null,
    numero numeric(6) not null,
    complemento varchar(50),
    bairro numeric(3) not null,
    cep numeric(8) not null,
    primary key(id_endereco),
    foreign key(id_usuario) references usuario(id_usuario),
    foreign key(tipo_logradouro) references aux_tipo_logradouro(id_tipo),
    foreign key(bairro) references bairros(id_bairro)
)

create table contatos(
    id_contato numeric(12) not null,
    id_usuario numeric(9) not null, 
    tipo_contato numeric(3) not null,
    dados varchar(255) not null,
    primary key (id_contato), 
    foreign key (id_usuario) references usuario(id_usuario),
    foreign key (tipo_contato) references aux_tipo_contato(id_tipo)
)

create table reclamacao_dados(
    id_reclamacao numeric(9) not null,
    id_usuario numeric(9) not null,
    data_cadastro date not null,
    categoria_reclamacao numeric(3) not null,
    endereco_reclamacao numeric(9) not null,
    status_reclamacao varchar(5) not null,
    reclamacao_concluida binary,
    primary key (id_reclamacao),
    foreign key (id_usuario) references usuario(id_usuario),
    foreign key (categoria_reclamacao) references aux_tipo_reclamacao(id_tipo),
    foreign key (endereco_reclamacao) references enderecos(id_enderecos)
)

create table reclamacoes_base(
    
    
    )