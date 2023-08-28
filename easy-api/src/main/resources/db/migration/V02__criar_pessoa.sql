CREATE SEQUENCE PESSOA_SEQ
INCREMENT BY 1
MINVALUE 1
START WITH 1;

CREATE TABLE PESSOA
(
    ID_PESSOA              BIGINT DEFAULT nextval('PESSOA_SEQ') PRIMARY KEY NOT NULL,
    NOME                   VARCHAR(100) NOT NULL,
    ATIVO                  BOOL NOT NULL,
    DATA_CRIACAO           TIMESTAMP NULL,
    DATA_ATUALIZACAO       TIMESTAMP NULL
);

INSERT INTO pessoa
(id_pessoa, nome, ativo, data_criacao, data_atualizacao)
VALUES(1, 'Telmo Ricardo', true, '2023-08-25 23:22:48.552', NULL);
INSERT INTO pessoa
(id_pessoa, nome, ativo, data_criacao, data_atualizacao)
VALUES(2, 'Valdineia Martins', true, '2023-08-26 01:33:45.068', NULL);