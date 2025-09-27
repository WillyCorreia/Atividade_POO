public class Professor extends Pessoa{
    private double salario;

    // public Professor (Pessoa pessoa, double salario){

    // }

    public void setSalario (double salario){
        this.salario = salario;
    }

    public double getSalario (){
        return this.salario;
    }
    
    public void imprimirDados (){
        System.out.println ("Nome do Professor: " + getNome());
        System.out.println ("CPF do Professor: " + getCPF());
        System.out.println ("Idade do Professor: " + getIdade());
        System.out.println ("Salario do Professor: " + getSalario());
    }
}