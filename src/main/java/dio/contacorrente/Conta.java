package dio.contacorrente;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL =1;

    @Getter
    protected int agencia;

    @Getter
    protected int numero;

    @Getter
    protected double saldo;
    protected Cliente cliente;

    @Getter
    protected double chEspecial;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void chEspecial(double valor) {
        chEspecial = valor;
    }


    protected void imprimirInfoComuns(String tipo) {
        System.out.println(String.format("Titular          : %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia          : %d", this.agencia));
        System.out.println(String.format("Numero           : %d", this.numero));
        if (tipo.equalsIgnoreCase("C"))
           System.out.println(String.format("Cheque Especial  : %.2f", this.chEspecial));
        System.out.println(String.format("Saldo            : %.2f", this.saldo));
        System.out.println(String.format("======================================"));
        System.out.println(String.format("Saldo  Total     : %.2f", this.saldo+this.chEspecial));

    }

    protected void imprimirInfoClientes(List<Cliente> cliente) {
        System.out.println("\n*** Clientes do Banco ***\n");
        for (Cliente item : cliente) {
            System.out.println(item.getNome());
        }

    }

}
