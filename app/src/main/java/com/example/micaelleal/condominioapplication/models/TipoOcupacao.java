package com.example.micaelleal.condominioapplication.models;

public enum TipoOcupacao {

    VAZIO(0),
    PROPRIETARIO(1),
    INQUILINO(2);

    private int valorOcupacao;

    TipoOcupacao(int valorOcupacao) {
        this.valorOcupacao = valorOcupacao;
    }

    public int getValorOcupacao() {
        return valorOcupacao;
    }

}
