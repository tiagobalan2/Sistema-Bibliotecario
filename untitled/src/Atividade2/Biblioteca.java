package Atividade2;

public class Biblioteca {
    private Livro[] catalogo;
    private int tamanho;



    public Biblioteca(int capacidade) {
        this.catalogo = new Livro[capacidade];
        this.tamanho = 0;
    }

    public Livro[] getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Livro[] catalogo) {
        this.catalogo = catalogo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionarLivroInciais(Livro livro) {
        if (tamanho < catalogo.length) {
            catalogo[tamanho] = livro;
            tamanho++;
        } else {
            System.out.println("O catálogo está cheio. Não é possível adicionar mais livros");
        }
    }

    public void adicionarLivro(Livro livro) {
        if (tamanho < catalogo.length) {
            catalogo[tamanho] = livro;
            tamanho++;
            System.out.println("Livro '" + livro.getTitulo() + "' foi adicionado ao catálogo");
        } else {
            System.out.println("O catálogo está cheio. Não é possível adicionar mais livros");
        }
    }

    public void removerLivro(String titulo) {
        for (int i = 0; i < tamanho; i++) {
            if (catalogo[i] != null &&  catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {
                catalogo[i] = null;
                atualizarCatalogo();
                System.out.println("Livro removido do catalógo");
                return;
            }
        }
        System.out.println("Livro não encontrado no catálogo");
    }

    private void atualizarCatalogo() {
        Livro[] novoCatalogo = new Livro[catalogo.length];
        int novoTamanho = 0;

        for (Livro livro : catalogo) {
            if (livro != null) {
                novoCatalogo[novoTamanho] = livro;
                novoTamanho++;
            }
        }

        catalogo = novoCatalogo;
        tamanho = novoTamanho;
    }

    /*public Livro[] getAcervo() {
        return catalogo.clone(); // Retorna uma cópia do array acervo
    }*/

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis no momento na biblioteca: ");
        for (int i = 0; i < tamanho; i++) {
            if (!catalogo[i].isEmprestado()) {
                System.out.println("- " + catalogo[i].getTitulo() + " (" + catalogo[i].getAutor() + ")");
            }
        }
    }

    public void listarTodosLivros() {
        System.out.println("Todos os livros da biblioteca: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("- " + catalogo[i].getTitulo() + " (" + catalogo[i].getAutor() + ")");
        }
    }


}
