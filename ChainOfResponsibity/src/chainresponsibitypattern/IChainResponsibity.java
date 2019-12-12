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
public interface IChainResponsibity 
{ 
    public abstract void setForward(IChainResponsibity ForwardInChain); 
    public abstract void DataProcess(Digit request); 
}