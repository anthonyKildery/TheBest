package dsoo;

public class Curso {
    private int codigo;
    private String nome;
    private double valor;
    public static int cont;

    public Curso() {
        cont = 0;
        cont++;
        this.codigo = cont;
    }

    public void exibirDados() {
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Curso: " +this.nome);
        System.out.println("Valor: R$ " +this.valor);
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
