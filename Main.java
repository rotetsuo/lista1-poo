public class Main {


    private static void testarReacao(){
        int totalTestes = 7;
        int testesCorretos = 0;
        System.out.println("### Reacao\n");
        Reacao r = new Reacao(1, 1);
        testesCorretos += rodarTeste("Valores iniciais",r.getC() == 0);
        r.adicionarA(1);
        r.adicionarB(1);
        testesCorretos += rodarTeste("Se não agitar, continua igual", r.getC() == 0);
        r.agitar();
        testesCorretos += rodarTeste("Se agitar, produz C", r.getC() == 1);
        r.agitar();
        testesCorretos += rodarTeste("Se agitar de novo, não produz mais C", r.getC() == 1);

        r = new Reacao(2, 3);
        r.adicionarA(6);
        r.adicionarB(6);
        r.agitar();
        testesCorretos += rodarTeste("C é produzido na quantidade correta", r.getC() == 2);
        r.adicionarB(6);
        r.agitar();
        testesCorretos += rodarTeste("Sobra de A pode ser reutilizada", r.getC() == 3);
        r.adicionarA(2);
        r.agitar();
        testesCorretos += rodarTeste("Sobra de B pode ser reutilizada", r.getC() == 4);

        mostrarResultado(testesCorretos, totalTestes);
    }

    
    private static int rodarTeste(String titulo, boolean resultado){
        System.out.println("- " + (resultado ? "OK" : "X ") + "\t" + titulo);
        return resultado ? 1 : 0;
    }

    private static void mostrarResultado(int testesCorretos, int totalTestes){
        System.out.println("\n> Testes corretos: " + testesCorretos + "/" + totalTestes + " ("+(100*testesCorretos/totalTestes)+"%)");
        if(testesCorretos == totalTestes){
            System.out.println("> Tudo certo!!!");
        } else {
            System.out.println(">  Ainda falta um pouquinho, mas você consegue!");
        }
    }

    public static void main(String[] args) {
        testarReacao();
        System.out.println();
      
    }
    
   /* private static void testarReacao(){
      Reacao r = new Reacao(5, 3);
      r.adicionarA(10);
      r.adicionarB(6);
      r.agitar();
      r.getC();
      System.out.println(r.getC());
    }
      public static void main(String[] args) {
        testarReacao();
        System.out.println();
      
    }
    */
}
