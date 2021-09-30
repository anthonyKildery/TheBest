package dsoo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Aluno aluno01 = new Aluno();
        Turma turma01 = new Turma();

        Presencial[] curso01 = new Presencial[3];
        curso01[0] = new Presencial();
        curso01[1] = new Presencial();
        curso01[2] = new Presencial();

        /*Ead[] curso01 = new Ead[3];
        curso01[0] = new Ead();
        curso01[1] = new Ead();
        curso01[2] = new Ead();*/

        //ASSOCIANDO OBJETOS
        aluno01.setTurma(turma01);
        turma01.setCurso(curso01[0]);
        turma01.setCurso(curso01[1]);
        turma01.setCurso(curso01[2]);

        //ATRIBUIÇÕES
        aluno01.setNome("Anthony");
        turma01.setNome("3 - ano");
        curso01[0].setNome("Iformática");
        curso01[1].setNome("Inglês");
        curso01[2].setNome("Meio Ambiente");

        curso01[0].setValor(0);
        curso01[1].setValor(0);
        curso01[2].setValor(0);

        curso01[0].setCodigo(1);
        curso01[1].setCodigo(2);
        curso01[2].setCodigo(3);

        int opcao01, codigo;
        double valor;
        String nome;

        System.out.println(" _____  _              ______             _   \n" +
                "|_   _|| |             | ___ \\           | |  \n" +
                "  | |  | |__    ___    ||_/ /  ___  ___ | |_ \n" +
                "  | |  | '_ \\  / _ \\   | ___ \\ / _ \\/ __|| __|\n" +
                "  | |  | | | ||  __/   ||_/ /|  __/\\__ \\| |_ \n" +
                "  \\_/  |_| |_| \\___    |\\____/  \\___||___/ \\__|\n");

        int resp01 = 1;
        while (resp01 == 1) { //Menu Principal
            System.out.println("----------------------------------------------------------");
            System.out.println("\n>>>>Menu Principal<<<<");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Exibir");
            System.out.println("Digite a opcao: ");
            opcao01 = ler.nextInt();

            switch (opcao01) {
                case 1: //MENU CADASTRAR
                    System.out.println("\n>>>>Menu Cadastrar<<<<");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Turma");
                    System.out.println("3 - Curso");
                    System.out.println("4 - Voltar ao Menu Principal");
                    System.out.println("Digite a opcao: ");
                    opcao01 = ler.nextInt();

                    switch (opcao01) {
                        case 1: //ALUNO
                            System.out.println("\n>>>>Cadastrar Aluno<<<<");
                            System.out.println("Nome do Aluno: ");
                            nome = ler.nextLine();
                            ler.nextLine(); //LIMPAR BUFFER
                            break;
                        case 2: //TURMA
                            System.out.println("\n>>>>Cadastrar Turma<<<<");
                            System.out.println("Turma: ");
                            nome = ler.nextLine();
                            ler.nextLine(); //LIMPAR BUFFER
                            break;
                        case 3: //CURSO
                            System.out.println("\n>>>>Cadastrar Curso<<<<");
                            System.out.println("Curso: ");
                            nome = ler.nextLine();
                            ler.nextLine(); //LIMPAR BUFFER
                            break;
                    }
                    break;
                //FIM CADASTRAR CASE 1

                case 2: //MENU ALTERAR
                    System.out.println("\n>>>>Menu Alterar<<<<");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Turma");
                    System.out.println("3 - Curso");
                    System.out.println("4 - Voltar ao Menu Principal");
                    System.out.println("Digite a opcao: ");
                    opcao01 = ler.nextInt();

                    switch (opcao01) {
                        case 1: //ALUNO
                            System.out.println("\n>>>>Alterar Dados do Aluno<<<<");
                            System.out.println("Nome do Aluno: ");
                            nome = ler.nextLine();
                            ler.nextLine(); //LIMPAR BUFFER
                            System.out.println("Alteração realizada com sucesso!");
                            break;

                        case 2: //TURMA
                            System.out.println("\n>>>>Alterar Dados da Turma<<<<");
                            System.out.println("Turma: ");
                            nome = ler.nextLine();
                            ler.nextLine(); //LIMPAR BUFFER
                            System.out.println("Alteração realizada com sucesso!");
                            break;

                        case 3: //CURSO
                            System.out.println("\n>>>>Alterar Dados do Curso<<<<");
                            System.out.println("1 - Curso\n2 - Valor\n3 - Voltar ao Menu Principal");
                            System.out.println("Digite a opcao: ");
                            opcao01 = ler.nextInt();

                            switch (opcao01) {
                                case 1: //NOME DO CURSO
                                    System.out.println("Curso: ");
                                    nome = ler.nextLine();
                                    ler.nextLine(); //LIMPAR BUFFER
                                    System.out.println("Alteração realizada com sucesso!");
                                    break;
                                case 2: //VALOR DO CURSO
                                    System.out.println("Valor: ");
                                    valor = ler.nextDouble();
                                    System.out.println("Alteração realizada com sucesso!");
                                    break;
                            }
                    }
                    break;
                //FIM ALTERAR CASE 2

                case 3: //MENU EXIBIR
                    System.out.println("\n>>>>Menu Exibir<<<<");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Turma");
                    System.out.println("3 - Curso");
                    System.out.println("4 - Geral");
                    System.out.println("5 - Voltar ao Menu Principal");
                    System.out.println("Digite a opcao: ");
                    opcao01 = ler.nextInt();

                    switch (opcao01) {
                        case 1: //ALUNO
                            aluno01.exibirDados();
                            break;
                        case 2: //TURMA
                            turma01.exibirDados();
                            break;
                        case 3: //CURSO
                            System.out.println("Digite o código: ");
                            codigo = ler.nextInt();
                            curso01[codigo].exibirDados();
                            break;
                        case 4: //GERAL
                            System.out.println("Digite o código: ");
                            codigo = ler.nextInt();
                            aluno01.exibirDados();
                            turma01.exibirDados();
                            curso01[codigo].exibirDados();
                            break;
                    }
                    break;
                //FIM EXIBIR CASE 3

            } //FIM SWITCH
        } //FIM WHILE RESP01
    }
}
