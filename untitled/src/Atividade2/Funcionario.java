package Atividade2;

public class Funcionario extends Pessoa {
    private String cargo;
    private Cliente[] clientesCadastrados;
    private int numClientesCadastrados;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
        this.clientesCadastrados = new Cliente[100]; // Ajuste o tamanho do array conforme necessário
        this.numClientesCadastrados = 0;
    }

    public Funcionario(String nome, int idade,String cargo, Cliente[] clientesCadastrados) {
        super(nome, idade);
        this.clientesCadastrados = clientesCadastrados;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public void cadastrarCliente(String nome, int idade, int numeroCliente) {
        if (numClientesCadastrados < clientesCadastrados.length) {
            Cliente novoCliente = new Cliente(nome, idade, numeroCliente);
            clientesCadastrados[numClientesCadastrados] = novoCliente;
            numClientesCadastrados++;
            System.out.println("Cliente " + novoCliente.getNome() + " cadastrado com sucesso por " + this.getNome());
        } else {
            System.out.println("Não é possível cadastrar mais clientes. Limite atingido");
        }
    }

    public boolean verificarCadastroCliente(int numeroCliente, String nomeCliente, int idadeCliente) {
        for (Cliente cliente : clientesCadastrados) {
            if (cliente != null && cliente.getNumeroDeCliente() == numeroCliente) {
                return true; // O cliente está cadastrado
            }
        }

        // Se o cliente não estiver cadastrado, permita o cadastro
        cadastrarCliente(nomeCliente, idadeCliente, numeroCliente);
        return false;
    }


    @Override
    public void realizarAcao(Pessoa pessoa) {
        System.out.println("O funcionario " + getNome() + " cujo cargo é de " + getCargo() + " esta registrando o ponto");
    }

    @Override
    public void realizarAcao() {

    }

    @Override
    public boolean realizarEmprestimo(Biblioteca biblioteca, String tituloLivro) {
        return false;
    }

    @Override
    public boolean realizarDevolucao(Biblioteca biblioteca, String tituloLivro) {
        return false;
    }
}
