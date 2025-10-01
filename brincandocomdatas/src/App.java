import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Construtor ct = new Construtor();
        LocalDate dataDaMaquina = LocalDate.now();
        System.out.println("\f");
        imprimeMenu();
        boolean loop = false;
        int contador = 1;
        String diaDaSemana;
        String dataTeste = "";
        String nome;
        int vogais;
        int consoantes;
        int letras;
        int dia;
        int mes;
        int ano;
        int diasParaAniversario;

        //System.out.println("Teste de anagrama: " + ct.comparaAnagrama("ROMANTICES", "CENTISROMA"));

        while (!loop == true){
            //inicio nome teste
            nome = ct.nomeUsuario();
            System.out.println(nome);
            //fim nome teste

            //inicio data Teste

            dataTeste = ct.formataDataDeAniversario();

            dia = ct.diaAniversario(dataTeste);
            mes = ct.mesAniversario(dataTeste);
            ano = ct.anoAniversario(dataTeste);

            diaDaSemana = ct.diaDaSemanaDenascimento(dia, mes, ano);

            if(diaDaSemana.equals("Sábado") || diaDaSemana.equals("Domingo")){
                System.out.println("Você nasceu em um " + diaDaSemana);
            }else {
                System.out.println("Você nasceu em uma " + diaDaSemana);
            }
            System.out.println("O seu signo é " + ct.signodoUsuario(dia, mes));
            diasParaAniversario = ct.diasFaltantesAniversario(dia, mes);
            if (diasParaAniversario == 0){
               System.out.println(" ---- PARABENS " + nome.toUpperCase() + " HOJE É SEU ANIVERSARIO!  ----");
            }else {
                System.out.println("Faltam " + ct.diasFaltantesAniversario(dia, mes) + " dias para o seu aniverário");
            }
            //fim data Teste
            loop = parasistema(contador);
            contador++;
        }
    }
    public static void imprimeMenu (){
        System.out.println("-----------------TESTE DO EDITOR-----------------\n");
    }
    public static boolean parasistema(int contador){
        Scanner teclado = new Scanner (System.in);
        System.out.println("\nDigite 1 para SAIR ou qualquer outra coisa para REINICIAR");
        String sair = teclado.nextLine();
        if (sair.indexOf("1") >= 0) {
            System.out.println("FIM DO TESTE\n");
            return true;
        }
        System.out.println("----------------- TESTE REINICIADO / teste "+ contador + " ----------");
        return false;
    }
}