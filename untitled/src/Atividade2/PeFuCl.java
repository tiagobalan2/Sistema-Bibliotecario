package Atividade2;

public interface PeFuCl {
    void realizarAcao();

    boolean realizarEmprestimo(Biblioteca biblioteca, String tituloLivro);
    boolean realizarDevolucao(Biblioteca biblioteca, String tituloLivro);
    boolean verificarCadastroCliente(int numeroCliente, String nomeCliente, int idadeCliente);
    void cadastrarCliente(String nome, int idade, int numeroCliente);

}
