/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.quiz;

import java.util.ArrayList;

/**
 *
 * @author Camilla
 */
public class Quiz {
    private static int contTeste = 0;
    private static double MediaNotas = 0.0;
    private static double ultimaNota = 0.0;
    private static ArrayList<Questao> ch;
    private static ArrayList<Questao> cn;
    private static ArrayList<Questao> ma;
    private static ArrayList<Questao> lt;
    
    public static ArrayList<Questao> getTeste(){
        
        if(ch == null & cn == null & ma == null & lt == null){
            ch = new ArrayList<>();
            Questao q1 = new Questao
            ("<h5><i>Ser ou não ser - eis a questão.<br>"
            +"Morrer - dormir - Dormir! Talvez sonhar. Aí está o obstáculo!<br>"
            +"Os sonhos que hão de vir no sono da morte<br>"
            +"Quando tivemos escapado ao tumulto vital<br>"
            +"Nos obrigam a hesitar: e é essa a reflexão<br>"
            +"Que dá à desventura uma vida tão longa<br><h6>SHAKESPEARE, W. Hamlet.</h6><br></i>"
            +"Este solilóquio pode ser considerado um percursor do existencialismo ao enfatizar a tensão entre<br>"
            +"A) consciência de si e angústia humana<br>"
            +"B) inevitabilidade do destino e incerteza moral<br>"
            +"C) tragacidade da personagem e ordem do mundo<br>"
            +"D) racionalidade argumentativa e loucura iminente<br>"
            +"E) dependência paterna e impossibilidade de ação<br>", "A", new String[]{"A","B","C","D","E"});
            ch.add(q1);
            Questao q2 = new Questao
            ("<h5> &nbsp; O que ocorreu na Bahia de 1798, ao contrário das"
            +"das outras situações de contetação política na América "
            +"portuguesa é o projeto que lhe era subjacente "
            +"não tocou somente na condição, ou no instrumento, da"
            +"integração subordinada das colônias do império Iuso."
            +"Dessa feita, ao contrário do que se de nas Minas Gerais"
            +"(1789), a sedição avançou sobre a sua decorrência<br>"
            +"<h6> JANCSÓ, I.;PIMENTA, J.P. Peças de um mosaico. In: MOTA, C. G. (Org.). Viagem incompleta: a experiência brasileira (1500-2000).</h6>"
            +"A) consciência de si e angústia humana<br>"
            +"B) inevitabilidade do destino e incerteza moral<br>"
            +"C) tragacidade da personagem e ordem do mundo<br>"
            +"D) racionalidade argumentativa e loucura iminente<br>"
            +"E) dependência paterna e impossibilidade de ação<br>", "3", new String[]{"3","2","1"});
            ch.add(q2);
            Questao q3 = new Questao
            ("3+4?", "7", new String[]{"7","1","12"});
            ch.add(q3);
            Questao q4 = new Questao
            ("2+3?", "5", new String[]{"3","2","5"});
            ch.add(q4);
        }
        return ch;
    }
    
     public static double validateTest(String userAnswers[]){
        int count = 0;
        for(int i=0; i<ch.size(); i++){
            if(ch.get(i).getResposta().equals(userAnswers[i])){
                count++;
            }
        }
        double nota = (double)count / (double)ch.size();
        Quiz.ultimaNota = nota;
        Quiz.MediaNotas += nota;
        Quiz.contTeste++;
        return nota;
    }
    public static double getLastGrade(){
        return Quiz.ultimaNota;
    }
    public static double getGradeAverage(){
        return Quiz.MediaNotas / (double)Quiz.contTeste;
    }
}
