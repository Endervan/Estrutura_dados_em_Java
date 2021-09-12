package com.trabalhando.pilhas;

public class Pilhas {

    private No refNoEntradaPilha;

    public Pilhas() {
        this.refNoEntradaPilha = null;
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }


    public No top() {
        return refNoEntradaPilha;
    }


    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

}
