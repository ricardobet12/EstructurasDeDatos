/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuravector;

/**
 *
 * @author Richy
 */
public class EstructuraVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos vector = new Metodos();
        
        vector.crearVector(3);
        
        vector.insertar(0, "Ricardo");
        vector.insertar(1, "Camilo");
        vector.insertar(2, "Maria");
        
        vector.listar();
        
        vector.borrar(0);
        
        vector.listar();
        
        vector.actualizar(0, "RicaroBet");
        
        vector.listar();
        
        vector.buscar("Maria");
    }
    
}
