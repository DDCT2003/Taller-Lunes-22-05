import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + libros +
                '\n';
    }

    private List<Libros> libros = new ArrayList<>();
    private int ID=1000;

    public List<Libros> getLibros() {
        return libros;
    }

    public Boolean CrearLibros (int NumPag, String Nombre, String Autor){
        Boolean control=true;
        if(!libros.isEmpty()){
        for( int i=0; i<libros.size();i++){

                if(libros.get(i).getNombre().equals(Nombre)){
                    control =false;
                }
            }

        }
        if(control) {

            libros.add(new Libros(ID, NumPag, Nombre, Autor));
            ID++;
        }
        return control;
    }

    public Libros BuscarNombre(String Nombre){
        for( int i=0; i<libros.size();i++){

            if(libros.get(i).getNombre().equals(Nombre)){
                return libros.get(i);
            }
        }
        return null;

    }

    public int BusquedaBinaria (int target){
        int izquierda = 0;
        int derecha = libros.size() - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (libros.get(medio).getID()== target) {
                return medio;
            } else if (libros.get(medio).getID() < target) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;
    }

    public boolean EliminarID (int target) {
        boolean control=false;
        if (BusquedaBinaria(target) != -1) {
        libros.remove(BusquedaBinaria(target));
        control=true;
        }else {
            return control;
        }
        return control;
    }
    public boolean EliminarNombre (String Nombre) {
        int index = 0;
        boolean busquedaelim = false;

        for (int i = 0; i < libros.size(); i++) {

            if (Nombre.equals(libros.get(i).getNombre())) {
                busquedaelim = true;
                libros.remove(index);

                break;
            } else {
                busquedaelim = false;

            }
            index++;
        }
        return busquedaelim;
    }

    public Libros buscarlibro(int Target){
       return libros.get(BusquedaBinaria(Target));
    }


    public int Sumalibros(List<Libros> libros, int indice){
        if(indice==0){
            return libros.get(0).getNumPag();
        }else{
            return libros.get(indice).getNumPag()+Sumalibros(libros,indice-1);
        }
    }






}
