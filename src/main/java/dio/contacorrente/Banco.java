package dio.contacorrente;

import lombok.Data;
import lombok.NonNull;

import java.util.List;


@Data
public class Banco {

    @NonNull
    public String nome;
    @NonNull
    private List<Conta> contas;
    @NonNull
    public List<Conta> getContas() {
        return contas;
    }

}
