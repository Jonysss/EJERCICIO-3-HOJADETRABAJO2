/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herneciaejercicio3;

/**
 *
 * @author Usuario
 */
//SUPERCLASE
public class DispositivosElectronicos {
    
    //VARIABLES DE INSTANCIA
    private String marca;
    private String sistemaOperativo;
    private double memoria;
//CONSTRUCTOR
    public DispositivosElectronicos(String marca, String sistemaOperativo, double memoria) {
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.memoria = memoria;
    }
//METODOS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getMemoria() {
        return memoria;
    }
    
 public void Imprecion() {
            System.out.println("Marca: "+ getMarca()+
                    "\nSistema Operativo: "+ getSistemaOperativo()+
                    "\nCapacidad de memoria: "+ getMemoria()); }  

}
