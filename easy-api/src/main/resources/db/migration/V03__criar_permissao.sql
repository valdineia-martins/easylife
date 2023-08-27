CREATE SEQUENCE PERMISSAO_SEQ
INCREMENT BY 1
MINVALUE 1
START WITH 1;

CREATE TABLE EASY_LIFE.PERMISSAO
(
    ID_PERMISSAO           BIGINT DEFAULT nextval('PERMISSAO_SEQ') PRIMARY KEY NOT NULL,
    DESCRICAO              VARCHAR(100) NOT NULL,
    DATA_CRIACAO           TIMESTAMP NULL,
    DATA_ATUALIZACAO       TIMESTAMP NULL
);

CREATE TABLE EASY_LIFE.PERMISSAO_USUARIO
(
    ID_USUARIO             BIGINT NOT NULL,
    ID_PERMISSAO           BIGINT NOT NULL,
    PRIMARY KEY (ID_USUARIO, ID_PERMISSAO),
    CONSTRAINT USUARIO_ID_FK FOREIGN KEY (ID_USUARIO) REFERENCES EASY_LIFE.USUARIO (ID_USUARIO),
    CONSTRAINT PERMISSAO_ID_FK FOREIGN KEY (ID_PERMISSAO) REFERENCES EASY_LIFE.PERMISSAO (ID_PERMISSAO)
);
-- COMMENT
COMMENT ON TABLE EASY_LIFE.PERMISSAO_USUARIO IS
    'Tabela responsável por armazenar dados do relacionamento entre USUARIO e PERMISSAO';