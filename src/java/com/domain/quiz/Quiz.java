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
    private static ArrayList<Questao> teste;
    
    public static ArrayList<Questao> getTeste(){
        
        if(teste == null){
            
            teste = new ArrayList<>();
            Questao q1 = new Questao
            ("1+1?", "2", new String[]{"0","2","1"});
            teste.add(q1);
            Questao q2 = new Questao
            ("1+2?", "3", new String[]{"3","2","1"});
            teste.add(q2);
            Questao q3 = new Questao
            ("3+4?", "7", new String[]{"7","1","12"});
            teste.add(q3);
            Questao q4 = new Questao
            ("2+3?", "5", new String[]{"3","2","5"});
            teste.add(q4);
        }
        return teste;
    }
     public static double validateTest(String userAnswers[]){
        int count = 0;
        for(int i=0; i<teste.size(); i++){
            if(teste.get(i).getResposta().equals(userAnswers[i])){
                count++;
            }
        }
        double nota = (double)count / (double)teste.size();
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
