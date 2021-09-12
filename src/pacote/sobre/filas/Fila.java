package pacote.sobre.filas;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {

        refNoEntradaFila = null;
    }

    public void enqueue(T obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();

                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();

        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxilar = refNoEntradaFila;

            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxilar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                } else {
                    noAuxilar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }


    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxilar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto= " + noAuxilar.getObject() + " }] ---- >";
                if (noAuxilar.getRefNo() != null) {
                    noAuxilar = noAuxilar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
