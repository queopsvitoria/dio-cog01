package dio.contacorrente;

public abstract interface Iconta {
     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

     void chEspecial(double valor);

     void imprimirExtrato();
}
