/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author allan
 */
public class Time {
    private HashMap<String, Jogador> jogadores;
    
    public Time(HashMap<String, Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    
    public HashMap getJogadores(){
        return jogadores;
    }
    
    public void addJogador(String posicao, Jogador jogador){
        jogadores.put(posicao, jogador);
    }
}
