
/**
 * Escreva a descrição da classe FilmeModel aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Filme
{
    private int codigo;
    private String nome;
    private int ano;
    private String genero;
    private String nomeDiretor;
    private int min;
    
    public Filme(int codigoR, String nomeFilme, int anoR, String gen, String nomeD, int minA){
        this.codigo = codigoR;
        this.nome = nomeFilme;
        this.ano = anoR;
        this.genero = gen;
        this.nomeDiretor = nomeD;
        this.min = minA;
    }
    
    public int getMinutos(){
        return min;
    }
    
    public String getGenero(){
        return genero;
    }
    
     public String getNome(){
        return nome;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public int getMinuto(){
        return min;
    }
    
    public String toString(){
        return "Código "+codigo+": "+nome+", "+ano+", "+genero+", "+nomeDiretor+", "+min+" mins.";
    }
}
