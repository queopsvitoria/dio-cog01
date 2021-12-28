package dio.contacorrente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente queops = new Cliente();
        queops.setNome("Queops");

        Cliente maria = new Cliente();
        maria.setNome("maria");

        Cliente bosta = new Cliente();
        bosta.setNome("bosta");

        List<Cliente> listClientes = new ArrayList<>();

        listClientes.add(queops);
        listClientes.add(maria);
        listClientes.add(bosta);

        Conta cc = new ContaCorrente(queops);
        cc.depositar(120);
        cc.chEspecial(1000);

        Conta poupanca = new ContaPoupanca(queops);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
      //  String tipo = "C";
       // cc.imprimirInfoComuns(tipo);
        poupanca.imprimirExtrato();
        cc.imprimirInfoClientes(listClientes);

    }
}
