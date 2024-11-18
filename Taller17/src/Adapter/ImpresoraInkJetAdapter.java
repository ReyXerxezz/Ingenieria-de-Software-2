package Adapter;

public class ImpresoraInkJetAdapter implements Impresora{
    private ImpresoraInkJet impresoraInkJet;

    public ImpresoraInkJetAdapter(ImpresoraInkJet impresoraInkJet) {
        this.impresoraInkJet = impresoraInkJet;
    }

    @Override
    public void imprimir() {
        impresoraInkJet.imprimirConTinta();
    }
}
