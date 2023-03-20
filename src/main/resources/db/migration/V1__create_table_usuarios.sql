create table usuarios
(

    id          bigint not null auto_increment,
    nome        varchar(80),
    sobrenome   varchar(80),
    email       varchar(80),
    senha       varchar(30),
    rg          varchar(12),
    cpf         varchar(15),
    telefone    varchar(15),
    logradouro  varchar(80),
    numero      varchar(8),
    complemento varchar(50),
    bairro      varchar(50),
    cidade      varchar(80),
    cep         varchar(10),
    uf          char(5),


    primary key (id)

);