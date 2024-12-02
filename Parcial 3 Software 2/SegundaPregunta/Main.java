package SegundaPregunta;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new HamburguesaBuilder()
                .setTipoTomate("Tomate Cherry")
                .setTipoCarne("Carne de Res")
                .setTipoQueso("Queso Cheddar")
                .setTipoPan("Pan de Sésamo")
                .build();

        System.out.println(hamburguesa);
    }
}
