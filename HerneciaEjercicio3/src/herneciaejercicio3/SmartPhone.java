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
public class SmartPhone extends DispositivosElectronicos{
    private double dimension;
    //CONSTRUCTORES
     public SmartPhone (String marca, String sistemaOperativo, double memoria){
    super(marca,sistemaOperativo,memoria);
    
   }
//CONSTRUCTORES
    public SmartPhone(double dimension, String marca, String sistemaOperativo, double memoria) {
        super(marca, sistemaOperativo, memoria);
        this.dimension = dimension;
    }
//METODOS
    public double getDimension() {
        return dimension;
    }
{
             System.out.println("Marca: "+ getMarca()+
                    "\nSistema Operativo: "+ getSistemaOperativo()+
                    "\nCapacidad de memoria: "+ getMemoria()+
                    "\nDimension del aparato: "+ getDimension()); } 
}
