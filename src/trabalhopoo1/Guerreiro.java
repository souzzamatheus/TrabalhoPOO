/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo1;

/**
 *
 * @author 2024122760318
 */
public abstract class Guerreiro {
    
    private String nome;
    private int idade;
    private double peso;
    private int energia;

    public Guerreiro(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.energia = 100;
        
    }
    
    public abstract void atacar();
    
    public void receberDano(int dano) {
        energia = energia - dano;

    }   

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public int getEnergia() {
        return energia;
    }
}

    
    

