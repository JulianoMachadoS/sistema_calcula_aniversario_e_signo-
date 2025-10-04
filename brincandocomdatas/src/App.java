/*
  Nome: Juliano Machado da Silva
  Numero de Matriculo: 25108646-8
*/

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Construtor ct = new Construtor();
        System.out.println("\f");
        boolean loop = true;

        // Atributos
        String diaDaSemana;
        String dataAniversarioUsuario = "!";
        String nome = "!";
        String primeiroNome;
        String primeiroNomeInvertido;
        boolean ehpalindromo;
        String signo;
        int vogais;
        int consoantes;
        int letras;
        int dia;
        int mes;
        int ano;
        int diasParaAniversario;
        int idadeUsuario;
        String opcao;

        while (loop){

            opcao = imprimeMenu(nome, dataAniversarioUsuario);

            switch (opcao) {
                case "1":

                    nome = ct.formataNomeUsuario();
                    letras = ct.contaletras(nome);
                    consoantes = ct.contaconsoantes(nome);
                    vogais = ct.contavogais(nome);

                    primeiroNome = ct.pegaPrimeiroNome(nome);
                    primeiroNomeInvertido = ct.geraAnagramaDoTipoPalinromoComPrimeiroNome(primeiroNome);
                    ehpalindromo = ct.ehPalindormo(primeiroNome, primeiroNomeInvertido);
                    System.out.println("\nO seu nome (" + nome + ") possue "+ letras + " letras, sendo " +
                            consoantes + " consoantes e " + vogais + " vogais\n");
                    if (ehpalindromo){
                        System.out.println("O seu nome É UM PALINDROMO, o anagrama "+ primeiroNomeInvertido + " lido de traz para frente é igual " +
                                "\na ele mesmo em sua forma normal! " + primeiroNome);
                    }else {
                        System.out.println("O seu nome NÃO É UM PALINDROMO, o anagrama "+ primeiroNomeInvertido + " lido de traz para frente é diferente " +
                                "\na ele mesmo em sua forma normal! " + primeiroNome);
                    }
                    break;
                case "2":

                    dataAniversarioUsuario = ct.formataDataDeAniversario();
                    // colocar s.o.p. com data no formato -> xx/yy/zzzz
                    System.out.println("\nSua data de nascimento é " + dataAniversarioUsuario.substring(0,2)+
                            "/"+ dataAniversarioUsuario.substring(2,4)+ "/" + dataAniversarioUsuario.substring(4));
                    dia = ct.diaAniversario(dataAniversarioUsuario);
                    mes = ct.mesAniversario(dataAniversarioUsuario);
                    ano = ct.anoAniversario(dataAniversarioUsuario);

                    // Congruência zeller.
                    diaDaSemana = ct.diaDaSemanaDeNascimento(dia, mes, ano);
                    // O.S.P. com o dia da semana de nascimento.
                    if (diaDaSemana.equals("Sábado") || diaDaSemana.equals("Domingo")) {
                        System.out.println("Você nasceu em um " + diaDaSemana);
                    } else {
                        System.out.println("Você nasceu em uma " + diaDaSemana);
                    }

                    // calcula e da um S.O.P. do signo.
                    signo = ct.signodoUsuario(dia, mes);
                    System.out.println("O seu signo é " + signo);
                    diasParaAniversario = ct.diasFaltantesAniversario(dia, mes);
                    
                    idadeUsuario = ct.descobreIdadeUsuario (dia, mes, ano);

                    if (diasParaAniversario == 0) {
                        if (nome.equals("!") ){ // se o usuario ainda não aducionou um nome E for seu aniverversario da S.O.P.

                            System.out.println("\n ---- PARABENS HOJE É SEU ANIVERSARIO!  ----" +
                                    "\n ---- HOJE VOVÊ FAZ " + idadeUsuario + " ANOS! ----\n");

                        }else {// Se o usuario ja adicionou um nome da um S.O.P com o nome junto.

                            System.out.println("\n ---- PARABENS " + nome.toUpperCase() + " HOJE É SEU ANIVERSARIO!  ----" +
                                    "\n ---- HOJE VOVÊ FAZ "+ idadeUsuario + " ANOS! ----");

                        }
                    } else {

                        System.out.println( "Você tem " + idadeUsuario + " anos completos,"+
                                " e faltam " + (diasParaAniversario) + " dias para o seu aniversario. ");
                    }

                    break;
                case "3":

                    System.out.println("\f");

                    break;
                case "4":
                    System.out.println("\n--- SISTEMA ENCERRADO ---\n");
                    loop = false;
            }
        }
    }
    public static String imprimeMenu (String nome, String dataAniversarioUsuario){
        Construtor ct = new Construtor();
        Scanner teclado = new Scanner(System.in);
        String opcao;

        do { // permite que o usuario saibe oq ja foi adicionado.
            if (nome.equals("!" ) && dataAniversarioUsuario.equals("!")){
                System.out.print("\n----------------- MENU -----------------"+
                        "\n1 - para Adicionar nome" +
                        "\n2 - para Adicionar data de nascimento"+
                        "\n3 - para 'Limpar a tela'"+
                        "\n4 - para Encerrar o sistema" +
                        "\nDigite um numero para navegar entre as opções: ");

            } else if (!nome.equals("!" ) && dataAniversarioUsuario.equals("!")) {
                System.out.print("\n----------------- MENU -----------------"+
                        "\n1 - para Alterar nome" +
                        "\n2 - para Adicionar data de nascimento"+
                        "\n3 - para 'Limpar a tela'"+
                        "\n4 - para Encerrar o sistema" +
                        "\nDigite um numero para navegar entre as opções: ");
            }else if (nome.equals("!" ) && !dataAniversarioUsuario.equals("!")){
                System.out.print("\n----------------- MENU -----------------"+
                        "\n1 - para Adicionar nome" +
                        "\n2 - para Alterar data de nascimento"+
                        "\n3 - para 'Limpar a tela'"+
                        "\n4 - para Encerrar o sistema" +
                        "\nDigite um numero para navegar entre as opções: ");
            }else {
                System.out.print("\n----------------- MENU -----------------"+
                        "\n1 - para Alterar nome" +
                        "\n2 - para Alterar data de nascimento"+
                        "\n3 - para 'Limpar a tela'"+
                        "\n4 - para Encerrar o sistema" +
                        "\nDigite um numero para navegar entre as opções: ");
            }
            opcao = teclado.nextLine();
            opcao = ct.formataOpcaoMenu(opcao);

            if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4")){
                opcao = " ";
                System.out.println("\n------------DIGITE UM VALOR VALIDO ----------");
            }

        } while (opcao.equals(" "));

        return opcao;
    }
}