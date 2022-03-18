/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herneciaejercicio3;

/**
 *
 * @author Usuario
 */
//SUBLCLASE
public class Computer extends DispositivosElectronicos {
    private double hdd;
    //CONSTRUCTORES
    public Computer (String marca, String sistemaOperativo, double memoria){
    super(marca,sistemaOperativo,memoria);
    
   //METODOS 
   }

    public Computer(double hdd, String marca, String sistemaOperativo, double memoria) {
        super(marca, sistemaOperativo, memoria);
        this.hdd = hdd;
    }

    public double getHdd() {
        return hdd;
    }
    
 public void Imprecion() {
            System.out.println("Marca: "+ getMarca()+
                    "\nSistema Operativo: "+ getSistemaOperativo()+
                    "\nCapacidad de memoria: "+ getMemoria()+
                    "\nHDD: "+ getHdd()); }     
}
