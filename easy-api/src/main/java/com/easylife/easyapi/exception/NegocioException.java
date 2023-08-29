package com.easylife.easyapi.exception;

public class NegocioException extends RuntimeException {

    public NegocioException() {
        super("Entidade não encontrada");
    }

    public NegocioException(String detalhes) {
        super("Entidade não encontrada: " + detalhes);
    }
}

