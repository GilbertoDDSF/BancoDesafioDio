package desafio.fio.banco;

import java.util.Scanner;

public class TesteContas {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Gilberto");
        cliente.setCpf("0000000000");
        cliente.setProfissao("Dev Java");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getProfissao());

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(300.0);

        cc.transfere(20.0, cp);

        System.out.println("CC: " + cc.getSaldo()); //Conta Corrente
        System.out.println("CP: " + cp.getSaldo()); //Conta Poupanca

    }

}