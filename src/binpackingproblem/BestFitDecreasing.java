package binpackingproblem;
import java.util.Arrays;

/**
 * @author @author Caroline, Yasmin e Bianca
 */

public class BestFitDecreasing {
    private int vetItens[];
    private int quantItens;

    public BestFitDecreasing(int[] vetItens) {
        this.vetItens = vetItens;
        this.quantItens = vetItens.length;
    }
    
    private void ordenacaoDecrescente(){
        Arrays.sort(vetItens); //Ordena em ordem crescente
        
        int limite = 0; //Iverte a ordem do vetor
        if ((quantItens % 2) == 0) { 
            limite = quantItens / 2;
        } else {
            limite = Math.floorDiv(quantItens, 2);
        }
        
        for (int i = 0, j = (quantItens - 1); i < limite; i++, j--) {
            int temp = vetItens[i];
            vetItens[i] = vetItens[j];
            vetItens[j] = temp;
        }
    }
    
    public Packing algoritmoBestFitDecreasing(int tamanhoCaixa){
        ordenacaoDecrescente(); //Ordena em ordem decrescente
        
        BestFit bf = new BestFit(vetItens);
        
        return bf.algoritmoBestFit(tamanhoCaixa);
    }
}
