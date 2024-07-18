/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.com.java;

/**
 *
 * @author phmm
 */
public class TesteHeranca {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta");
        animal.setAnda("Todo animal se locomove");
        
        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro come racao de cachorro");
        cachorro.setAnda("Cachorro anda em 4 patas");
        cachorro.setLatido("Cachorro Late");
        
        
        Avestruz ave = new Avestruz();
        ave.setAlimenta("Avestruz se alimenta de folhas verdes");
        ave.setAnda("Avestruz anda sobre duas patas");
        ave.setBooming("Avestruz faz o som Booming");
        
        Animal pincher = new Cachorro();
           pincher.setAlimenta("racao");
           pincher.setAnda("quatro patas");
        
    }
}
