/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herneciaejercicio3;

/**
 *
 * @author Usuario
 */
public class HerneciaEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //CLASE PRINCIPAL METODO MAIN
       
       DispositivosElectronicos dispositivosElectronicos = new 
        DispositivosElectronicos("Dell","Windows",64); 
      dispositivosElectronicos.Imprecion(); 
   
     Computer computer = new 
        Computer(123,"TOSHIBA","Windows",240); 
      computer.Imprecion(); 
      
       Laptop laptop = new 
        Laptop("ICORE","HP","Windows",120); 
      laptop.Imprecion(); 
      
      SmartPhone smarthPone = new 
        SmartPhone(16,"Samsung","Windows",500); 
      smarthPone.Imprecion(); 
      
      
    }
    
}
