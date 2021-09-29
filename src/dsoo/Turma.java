package dsoo;

public class Turma {
    private int codigo;
    private String nome;
    private Curso curso;
    public static int cont;

    public Turma() {
        cont = 0;
        cont++;
        this.codigo = cont;
    }

    public void exibirDados() {
        System.out.println(">>>>Dados da Turma<<<<");
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Turma: " +this.nome);
        System.out.println("");
    }

    //Gette e Sette
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
