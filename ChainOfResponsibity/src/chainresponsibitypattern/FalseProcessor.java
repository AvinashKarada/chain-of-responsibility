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
class FalseDataProcessor implements IChainResponsibity 
{ 
    private IChainResponsibity ForwardInChain; 
  
    public void setForward(IChainResponsibity c) 
    { 
        ForwardInChain = c; 
    } 
  
    public void DataProcess(Digit request) 
    { 
        if (request.getDigit() < 0) 
        { 
            System.out.println("False DataProcessor : " + request.getDigit()); 
        } 
        else
        { 
            ForwardInChain.DataProcess(request); 
        } 
    } 
} 
