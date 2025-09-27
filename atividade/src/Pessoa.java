public class Pessoa{
    private String nome;
    private String cpf;
    private int idade;

    // public Pessoa (String nome, String cpf, int idade){
    // 
    // }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public boolean setCPF (String cpf){
        if (validarCPF(cpf)) {
            this.cpf = cpf;
            return true;
        }else{
            return false;
        }
        
    }

    public String getCPF (){
        return this.cpf;

    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getIdade (){
        return this.idade;
    }

    private boolean validarCPF (String cpf){
        cpf = cpf.replaceAll("[^\\d]", "");
        return cpf.length() == 11;

    }
}