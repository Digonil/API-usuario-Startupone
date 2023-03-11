create table usuarios
(

    id                      bigint       not null auto_increment,
    nome                    varchar(80) not null,
    sobrenome               varchar(80) not null,
    email                   varchar(80) not null unique,
    rg                      varchar(12)   not null unique,
    cpf                     varchar(15) not null unique,
    telefone_residencial    varchar(15) ,
    telefone_celular        varchar(15) not null,
    logradouro              varchar(80) not null,
    numero                  varchar(8) not null,
    complemento             varchar(50),
    bairro                  varchar(50) not null,
    cidade                  varchar(80) not null,
    cep                     varchar(8) not null,
    uf                      char(2)    not null,


    primary key (id)

);