/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sala.de.aula.uam;

/**
 *
 * @author Airam
 */
public class zAlunoPSC {
public static void main(String[] args){
}
     private String nome;
     private String RA;
     private int presenca;
     private double A1;
     private double A2;
     private double A3;
     
     
     public zAlunoPSC(String nome, String RA){
         this.nome = nome;
         this.RA = RA;
         this.presenca = 0;
         this.A1 = 0;
         this.A2 = 0;
         this.A3 = 0;
              
     }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public int getPresenca() {
        return presenca;
    }

    public double getA1() {
        return A1;
    }

    public double getA2() {
        return A2;
    }

    public double getA3() {
        return A3;
    }
public double getNotaFinal(){
    double notaFinal;
    notaFinal = this.A1*3+A2*3+A3*4;
    return notaFinal;
}

    public void setA1(double A1) {
        this.A1 = A1;
    }

    public void setA2(double A2) {
        this.A2 = A2;
    }

    public void setA3(double A3) {
        this.A3 = A3;
    }
public void estudar(){
    System.out.println("Parabéns!");
}
public void virNaAula(){
    this.presenca = this.presenca+1;
}
public void fazerA1(){
    double nota = 10*Math.random();
    setA1(nota);
}
public void fazerA2(){
    double nota = 10*Math.random();
    setA2(nota);
}
public void fazerA3(){
    double nota = 10*Math.random();
    setA3(nota);
}
}
