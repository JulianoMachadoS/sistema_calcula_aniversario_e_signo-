import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("\f");
        imprimeMenu();
        boolean loop = false;
        double dbV1, dbV2;
        int intV1, intV2, contador = 1;
        String nome = "Juliano";
        String teste = "02/03/2002";
        while (!loop == true){// inicio do menu de teste
            System.out.println(teste);
            System.out.println("Texto FORMATADO: \n" );
            //fim teste
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