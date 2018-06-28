
package Sudoku;

import java.util.Optional;
import java.util.Random;


public class Cuadrante {
    
    private int [][] data;
    
    private Optional<Cuadrante> norte;
    private Optional<Cuadrante> Sur;
    private Optional<Cuadrante> Este;
    private Optional<Cuadrante> Oeste;
    
    public Cuadrante (Optional<Cuadrante> norte, Optional<Cuadrante> Sur,
                      Optional<Cuadrante> Este ,Optional<Cuadrante> Oeste){
        
        this.norte = norte;
        this.Sur = Sur;
        this.Este = Este;
        this.Oeste = Oeste;
        
        
    }
    
    public boolean hayColisionFila(int file, int valor){
        return false;
    }
    
    public void generar(){
        
        int fila = 0;
        int columna = 0;
        
        Random random = new Random();
        int candidato = random.nextInt(9)+1;
        
        if(Oeste.isPresent() && !Oeste.get().hayColisionFila(fila, candidato)){
            
            
        }
        
        
        
        
    }
    
}
