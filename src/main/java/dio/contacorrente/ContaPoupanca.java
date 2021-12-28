package dio.contacorrente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }




    @Override
    public void imprimirExtrato() {
        System.out.println("\n === extrato conta poupanca === ");
        String tipo = "P";
        super.imprimirInfoComuns(tipo);

    }


}


