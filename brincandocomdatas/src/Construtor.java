import java.sql.SQLOutput;
import java.text.Normalizer;
import java.util.Date;
import java.util.Scanner;
public class Construtor {
    public int contaletras(String nome){
        Contadores c = new Contadores();
        return c.contaLetras(nome);
    }
    public int contavogais(String nome){
        Contadores c = new Contadores();
        return c.contaVogais(nome);
    }
    public int contaconsoantes (String nome){
        Contadores c = new Contadores();
        return c.contaConsoantes(nome);
    }
    public String formataOpcaoMenu (String opcao){
        Removedores r = new Removedores();
        opcao = r.removeEspacos(opcao);
        opcao = r.removeSimbulos(opcao);
        opcao = r.removeLetras(opcao);
        opcao = r.removeEspacosInicioFim(opcao);
        opcao = ordenaString(opcao);// ordena em crescente os numeros. (123456...)
        // ordena de novo
        while (opcao.length() > 1 ){
            opcao = opcao.substring(0,1);
        }
        return opcao;
    }
    public String ordenaNumerosStringPorQuantidade(String numero){
        char menor;
        char maior;
        for (int i =0; i < numero.length(); i++){

        }
        return numero;
    }
    public String formataDataDeAniversario(){
        Scanner teclado = new Scanner(System.in);
        Verificadores v = new Verificadores();
        Removedores r = new Removedores();
        Contadores c = new Contadores();
        String dataDeNascimento = " ";
        int dia;
        int mes;
        int ano;
        int contadorWhile = 0;
        int contadorIF = 0;
        while (contadorWhile != 8 ){
            if (contadorIF == 0){
                System.out.print("Que dia você nasceu?\nDe a data neste formato [ dia/mes/ano ] " +
                        "com zeros inclusos ");
                contadorIF++;
            }else{
                System.out.println("\nSua data precisa estar neste formato [ dia/mes/ano ] com zeros inclusos. " +
                        "\nEx: 02/03/2002 , (dois de março de dois mil e dois) \n");
                System.out.print("Digite novamente sua data de nascimento: ");
            }
            dataDeNascimento = teclado.nextLine();
            dataDeNascimento = r.removeEspacos(dataDeNascimento);
            dataDeNascimento = r.removeSimbulos(dataDeNascimento);
            dataDeNascimento = r.removeLetras(dataDeNascimento);
            // validador de data existente!
            contadorWhile = c.contaNumeros(dataDeNascimento);
            if (contadorWhile == 8 ){
                dia = diaAniversario(dataDeNascimento);
                mes = mesAniversario(dataDeNascimento);
                ano = anoAniversario(dataDeNascimento);
                if (!v.ehDataValida(dia , mes , ano)){
                    contadorWhile = 0;
                }
            }
        }
        return dataDeNascimento;
    }
    public int diaAniversario (String dataDenascimento){
        int dia = Integer.parseInt(dataDenascimento.substring(0,2));
        return dia;
    }
    public int mesAniversario (String dataDenascimento){
        int mes = Integer.parseInt(dataDenascimento.substring(2,4));
        return mes;
    }
    public int anoAniversario (String dataDenascimento){
        int ano = Integer.parseInt(dataDenascimento.substring(4));
        return ano;
    }
    public String diaDaSemanaDenascimento(int dia, int mes, int ano){
        Scanner teclado = new Scanner(System.in);
        if (mes <= 2) {
            mes += 12;
            ano -= 1;
        }
        int j = ano/100; // J é o século ano/100
        int k =  (ano % 100);//K é o ano do século (ano\mod 100)
        int div1 = ((mes +1)*26)/10;
        int div2 = k /4;
        int div3 = j /4;
        int diaDaSemana = (( dia + k + (5*j) + div1 + div2 + div3) % 7 );// modulo 7
       if (diaDaSemana == 0){
           return "Sábado";
       } else if (diaDaSemana == 1) {
           return "Domingo";
       }else if (diaDaSemana == 2) {
           return "Segunda-feira";
       }else if (diaDaSemana == 3) {
           return "Terça-feira";
       }else if (diaDaSemana == 4) {
           return "Quarta-feira";
       }else if (diaDaSemana == 5){
           return "Quinta-feira";
       }
       return "Sexta-feira";
    }
    public String signodoUsuario (int dia, int mes){
        //Aquário: 21 de janeiro a 19 de fevereiro
        if (  (mes == 1 && dia >=21) || (mes == 2 && dia <=19 )  ) {
            return "Aquário";
           //Peixes: 20 de fevereiro a 20 de março
        } else if (mes == 2 || (mes == 3 && dia <= 20)) {
            return "Peixes";
            //Áries: 21 de março a 20 de abril
        }else if (mes == 3 || (mes == 4 && dia <= 20)){
            return "Áries";
            //Touro: 21 de abril a 20 de maio
        }else if (mes == 4 || (mes == 5 && dia <= 20)){
            return "Touro";
            //Gêmeos: 21 de maio a 20 de junho
        }else if (mes == 5 || (mes == 6 &&  dia <= 20)){
            return "Gêmeos";
            //Câncer: 21 de junho a 22 de julho
        }else if (mes == 6 || (mes == 7 &&  dia <= 22)){
            return "Câncer";
            //Leão: 23 de julho a 22 de agosto
        }else if (mes == 7 || (mes == 8 && dia <= 22)){
            return "Leão";
            //Virgem: 23 de agosto a 22 de setembro
        }else if (mes == 8 || (mes == 9 &&  dia <= 22)){
            return "Virgem";
            //Libra: 23 de setembro a 22 de outubro
        }else if (mes == 9 || (mes == 10 && dia <= 20)){
            return "Libra";
            //Escorpião: 23 de outubro a 21 de novembro
        }else if (mes == 10 || (mes == 11 && dia <= 20)){
            return "Escorpião";
            //Sagitário: 22 de novembro a 21 de dezembro
        }else if (mes == 11 || (mes == 12 && dia <= 21)){
            return "Sagitário";
            //Capricórnio: 22 de dezembro a 20 de janeiro
        }
        return "Capricórnio";
    }

