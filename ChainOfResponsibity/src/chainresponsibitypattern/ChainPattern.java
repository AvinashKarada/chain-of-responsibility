/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainresponsibitypattern;

/**
 *
 * @author 
 */
public class ChainPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Create object for specific class to  IChainResponsibity  
        IChainResponsibity IChainResponsibity1 = new FalseDataProcessor(); 
        IChainResponsibity IChainResponsibity2 = new NullDataProcessor(); 
        IChainResponsibity IChainResponsibity3 = new TrueDataProcessor(); 
        IChainResponsibity1.setForward(IChainResponsibity2); 
        IChainResponsibity2.setForward(IChainResponsibity3); 
  
        //Clla the related responsibity
        IChainResponsibity1.DataProcess(new Digit(100)); 
        IChainResponsibity1.DataProcess(new Digit(-150)); 
        IChainResponsibity1.DataProcess(new Digit(0)); 
        IChainResponsibity1.DataProcess(new Digit(85)); 
    }
    
}
