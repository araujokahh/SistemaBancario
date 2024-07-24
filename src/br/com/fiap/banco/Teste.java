package br.com.fiap.banco;

public class Teste {

    public static void main(String[] args) {

        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 123;
        cc.numero = 321;

        cc.depositar(1000);

        System.out.println(cc.verificarSaldo());

        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50.0);

        System.out.println(poupanca.verificarSaldo());

        Conta cc2 = null;

        if (cc2 != null) {
            cc2.depositar(1000);
            System.out.println(cc2.verificarSaldo());
        }

    }
}
