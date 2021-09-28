package dsoo;

public class Aluno {
    private int codigo;
    private String nome;
    private Turma turma;
    public static int cont;

    public Aluno() {
        cont = 0;
        cont++;
        this.codigo = cont;
    }

    public void exibirDados() {
        System.out.println("----------------------------------------------------------");
        System.out.println(">>>>Dados do Aluno " +this.nome+ "<<<<");
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Turma: " +this.turma.getNome());
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
