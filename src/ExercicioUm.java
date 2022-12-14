import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                {
                double nota1 = 10;
                double nota2 = 5;
                double nota3 = 9;  
                double media = (nota1 + nota2 + nota3) / 3;
            
                System.out.println("Primeira nota é " + nota1);
                System.out.println("Segunda  nota é " + nota2);
                System.out.println("Terceira nota é " + nota3);
            
                System.out.println("A media das notas é " + media);
            
                }

                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:  {

                double lado1 = 200;
                double lado2 = 3000;

                double area = (lado1 * lado2);

                System.out.println("A area é: " + area );
                }
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:{
                double largura = 20;
                double altura = 10;
                double profundidade = 5;
                double volume = (largura * altura * profundidade);

                System.out.println("A largura é =       " + largura);
                System.out.println("A altura é =        " + altura);
                System.out.println("A profundidade é =  " + profundidade);
                System.out.println("O volume é: =       " + volume );
                
            }
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                // valorMaiorQueDobro(double base, double verificar)
                {

                    double n1 = 7.5;
    
                    double n2 = 3.5;
    
                    double dobro1 = n1 * 2;
    
                    double dobro2 = n2 * 2;
    
    
    
                    System.out.println("Número 1 = " + n1);
    
                    System.out.println("Número 2 = " + n2);
    
    
    
                    if (n1 > dobro2) {
    
                        System.out.println("É maior que o dobro");
    
                    } else if (n1 == dobro2){
    
                        System.out.println("É igual ao dobro");
    
                    } else{
    
                        System.out.println("Não é maior que o dobro");
    
                    }
    
                }
    
                    // valorMaiorQueDobro(double base, double verificar)
    
                    break;
                
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                // bhaskara(int a, int b, int c);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                // mediaViagem(double distancia, double tempo)
                {
                    double distancia =  150;
                    double tempo =  2;
                    double velocidademedia = distancia / tempo ;

                    System.out.println("A distancia percorrida é de " + distancia + "km " );
                    System.out.println("O tempo percorrido é de " + 2 + "h " );
                    System.out.println("A velocidade média dessa viajem foi de " + velocidademedia + "km/h " );

                }
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                // percentualImposto(double faturamento, double qtdImposto)
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                // parOuImpar(int valor)
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return 0;
    }

    public static double area(double ladoUm, double ladoDois) {
        return 0;
    }

    public static double volume(double largura, double altura, double profundidade) {
        return 0;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        return new double[2];
    }

    public static double mediaViagem(double distancia, double tempo) {
        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return 0;
    }

    public static boolean parOuImpar(int valor) {
        return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}