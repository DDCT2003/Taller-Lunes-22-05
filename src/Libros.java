import java.util.ArrayList;
import java.util.List;

public class Libros {
    private int ID, NumPag;
    private String Nombre, Autor;


    @Override
    public String toString() {
        return "Libro:" +
                "\tID: " + ID +
                "\tNumPag: " + NumPag +
                "\tNombre: " + Nombre +
                "\tAutor: " + Autor +"\n"
               ;
    }

    public Libros(int ID, int numPag, String nombre, String autor) {
        this.ID = ID;
        NumPag = numPag;
        Nombre = nombre;
        Autor = autor;
    }

    public int getID() {
        return ID;
    }

    public int getNumPag() {
        return NumPag;
    }

    public String getNombre() {
        return Nombre;
    }

}
