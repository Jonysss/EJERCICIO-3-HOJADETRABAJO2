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
public class Laptop extends DispositivosElectronicos{
    //VARIABLES DE INSTANCIA
    private String procesador;
    
    public Laptop (String marca, String sistemaOperativo, double memoria){
    super(marca,sistemaOperativo,memoria);
    
   }
//CONSTRUCTORES
    public Laptop(String procesador, String marca, String sistemaOperativo, double memoria) {
        super(marca, sistemaOperativo, memoria);
        this.procesador = procesador;
    }
//METODOS
    public String getProcesador() {
        return procesador;
    }
   public void Imprecion() {
            System.out.println("Marca: "+ getMarca()+
                    "\nSistema Operativo: "+ getSistemaOperativo()+
                    "\nCapacidad de memoria: "+ getMemoria()+
                    "\nPROCESADOR: "+ getProcesador()); }   
}
