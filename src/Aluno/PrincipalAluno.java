package Aluno;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kauã", 8.5, 9.2, 7.8);
        Aluno aluno2 = new Aluno("Luiza", 9.8, 8.7, 7.9);

        System.out.println("=== Aluno.Aluno 1 ===");
        System.out.println("Nome do Aluno.Aluno: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média Total: " + aluno1.calculaMedia());
        System.out.println();

        System.out.println("=== Aluno.Aluno 2 ===");
        System.out.println("Nome do Aluno.Aluno: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Media Total: " + aluno2.calculaMedia());
    }
}
