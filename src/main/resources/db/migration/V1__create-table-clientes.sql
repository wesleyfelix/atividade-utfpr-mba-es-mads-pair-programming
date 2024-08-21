create table clientes(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    idade int not null,
    primary key(id)
);

INSERT INTO clientes (nome, email, idade)
VALUES ('João', 'joao@exemplo.com', 30);
INSERT INTO clientes (nome, email, idade)
VALUES ('Maria', 'maria@exemplo.com', 25);
