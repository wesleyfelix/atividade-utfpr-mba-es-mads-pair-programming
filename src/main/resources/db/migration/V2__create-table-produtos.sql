create table produtos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    categoria varchar(50) not null,
    preco decimal(10, 2) not null,
    quantidade int not null,
    primary key(id)
);

INSERT INTO produtos (id, nome, categoria, preco, quantidade) VALUES (1, 'Notebook', 'Eletrônicos', 3500.00, 10);
INSERT INTO produtos (id, nome, categoria, preco, quantidade) VALUES (2, 'Smartphone', 'Eletrônicos', 2000.00, 20);
INSERT INTO produtos (id, nome, categoria, preco, quantidade) VALUES (3, 'Mesa de Escritório', 'Móveis', 450.50, 15);
INSERT INTO produtos (id, nome, categoria, preco, quantidade) VALUES (4, 'Cadeira Gamer', 'Móveis', 850.99, 5);
INSERT INTO produtos (id, nome, categoria, preco, quantidade) VALUES (5, 'Impressora', 'Eletrônicos', 600.00, 8);
