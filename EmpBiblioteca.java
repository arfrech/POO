import javax.swing.JOptionPane;
public class EmpBiblioteca{
    public static void main (String args[]){

        Biblioteca livro1 = new Biblioteca();
        Biblioteca livro2 = new Biblioteca();

        livro1.setTitulo("livro1");
        livro1.setAutor("autor do livro1");
        livro1.setAno(2020);
        livro1.setCategoria("categoria1");
        livro1.setPosicaoEstante("estante1");
        livro1.setPosicaoPrateleira("prateleira1");
        livro1.setDisponivel(true);

        livro2.setTitulo("livro2");
        livro2.setAutor("autor do livro2");
        livro2.setAno(1980);
        livro2.setCategoria("categoria2");
        livro2.setPosicaoEstante("estante2");
        livro2.setPosicaoPrateleira("prateleira2");
        livro1.setDisponivel(false); 

        JOptionPane.showMessageDialog(null, "Bem vindo(a) ao sistema de emprestimos da Biblioteca");
        JOptionPane.showMessageDialog(null, livro1.info());
        JOptionPane.showMessageDialog(null, livro2.info());
    }
}