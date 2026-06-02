package logica.atividade2;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Atividade2 {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Ola. Somos a EletroCalc PRO :D ");
        System.out.println("---------------------------");
        System.out.println("Auxiliamos voce a cuidar da sua protecao e escolher a melhor fiacao para seu equipamento eletrico na sua residencia!! \n ");

        System.out.print("Por favor, informe a potencia do equipamento (watts): ");
        int potencia = entradaDados.nextInt();

        System.out.print("Agora, nos informe a tensao (volts): ");
        int tensao = entradaDados.nextInt();
        
        System.out.println("\n-----------------------------");
        System.out.println("Relatorio do equipamento:");
        System.out.println("-----------------------------");
        System.out.println("Potencia do equipamento: " +potencia+ "W");
        System.out.println("Tensao do equipamento: " +tensao+ "v");
        double corrente = potencia / tensao;
        System.out.println("Corrente do equipamento: " +corrente+ "A");
        double disjuntor = corrente * 1.25;
        System.out.println("Calculo do disjuntor: " +disjuntor);
        
        if (disjuntor <= 12){
            System.out.println("Disjuntor recomendado: 12A " );
            System.out.println("Bitola do fio recomendada: 1,00 mm2");
        }else if (disjuntor <= 15){
            System.out.println("Disjuntor recomendado: 15A " );
            System.out.println("bitola do fio recomendada: 1,5 mm2");
        }else if (disjuntor <=21){
            System.out.println("Disjuntor recomendado: 21A " );
            System.out.println("bitola do fio recomendada: 2,5 mm2");
        }else if (disjuntor <=28){
            System.out.println(" Disjuntor recomendado: 28A " );
            System.out.println("bitola do fio recomendada: 4,0 mm2");    
        }else if (disjuntor <=36){
            System.out.println("Disjuntor recomendado: 36A " );
            System.out.println("bitola do fio recomendada: 6,0 mm2");    
        }else if (disjuntor <=50){
            System.out.println(" Disjuntor recomendado: 50A " );
            System.out.println("bitola do fio recomendada: 10,0 mm2");    
        }else{
            System.out.println("Disjuntor recomendado: 68A " );
            System.out.println("bitola do fio recomendada acima de 50A: 16,0 mm2"); 
        }       
    }
}
