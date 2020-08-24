public class Empregado{
    
    private String nome;
    private String cargo;
    private double salario;
    private double porcentagemAumento;

    String getNome(){
        return nome;
    }
    void setNome(String novoNome){
        nome = novoNome;
    }

    String getCargo(){
        return cargo;
    }
    void setCargo(String novoCargo){
        cargo = novoCargo;
    }

    Double getSalario(){
        return salario;
    }
    void setSalario(double novoSalario){
        salario = novoSalario;
    }

    Double getPorcentagemAumento(){
        return porcentagemAumento;
    }
    void setPorcentagemAumento(double novoPorcentagemAumento){
        porcentagemAumento = novoPorcentagemAumento;
    }

    void imprimir(){
        System.out.println("Nome = " + nome);
        System.out.println("Cargo = " + cargo);
        System.out.printf("Salario = R$: %.2f\n", salario);
        if(porcentagemAumento != 0 || porcentagemAumento < 0){
            System.out.printf("Salario com aumento: R$ %.2f\n", aumento());
        }
    }

    private double aumento(){
        double aumentoSalario = salario * ((porcentagemAumento / 100) + 1);
        return aumentoSalario;
    }
}