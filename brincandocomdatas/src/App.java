import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Construtor ct = new Construtor();
        Scanner teclado = new Scanner(System.in);
        LocalDate dataDaMaquina = LocalDate.now();
        System.out.println("\f");

        boolean loop = true;
        int contador = 1;
        String diaDaSemana;
        String dataTeste = "";
        String nome = "vazio";
        int vogais;
        int consoantes;
        int letras;
        int dia;
        int mes;
        int ano;
        int diasParaAniversario;
        String opcao;
        //System.out.println("Teste de anagrama: " + ct.comparaAnagrama("ROMANTICES", "CENTISROMA"));

        //new Verificadores().ehDataValida(1,12,2005);
        while (loop){

            opcao = imprimeMenu();

            switch (opcao) {
                case "1":

                    nome = ct.nomeUsuario();
                    letras = ct.contaletras(nome);
                    consoantes = ct.contaconsoantes(nome);
                    vogais = ct.contavogais(nome);

                    System.out.println("\nO seu nome (" + nome + ") possue "+ letras + " letras, sendo " +
                            consoantes + " consoantes e " + vogais + " vogais\n");
                    break;
                case "2":
                    dataTeste = ct.formataDataDeAniversario();
                    System.out.println("\nSua data de nascimento é " + dataTeste.substring(0,2)+
                            "/"+dataTeste.substring(2,4)+ "/" +dataTeste.substring(4));
                    // colocar sop com data no formato -> xx/zz/wwww
                    dia = ct.diaAniversario(dataTeste);
                    mes = ct.mesAniversario(dataTeste);
                    ano = ct.anoAniversario(dataTeste);

                    diaDaSemana = ct.diaDaSemanaDenascimento(dia, mes, ano);

                    if (diaDaSemana.equals("Sábado") || diaDaSemana.equals("Domingo")) {
                        System.out.println("Você nasceu em um " + diaDaSemana);
                    } else {
                        System.out.println("Você nasceu em uma " + diaDaSemana);
                    }
                    System.out.println("O seu signo é " + ct.signodoUsuario(dia, mes));
                    diasParaAniversario = ct.diasFaltantesAniversario(dia, mes);
                    if (diasParaAniversario == 0) {
                        if (nome.equals("vazio") ){
                            System.out.println("\n ---- PARABENS HOJE É SEU ANIVERSARIO!  ----\n");
                        }else {
                            System.out.println("\n ---- PARABENS " + nome.toUpperCase() + " HOJE É SEU ANIVERSARIO!  ----\n");
                        }
                    } else {
                        System.out.println("Faltam " + ct.diasFaltantesAniversario(dia, mes) + " dias para o seu aniverário");
                    }
                    break;
                case "3":
                    System.out.println("\n--- SISTEMA ENCERRADO ---\n");
                    loop = false;

            }
        }
    }
    public static String imprimeMenu (){
        Construtor ct = new Construtor();
        Scanner teclado = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n----------------- MENU -----------------\n"+
                    "Digite um numero para navegar entre as opções:" +
                    "\n1 - para Adicionar nome" +
                    "\n2 - para Adicionar data de nascimento"+
                    "\n3 - para encerrar o sistema");

            opcao = teclado.nextLine();
            opcao = ct.formataOpcaoMenu(opcao);

            if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")){
                opcao = " ";
                System.out.println("\n------------DIGITE UM VALOR VALIDO ----------");
            }

        } while (opcao.equals(" "));

        return opcao;
    }
}