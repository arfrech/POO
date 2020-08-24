public class Biblioteca{

    private String titulo;
    private String autor;
    private int ano;
    private String categoria;
    private String posicaoEstante;
    private String posicaoPrateleira;
    private boolean disponivel;
    
    public Biblioteca(String newTitulo, String newAutor, int newAno, String newCategoria, String newPosicaoEstante, String newPosicaoPrateleira, boolean newDisponivel){
        titulo = newTitulo;
        autor = newAutor;
        ano = newAno;
        categoria = newCategoria;
        posicaoEstante = newPosicaoEstante;
        posicaoPrateleira = newPosicaoPrateleira;
        disponivel = newDisponivel;
    }

    public void setTitulo(String newTitulo){
        titulo = newTitulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String newAutor){
        autor = newAutor;
    }
    public String getAutor(){
        return autor;
    }

    public void setAno(int newAno){
        ano = newAno;
    }
    public int getAno(){
        return ano;
    }

    public void setCategoria(String newCategoria){
        categoria = newCategoria;
    }
    public String getCategoria(){
        return categoria;
    }

    public void setPosicaoEstante(String newPosicaoEstante){
        posicaoEstante = newPosicaoEstante;
    }
    public String getPosicaoEstante(){
        return posicaoEstante;
    }

    public void setPosicaoPrateleira(String newPosicaoPrateleira){
        posicaoPrateleira = newPosicaoPrateleira;
    }
    public String getPosicaoPrateleira(){
        return posicaoPrateleira;
    }

    public void setDisponivel(boolean newDisponivel){
        disponivel = newDisponivel;
    }
    public boolean isDisponivel(){
        return disponivel;
    }

    public String info(){
        
        System.out.println(titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Publicado em " + ano);
        System.out.println("Categoria " + categoria);
        System.out.println("O livro esta disponivel na estante " + posicaoEstante + " / prateleira " + posicaoPrateleira);
        System.out.println("Disponivel para emprestimo? " + disponivel);
        System.out.println("");
    }
}