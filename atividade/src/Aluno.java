public class Aluno extends Pessoa{
    private String matricula;

    // public Aluno (String matricula){

    // }

     public void setMatricula (String matricula){
        this.matricula = matricula;
    }

    public String getMatricula (){
        return this.matricula;
    }
    
    public void imprimirDados (){
        System.out.println ("Nome do Aluno: " + getNome());
        System.out.println ("CPF do Aluno: " + getCPF());
        System.out.println ("Idade do Aluno: " + getIdade());
        System.out.println ("Matricula do Aluno: " + getMatricula());
    }
}