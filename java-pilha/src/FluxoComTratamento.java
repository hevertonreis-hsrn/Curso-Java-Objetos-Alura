public class FluxoComTratamento {
    
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException ex) {
            //System.out.println("Exceção de Aritmética");
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exceção de NullPointer " + msg);
            //ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i / 0;
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
