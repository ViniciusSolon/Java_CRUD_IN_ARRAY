package Repositorio;

public abstract class PessoaBase implements IPessoa {
    private String nome;

    public PessoaBase(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
