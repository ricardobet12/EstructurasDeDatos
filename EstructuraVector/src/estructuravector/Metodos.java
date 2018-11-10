package estructuravector;

/**
 *
 * @author Richy
 */
public class Metodos {

    private int tam;
    private String[] vector;

    public void crearVector(int tam) {
        this.tam = tam;
        if (this.vector == null) {
            this.vector = new String[this.tam];
        } else {
            System.out.println("No se pudo crear el vector");
        }
    }

    public void insertar(int pos, String dato) {
        if (pos < tam) {
            vector[pos] = dato;
        } else {
            System.out.println("No se pudo insertar, posicion no valida");
        }
    }

    public void borrar(int pos) {
        vector[pos] = "";
    }

    public void listar() {
        if (this.vector == null) {
            System.out.println("El vector esta vacio");
        } else {
            for (int i = 0; i < tam; i++) {
                System.out.println(vector[i]);
            }
        }
    }

    public void actualizar(int pos, String dato) {
        if (pos > tam) {
            System.out.println("Posicion no valida");
        } else {
            vector[pos] = dato;
        }
    }

    public void buscar(String dato) {
        for(int i = 0; i< tam; i++){
            if(vector[i].equals(dato)){
                System.out.println("Valor encontrado en: "+ i);
            }else{
                System.out.println("Valor no encontado");
            }
        }
    }

}