    public boolean comparaAnagrama(String primeiroNome, String segundoNome) {
        Removedores r = new Removedores();
        String normalizadoP = r.removeEspacos(Normalizer.normalize(primeiroNome, Normalizer.Form.NFD));
        String normalizadoS = r.removeEspacos(Normalizer.normalize(segundoNome, Normalizer.Form.NFD));

        if(normalizadoP.length() != normalizadoS.length()) {
            return false;
        }

        String stringOrdenadaP = ordenaString(normalizadoP.toLowerCase());
        String stringOrdenadaS = ordenaString(normalizadoS.toLowerCase());

        return stringOrdenadaP.equals(stringOrdenadaS);
    }
        // ordena a String, os caracteres de maior quantidade ficam na parte mais significativa. (a esquerda)
    public String ordenaString (String valor) {
        StringBuilder stringOrdenada = new StringBuilder();
        String copia = valor;
        while (!copia.isEmpty()) {
            String menor = copia.substring(0, 1);
            int indexMenor = 0;

            for (int i = 1; i < copia.length(); i++) {
                String teste = copia.substring(i, i+1);
                if(menor.compareTo(teste) > 0) {
                    menor = teste;
                    indexMenor = i;
                }
            }

            stringOrdenada.append(menor);
            copia = copia.substring(0, indexMenor) + copia.substring(indexMenor + 1);
        }
        System.out.println("\n" + stringOrdenada.toString() + "\n");
        System.out.println("\n------------stringOrdenada.toString()----------------\n");
        return stringOrdenada.toString();
    }

    public int diasFaltantesAniversario(int dia, int mes) {
        Date atual = new Date();

        Date aniversarioDate = new Date(atual.getYear(), mes-1, dia+1);

        if (aniversarioDate.before(atual)) {
            aniversarioDate = new Date(atual.getYear() + 1, mes-1, dia+1);
        }

        long tempo = (aniversarioDate.getTime() - atual.getTime()) / 86400000;

        return (int) tempo;

    }
    public String nomeUsuario(){
        Contadores c = new Contadores();
        Removedores r = new Removedores();
        Scanner teclado  = new Scanner (System.in);
        String nome = " ";
        int contador = 0;
            do {
                if (contador == 0){
                    System.out.print("Digite seu nome ");
                }else if (contador < 2){
                    System.out.print("\nDigite um nome valido ");
                }else {
                    System.out.print("\nDeve conter no mínimo 3 caracteres" +
                            "\nEx: Ana\nDigite um nome valido ");
                }
                nome = teclado.nextLine();
                nome = nome.toLowerCase();
                // valida se tem mais de 3 caracteres, evita "exeption" nas remoções de char's na string
                if(c.contaLetras(nome)>= 3){
                    nome = r.removeSimbulos(nome);
                    nome = r.removeEspacosDuplos(nome);
                    nome = r.removeNumeros(nome);
                    nome = r.removeEspacosInicioFim(nome);
                    nome = primeiraLetraMaiuscula(nome);
                    nome = maiusculaDepoisDoespaco(nome);
                }
                contador ++;
            }while (!(c.contaLetras(nome)>= 3));

        return nome;
    }
    public String primeiraLetraMaiuscula(String texto){
        texto = texto.substring(0,1).toUpperCase() + texto.substring(1);
        return texto;
    }
    public String maiusculaDepoisDoespaco (String texto){
        Verificadores vr = new Verificadores();
        for (int i = 0; i < texto.length() - 1; i++){
            if (texto.charAt(i) == ' ' && vr.ehLetradoAlfabetoAZ(texto.charAt(i+1)) ){
                //se for " "  E letra do alfabeto a sucessão (i+1) entra no if
                texto = texto.substring(0,i+1) + Character.toUpperCase(texto.charAt(i+1)) + texto.substring(i+2, texto.length());
            }
        }
        return texto;
    }
}
