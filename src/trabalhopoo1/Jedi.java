/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo1;

/**
 *
 * @author 2024122760318
 */
public abstract class Jedi extends Guerreiro{
    
    
    /*O metodo abstrato de atacar esta settado no pai*/
    
        private int atualizaVida;

    public Jedi(int atualizaVida, String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.atualizaVida = atualizaVida;
    }

    public abstract void atualizarVida(int cura);
        if (this.energia + cura > 100){
            this.energia = 100;
    /*TEM Q COLOCAR O GET AQUI PRA EPGAR A ENERGIA*/
}
        
}
