package PessoaTipos;
import Repositorio.PessoaBase;


public class PessoaFisica extends PessoaBase {
    private int cpf;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}