import java.util.Scanner;

public class App {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Bem vindo ao Sistema de Cadastro de Alunos e Professores");
        System.out.println("Digite 1 para cadastrar um Aluno e digite 2 para cadastrar um Professor: ");
        
        int escolha = sc.nextInt();

        while(escolha != 1 && escolha != 2){
            System.out.println("Digite apenas 1 ou 2: ");
            escolha = sc.nextInt();
        }
        sc.nextLine();

        if (escolha == 1){

            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            aluno.setNome(nome);

            System.out.println("Digite o cpf do aluno: ");
            String cpf = sc.nextLine();
            boolean cpfValido = aluno.setCPF(cpf);

            while (!cpfValido) {
                System.out.println("CPF inválido, digite novamente: ");
                cpf = sc.nextLine();
                cpfValido = aluno.setCPF(cpf);
            }
            
            System.out.println("Digite a idade do aluno: ");
            int idade = sc.nextInt();
            sc.nextLine();
            aluno.setIdade(idade);

            System.out.println("Digite a matricula do aluno: ");
            String matricula = sc.nextLine();
            aluno.setMatricula(matricula);

            aluno.imprimirDados();

        }
        else if (escolha == 2){

            Professor professor = new Professor();

            System.out.println("Digite o nome do professor: ");
            String nome = sc.nextLine();
            professor.setNome(nome);

            System.out.println("Digite o cpf do professor: ");
            String cpf = sc.nextLine();
            boolean cpfValido = professor.setCPF(cpf);
            
            while (!cpfValido) {
                System.out.println("CPF inválido, digite novamente: ");
                cpf = sc.nextLine();
                cpfValido = professor.setCPF(cpf);
            }
            
            System.out.println("Digite a idade do professor: ");
            int idade = sc.nextInt();
            sc.nextLine();
            professor.setIdade(idade);

            System.out.println("Digite o salário do professor: ");
            double salario = sc.nextDouble();
            professor.setSalario(salario);

            professor.imprimirDados();

        }else{
            System.out.println("Escolha inválida");
        }

        sc.close();
    }
}