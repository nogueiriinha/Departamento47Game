import java.util.Random;
import java.util.Scanner;

public class Patrulha {
    static void main() {
        int suspidade1,suspidade2,suspidade3,evidencia;
        int suschoice,nivel=0,susacao=0,moral=100,menuacao;

        Scanner leia = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("\nOlá, policial Steve!");
        System.out.println("Seja bem vindo ao pelotão de patrulha.");
        System.out.println("\nAntes de qualquer coisa, faremos abordagens de rotina..");
        System.out.println("Visando diminuir os crimes da região.");
        System.out.println("\nPressione ENTER para continuar");
        leia.nextLine();

        System.out.println("\nVamos abordar pessoas que estão passando pela rua.");
        System.out.println("Depois que tivermos quatro prisões bem sucedidas, podemos lhe promover à Detetive!");
        System.out.println("\n" +
                "Claro, depois que você atingir o NÍVEL 4 e possuir MORAL acima ou igual à 70");
        System.out.println("Sua MORAL inicia em 100");
        System.out.println("\nPressione ENTER para continuar");
        leia.nextLine();

        do {
            System.out.println("\nVocê encontrou possíveis suspeitos...");
            System.out.println("Escolha qual suspeito você quer abordar: ");

            suspidade1 = rand.nextInt(65 - 18 + 1) + 18;
            System.out.println("\n1 - Homem, "+suspidade1+" anos.");
            suspidade2 = rand.nextInt(65 - 18 + 1) + 18;
            System.out.println("\n2 - Mulher, "+suspidade2+" anos.");
            suspidade3 = rand.nextInt(65 - 18 + 1) + 18;
            System.out.println("\n3 - Homem, "+suspidade3+" anos.");
            System.out.println("\n4 - Encerrar o turno.");

            System.out.println("\nSelecione uma opção (1 a 4): ");
            suschoice = leia.nextInt();

            switch (suschoice) {
                case 1:
                    System.out.println("\nHomem, "+suspidade1+" anos.");
                    System.out.println("\nFazendo revista pessoal...");
                    evidencia = rand.nextInt(100) + 1;
                    do{
                        if(evidencia >= 1 && evidencia <= 20) {
                            System.out.println("\nVocê encontrou uma arma de fogo com numeração suprimida.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um suspeito que portava uma arma ilícita, muito bem!");
                                    nivel++;
                                    System.out.println("Parabéns, você já prendeu "+nivel+" suspeitos de forma correta");
                                    System.out.println("Você está agora no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um suspeito que portava uma arma ilícita, isso não condiz com a ética policial!");
                                    moral = moral - 5;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }else if(evidencia >= 21 && evidencia <= 50){
                            System.out.println("\nVocê encontrou substância ilícita.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um suspeito que portava uma substância ilícita, muito bem!");
                                    nivel++;
                                    System.out.println("Parabéns, você já prendeu "+nivel+" suspeitos de forma correta");
                                    System.out.println("Você está agora no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um suspeito que portava uma substância ilícita, isso não condiz com a ética policial!");
                                    moral = moral - 5;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }else{
                            System.out.println("\nVocê não encontrou nada ilícito.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um cidadão que não tinha nada de ilícito, isso não condiz com a ética policial!");
                                    moral = moral - 10;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um cidadão de bem!");
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    System.out.println("Continue patrulhando!");
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }
                    }while(menuacao == 1);
                    break;
                case 2:
                    System.out.println("\nMulher, "+suspidade2+" anos.");
                    System.out.println("\nFazendo revista pessoal...");
                    evidencia = rand.nextInt(100) + 1;
                    do{
                        if(evidencia >= 1 && evidencia <= 20) {
                            System.out.println("\nVocê encontrou uma arma de fogo com numeração suprimida.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um suspeito que portava uma arma ilícita, muito bem!");
                                    nivel++;
                                    System.out.println("Parabéns, você já prendeu "+nivel+" suspeitos de forma correta");
                                    System.out.println("Você está agora no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um suspeito que portava uma arma ilícita, isso não condiz com a ética policial!");
                                    moral = moral - 5;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }else if(evidencia >= 21 && evidencia <= 50){
                            System.out.println("\nVocê encontrou substância ilícita.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um suspeito que portava uma substância ilícita, muito bem!");
                                    nivel++;
                                    System.out.println("Parabéns, você já prendeu "+nivel+" suspeitos de forma correta");
                                    System.out.println("Você está agora no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um suspeito que portava uma substância ilícita, isso não condiz com a ética policial!");
                                    moral = moral - 5;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }else{
                            System.out.println("\nVocê não encontrou nada ilícito.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um cidadão que não tinha nada de ilícito, isso não condiz com a ética policial!");
                                    moral = moral - 10;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um cidadão de bem!");
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    System.out.println("Continue patrulhando!");
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }
                    }while(menuacao == 1);
                    break;
                case 3:
                    System.out.println("\nHomem, "+suspidade3+" anos.");
                    System.out.println("\nFazendo revista pessoal...");
                    evidencia = rand.nextInt(100) + 1;
                    do{
                        if(evidencia >= 1 && evidencia <= 20) {
                            System.out.println("\nVocê encontrou uma arma de fogo com numeração suprimida.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um suspeito que portava uma arma ilícita, muito bem!");
                                    nivel++;
                                    System.out.println("Parabéns, você já prendeu "+nivel+" suspeitos de forma correta");
                                    System.out.println("Você está agora no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um suspeito que portava uma arma ilícita, isso não condiz com a ética policial!");
                                    moral = moral - 5;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }else if(evidencia >= 21 && evidencia <= 50){
                            System.out.println("\nVocê encontrou substância ilícita.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um suspeito que portava uma substância ilícita, muito bem!");
                                    nivel++;
                                    System.out.println("Parabéns, você já prendeu "+nivel+" suspeitos de forma correta");
                                    System.out.println("Você está agora no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um suspeito que portava uma substância ilícita, isso não condiz com a ética policial!");
                                    moral = moral - 5;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }else{
                            System.out.println("\nVocê não encontrou nada ilícito.");
                            System.out.println("\nEscolha uma ação: ");
                            System.out.println("\n1 - Prender");
                            System.out.println("\n2 - Liberar");
                            susacao = leia.nextInt();
                            switch (susacao) {
                                case 1:
                                    System.out.println("Você prendeu um cidadão que não tinha nada de ilícito, isso não condiz com a ética policial!");
                                    moral = moral - 10;
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral agora é de: "+moral);
                                    menuacao = 0;
                                    break;
                                case 2:
                                    System.out.println("Você liberou um cidadão de bem!");
                                    System.out.println("Você está no nível "+nivel);
                                    System.out.println("Sua moral é de: "+moral);
                                    System.out.println("Continue patrulhando!");
                                    menuacao = 0;
                                    break;
                                default:
                                    System.out.println("Você escolheu uma ação inválida.");
                                    menuacao = 1;
                                    break;
                            }
                        }
                    }while(menuacao == 1);
                    break;
                case 4:
                    System.out.println("\nVocê encerrou o turno de hoje.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (suschoice != 4);

        if(nivel == 4 && moral >= 70) {
            System.out.println("\nVocê será promovido à Detetive com base no seu Nível: " + nivel + " e sua Moral: " + moral);
        }else if(nivel == 4 && moral < 70) {
            System.out.println("\nVocê atingiu o Nível: "+nivel+", mas, sua Moral é de: "+moral);
            System.out.println("Você não será promovido, pelo contrário, com base nas falhas de hoje você está demitido!");
        }else if(nivel != 4 && moral < 70){
            System.out.println("\nVocê foi contra toda a ética policial! Não precisamos de pessoas assim por aqui!");
            System.out.println("Está demitido!");
        }else{
            System.out.println("\nVocê não prendeu pessoas suficientes para atingir o nível necessário. Tente novamente.");
        }


    }

}