package DioBank;

public class Main {

    public static void main(String[] args) {
        Cliente Gerson = new Cliente();
        Gerson.setNome("Gerson");

        Conta cc = new ContaPoupanca(Gerson);
        Conta poupanca = new ContaCorrente(Gerson);

        cc.depositar(60000);
        cc.transferir(10000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        }
}
