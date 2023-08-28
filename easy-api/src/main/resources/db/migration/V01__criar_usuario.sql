CREATE SEQUENCE USUARIO_SEQ
INCREMENT BY 1
MINVALUE 1
START WITH 1;

CREATE TABLE USUARIO
(
    ID_USUARIO             BIGINT DEFAULT nextval('USUARIO_SEQ') PRIMARY KEY NOT NULL,
    NOME                   VARCHAR(100) NOT NULL,
    EMAIL                  VARCHAR(100) NOT NULL,
    SENHA                  VARCHAR(100) NOT NULL,
    DATA_CRIACAO           TIMESTAMP NULL,
    DATA_ATUALIZACAO       TIMESTAMP NULL
);

INSERT INTO usuario
(id_usuario, nome, email, senha, data_criacao, data_atualizacao)
VALUES(1, 'Administrador', 'telmoricardo@gmail.com', '123', '2023-08-26 01:00:48.235', NULL);
INSERT INTO usuario
(id_usuario, nome, email, senha, data_criacao, data_atualizacao)
VALUES(2, 'Morador', 'valdineia@gmail.com', '321', '2023-08-26 01:18:48.771', NULL);