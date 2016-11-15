/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.quiz;
import java.util.ArrayList;
import java.util.Collections;
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
        if(ch == null){
            ch = new ArrayList<>();
            //-Ciências Humanas-------------------------------------------------------------------
            Questao q1 = new Questao
            ("<h5><i>Ser ou não ser - eis a questão.<br>" 
            +"Morrer - dormir - Dormir! Talvez sonhar. Aí está o obstáculo!<br>"
            +"Os sonhos que hão de vir no sono da morte<br>"
            +"Quando tivemos escapado ao tumulto vital<br>"
            +"Nos obrigam a hesitar: e é essa a reflexão<br>"
            +"Que dá à desventura uma vida tão longa<br><h6>SHAKESPEARE, W. Hamlet.</h6></i></h5><br>"
            +"Este solilóquio pode ser considerado um percursor do existencialismo ao enfatizar a tensão entre<br>"
            +"A) consciência de si e angústia humana.<br>"
            +"B) inevitabilidade do destino e incerteza moral.<br>"
            +"C) tragacidade da personagem e ordem do mundo.<br>"
            +"D) racionalidade argumentativa e loucura iminente.<br>"
            +"E) dependência paterna e impossibilidade de ação.<br>", "A", new String[]{"A","B","C","D","E"});
            ch.add(q1);
            //-------------------------------------------------------------------------------
            Questao q2 = new Questao
            ("<h5> &nbsp; O que ocorreu na Bahia de 1798, ao contrário das"
            +"das outras situações de contetação política na América "
            +"portuguesa é o projeto que lhe era subjacente "
            +"não tocou somente na condição, ou no instrumento, da"
            +"integração subordinada das colônias do império Iuso."
            +"Dessa feita, ao contrário do que se de nas Minas Gerais"
            +"(1789), a sedição avançou sobre a sua decorrência<br>"
            +"<h6> JANCSÓ, I.;PIMENTA, J.P. Peças de um mosaico. In: MOTA, C. G. (Org.). Viagem incompleta: a experiência brasileira (1500-2000).</h6></h5><br>"
            +"A diferença entre as sediações abordadas no texto encontrava-se na pretensão de<br>"
            +"A) eliminar a hierarquia militar.<br>"
            +"B) abolir a escravidão africana.<br>"
            +"C) anular o domínio metropolitano.<br>"
            +"D) suprimir a propriedade fundiária.<br>"
            +"E) extinguir o absolutismo monárquico.<br>", "B", new String[]{"A","B","C","D","E"});
            ch.add(q2);
            //-Ciência da Natureza-----------------------------------------------------------
            Questao q3 = new Questao
            ("<h5> &nbsp; O carvão ativado é um material que possui elevado "
            +"teor de carbono, sendo muito utilizado para a remoção de "
            +"compostos orgânicos voláteis do meio, como o benzeno. "
            +"Para a remoção desses compostos, utiliza-se a adsorção. "
            +"Esse fenômeno ocorre por meio de interações do tipo "
            +"intermoleculares entre a superfície do carvão (adsorvente) "
            +"e o benzeno (adsorvato, substância adsorvida). "
            +"No caso apresentado, entre o adsorvente e a substância "
            +"adsorvida ocorre a formação de:<br></h5>"
            +"A) Ligações dissulfeto.<br>"
            +"B) Ligações covalentes.<br>"
            +"C) Ligações de hidrogênio.<br>"
            +"D) Interações dipolo reduzido - dipolo induzido.<br>"
            +"E) Interações dipolo permanente - dipolo permanente.<br>", "D", new String[]{"A","B","C","D","E"});
            ch.add(q3);
            //-------------------------------------------------------------------------------
            Questao q4 = new Questao
            ("<h5> &nbsp; Ao percorrer o trajeto de uma cadeia alimentar, o "
            +"carbono, elemento essencial e marjoritário da matéria "
            +"orgânica que compõe os indivíduos, ora se encontra "
            +"em sua forma inorgânica, ora se encontra em sua "
            +"sua forma orgânica. Em uma cadeia aliemntar composta por "
            +"fitoplâncton, zooplâncton, moluscos, crustáceos e peixes "
            +"ocorre a transição desse elemento da forma inorgânica "
            +"para orgânica.<br>"
            +"Em qual grupo de organismos ocorre essa transição?<br></h5>"
            +"A) Fitoplâncton.<br>"
            +"B) Zooplâncton.<br>"
            +"C) Moluscos.<br>"
            +"D) Crustáceos.<br>"
            +"E) Peixes.<br>", "A", new String[]{"A","B","C","D","E"});
            ch.add(q4);
            //-Matemática e suas Tecnologias----------------------------------------------------------
            Questao q5 = new Questao
            ("<h5> &nbsp; É comum os artistas plásticos se apropriarem de "
            +"entes matemáticos para produzirem, por exemplo, formas"
            +"e imagem por meio de manipulações. Um artista plástico, "
            +"em uma de suas obras, pretende retratar os diversos "
            +"polígonos obtidos pelas intersecções de um plano com "
            +"uma pirâmide regular de base quadrada. <br>"
            +"Segundo a classificação dos polígonos, quais deles "
            +"são possíveis de serem obtidos pelo artista plástico?<br></h5>"
            +"A) Quadrados, apenas.<br>"
            +"B) Triângulos e quadrados, apenas.<br>"
            +"C) Triângulos, quadrados e trapézios, apenas.<br>"
            +"D) Triângulos, quadrados, trapézios e quadriláteros irregulares, apenas.<br>"
            +"E) Triângulos, quadrados, trapézios, quadriláteros irregulares e pentágonos, apenas.<br>", "E", new String[]{"A","B","C","D","E"});
            ch.add(q5);
            //-------------------------------------------------------------------------------
            Questao q6 = new Questao
            ("<h5> &nbsp; Cinco marcas de pão integral apresentam as "
            +"seguintes concentrações de fibras (massa de fibras por "
            +"massa de pão)<br></h5>"
            +"&nbsp; Marca A: 2 g de fibras a 50 g de pão;<br>"
            +"&nbsp; Marca A: 5 g de fibras a 40 g de pão;<br>"
            +"&nbsp; Marca A: 5 g de fibras a 100 g de pão;<br>"
            +"&nbsp; Marca A: 6 g de fibras a 90 g de pão;<br>"
            +"&nbsp; Marca A: 7 g de fibras a 70 g de pão;<br>"
            +"<h5> &nbsp; Recomenda-se a ingestão do pão que possui a maior"
            +"concentração de fibras<br></h5>"
            +"<h6>Disponível em: www.blog.saude.gov.br. Acesso em: 25 fev. 2013</h6>"
            +"A) A.<br>"
            +"B) B.<br>"
            +"C) C.<br>"
            +"D) D.<br>"
            +"E) E.<br>", "B", new String[]{"A","B","C","D","E"});
            ch.add(q6);
            //-Linguagens, códigos e suas Tecnologias----------------------------------------------------------
            Questao q7 = new Questao
            ("<h5><b> &nbsp; Ebony and ivory</b> <br><br>"
            +"Ebony and ivory live togheter in perfect harmony<br>"
            +"Side by side on my piano keyboard, oh Lord, why don't we?<br>"
            +"We all know that people are the same wherever we go<br>"
            +"There is good and bad in ev'ryone,<br>"
            +"We learn to live, we learn to give<br>"
            +"Each other what we need to survive togheter alive<br></h5>"
            +"<h6>McCARTNEY, P. Disponível em: www.paulmccartney.com. Acesso em: 30 maio 2016<br></h6>"
            +"<h5>Em diferentes épocas e lugares, compositores têm "
            +"utilizado seu espaço de produção musical para expressar "
            +"e problematizar perspectivas de mundo. Paul McCartney, "
            +"na letra dessa canção, defende<br></h5>"
            +"A) o aprendizado compartilhado.<br>"
            +"B) a necessidade de donativos.<br>"
            +"C) as manifestações culturais.<br>"
            +"D) o bem em relação ao mal.<br>"
            +"E) o respeito étnico.<br>", "E", new String[]{"A","B","C","D","E"});
            ch.add(q7);
            //-------------------------------------------------------------------------------
            Questao q8 = new Questao
            ("<h5><b> &nbsp; Mandinga </b> - Era a denominação que, no período "
            +"das grandes navegações, os portugueses davam à costa "
            +"ocidental da África. A palavra se tornou sinônimo de "
            +"feitiçaria porque os exploradores lusitanos consideravam "
            +"bruxos os africanos que ali habitavam - é que eles davam "
            +"indicações sobre a existência de ouro na região. Em idioma "
            +"nativo, <i>manding</i> designava a terra dos feiticeiros. A palavra "
            +"acabou virando sinônimo de feitiço, sortilégio.<br>"
            +"<h6>COTRIM, M. O pulo do gato 3. São Paulo: Geração Editorial, 2009 (fragmento).<br></h6>"
            +"No texto, evidencia-se que a construção do significado da "
            +"palavra <i>mandinga</i> resulta de um(a) <br></h5>"
            +"A) contexto sócio-histórico.<br>"
            +"B) diversidade étnica.<br>"
            +"C) descoberta geográfica.<br>"
            +"D) apropriação religiosa.<br>"
            +"E) contraste cultural.<br>", "A", new String[]{"A","B","C","D","E"});
            ch.add(q8);
        }
       Collections.shuffle(ch);
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
