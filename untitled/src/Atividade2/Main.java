package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(10); // Ajuste a capacidade da biblioteca conforme necessário

        biblioteca.adicionarLivroInciais(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarLivroInciais(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"));
        biblioteca.adicionarLivroInciais(new Livro("1984", "George Orwell"));
        biblioteca.adicionarLivroInciais(new Livro("Joao e Maria", "Jacob Grimm"));

        Pessoa pessoa3 = new Cliente("Mariana", 25, 1);
        Pessoa pessoa4 = new Cliente("Joao", 20, 2);

        Pessoa pessoa1 = new Funcionario("Carlos", 30, "Bibliotecário");
        Pessoa pessoa2 = new Funcionario("Mário", 54, "Gerente");


        int escolha;
        do {
            System.out.println("\n===== Menu da Biblioteca =====");
            System.out.println("1 - listar Todos os Livros");
            System.out.println("2 - Listar Livros Disponíveis");
            System.out.println("3 - Realizar Empréstimo");
            System.out.println("4 - Realizar Devolução");
            System.out.println("5 - Adicionar Livro ao catalogo");
            System.out.println("6 - Remover Livro do catalogo");
            System.out.println("7 - Registrar Ponto - funcionario");
            System.out.println("8 - CLiente Chamar gerente");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    biblioteca.listarTodosLivros();
                    break;
                case 2:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 3:
                    pessoa1.verificarCadastroCliente(1, pessoa3.getNome(), pessoa3.getIdade());
                    System.out.print("Digite o título do livro para empréstimo: ");
                    String livroParaEmprestimo = scanner.nextLine();
                    if (((Cliente) pessoa3).realizarEmprestimo(biblioteca, livroParaEmprestimo)) {
                        System.out.println("Empréstimo realizado com sucesso");
                    } else {
                        System.out.println("Livro não encontrado ou já emprestado");
                    }
                    break;

                case 4:
                    pessoa1.verificarCadastroCliente(2, pessoa3.getNome(), pessoa4.getIdade());
                    System.out.print("Digite o título do livro para devolução: ");
                    String livroParaDevolucao = scanner.nextLine();
                    if (((Cliente) pessoa3).realizarDevolucao(biblioteca, livroParaDevolucao)) {
                        System.out.println("Devolução realizada com sucesso");
                    } else {
                        System.out.println("Livro não encontrado ou não estava emprestado");
                    }
                    break;

                case 5:
                    System.out.print("Digite o título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    String autorLivro = scanner.nextLine();
                    Livro novoLivro = new Livro(tituloLivro, autorLivro);
                    biblioteca.adicionarLivro(novoLivro);
                    break;
                case 6:
                    System.out.print("Digite o título do livro a ser removido: ");
                    String livroParaRemover = scanner.nextLine();
                    biblioteca.removerLivro(livroParaRemover);
                    break;
                case 7:
                    pessoa3.realizarAcao(pessoa3);
                    break;
                case 8:
                    pessoa1.realizarAcao(pessoa1);
            }
        } while(escolha != 9);
        System.out.println("Obrigado, volte sempre!");


    }
}


