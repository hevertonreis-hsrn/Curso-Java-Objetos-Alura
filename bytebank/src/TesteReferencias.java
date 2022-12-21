public class TesteReferencias {
    public static void main(String[] args) {
        
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta está"
                            + " na agencia " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
