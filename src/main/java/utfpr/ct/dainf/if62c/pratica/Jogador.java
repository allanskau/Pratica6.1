/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//'utfpr.ct.dainf.if62c.pratica.Jogador' 
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author allan
 */
public class Jogador {
    private int numero;
    private String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
}
