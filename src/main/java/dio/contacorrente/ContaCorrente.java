package dio.contacorrente;

public class ContaCorrente extends  Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }



    @Override
    public void imprimirExtrato() {
        System.out.println("\n ===extrato conta corrente === ");
        String tipo = "C";
        super.imprimirInfoComuns(tipo);

    }


}
