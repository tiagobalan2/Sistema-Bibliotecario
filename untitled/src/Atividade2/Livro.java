package Atividade2;

public class Livro implements ItemBiblioteca{
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("Livro '" + titulo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("Livro '" + titulo + "' já foi devolvido.");
        }
    }
}
