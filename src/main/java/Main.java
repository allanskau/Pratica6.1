
import java.util.HashMap;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
                
        Time time1 = new Time(new HashMap<>());
        time1.addJogador("goleiro", new Jogador(1, "joao"));
        time1.addJogador("lateral", new Jogador(4, "jose"));
        time1.addJogador("atacante", new Jogador(15, "mario"));
        
        Time time2 = new Time(new HashMap<>());
        time2.addJogador("goleiro", new Jogador(1, "fulano"));
        time2.addJogador("lateral", new Jogador(4, "ciclano"));
        time2.addJogador("atacante", new Jogador(15, "beltrano"));
        
        System.out.println("Posicao         Time 1             Time 2");
        for(Object key: time1.getJogadores().keySet()){
            System.out.print(key);
            System.out.printf("\t" + time1.getJogadores().get(key));
            System.out.printf("\t\t" + time2.getJogadores().get(key));
            System.out.println();
        }
        
    }
}
