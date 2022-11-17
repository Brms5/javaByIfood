package subsistema2.cep;

import projeto_desafio.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Campinas";
    }

    public String recuperarEstado(String cidade) {
        return "São Paulo";
    }
}
