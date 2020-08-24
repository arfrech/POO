import javax.swing.JOptionPane;
public class FolhaDePgto{
    public static void main (String args[]){

        Empregado empregado1 = new Empregado();

        JOptionPane.showMessageDialog(null, "Bem vindo(a) ao sistem de Folha de Pagamentos");
        empregado1.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario"));
        empregado1.setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionario:"));
        empregado1.setSalario(JOptionPane.showInputDialog("Digite o salario do funcionario, em R$:"));
        empregado1.setPorcentagemAumento(JOptionPane.showInputDialog("Digite a porcentagem de aumento:"));

        JOptionPane.showMessageDialog(null, empregado1.imprimir());

    }
}