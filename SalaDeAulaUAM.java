/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sala.de.aula.uam;

/**
 *
 * @author Airam
 */
public class SalaDeAulaUAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    zAlunoPSC aluno = new zAlunoPSC ("Vini", "123");
    
    System.out.println(aluno.getNome());
    System.out.println(aluno.getRA());
    aluno.fazerA1();
    System.out.println(aluno.getA1());
    }
}
