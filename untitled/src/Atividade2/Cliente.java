package Atividade2;

public class Cliente extends Pessoa{
    private int numeroDeCliente;

    public Cliente(String nome, int idade, int numeroDeCliente) {
        super(nome, idade);
        this.numeroDeCliente = numeroDeCliente;
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public boolean realizarEmprestimo(Biblioteca biblioteca, String tituloLivro) {
        for (Livro livro : biblioteca.getCatalogo()) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro) && !livro.isEmprestado()) {
                livro.emprestar();
                return true;
            }
        }
        return false;
    }


    public boolean realizarDevolucao(Biblioteca biblioteca, String tituloLivro) {
        for (Livro livro : biblioteca.getCatalogo()) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro) && livro.isEmprestado()) {
                livro.devolver();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verificarCadastroCliente(int numeroCliente, String nomeCliente, int idadeCliente) {
        return false;
    }

    @Override
    public void cadastrarCliente(String nome, int idade, int numeroCliente) {

    }


    @Override
    public void realizarAcao(Pessoa pessoa) {
        System.out.println(getNome() + " quer falar com o gerente");
    }

    @Override
    public void realizarAcao() {

    }
}
