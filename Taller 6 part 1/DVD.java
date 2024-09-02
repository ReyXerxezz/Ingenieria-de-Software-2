import java.util.Date;

public class DVD implements LibreriaDVD{
    private String nombre;
    private int ano;

    public DVD(String nombre, int ano) {
        this.nombre = nombre;
        this.ano = ano;
    }

    public String getNombre() {
        return nombre;
    }
    public int getAno() {
        return ano;
    }

    @Override
    public void devolver() {
        Date current = new Date();
        System.out.println("El DVD "+ getNombre() +" del año "+ getAno() +" ha sido devuelto el " + current );
    }

    @Override
    public void prestar() {
        Date current = new Date();
        System.out.println("El DVD "+ getNombre() +" del año "+ getAno() +" ha sido prestado el " + current );
    }

    @Override
    public void solicitarNuevaVersion() {
        Date current = new Date();
        System.out.println("Una nueva version del DVD "+ getNombre() +" del año "+ getAno() +" ha sido solicitada el " + current );
    }
}
