/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116502_latihanuts4;

/**
 *
 * @author ASUS
 */
public class PBO11_10116502_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner oMD= new ModelDesigner();
        oMD.bonusDesigner();
        
        ModelProgrammer oMP= new ModelProgrammer();
        oMP.BonusProgrammer();;
        
        ModelSystemAnalyst oMS= new ModelSystemAnalyst();
        oMS.BonusSystemAnalyst();
    }
    
}
