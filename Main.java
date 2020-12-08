
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Main
{   
    public static int opcao;
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]){
    
    Filme[]filmes = new Filme[10];
    filmes [0] = new Filme(1398, "Pulp Fiction", 1994, "Crime", "Quentin Tarantino", 154);
    filmes [1] = new Filme(1764, "Inception", 2010, "Ação", "Christopher Nolan", 133);
    filmes [2] = new Filme(1348, "Donnie Darko", 2001, "Ficção científica", "Richard Kelly", 108);
    filmes [3] = new Filme(1212, "Efeito Borboleta", 2004, "Ficção científica", "Eric Bress", 113);
    filmes [4] = new Filme(1019, "Super 8", 2011, "Ficção científica", "J. J. Abrams", 114);
    filmes [5] = new Filme(1541, "Os Oito Odiados", 2015, "Faroeste", "Quentin Tarantino", 187);
    filmes [6] = new Filme(1822, "O Profissional", 1994, "Ação", "Luc Besson", 100);
    filmes [7] = new Filme(1723, "Réquiem para um Sonho", 2000, "Drama", "Darren Aronofsky", 110);
    filmes [8] = new Filme(1648, "Brilho Eterno de uma Mente sem Lembranças", 2004, "Romance", "Michel Gondry", 108);
    filmes [9] = new Filme(1649, "O Auto da Compadecida", 2000, "Comédia", "Guel Arraes", 104);
    
    while (opcao == 0){
    System.out.println("Bem vindo ao Filmesflix!");
    System.out.println("1. Lista de filme por gênero.\n2. Procurar um filme por nome.\n3. Filmes por ano de lançamento.\n4. Assistir um filme.\n5. Mostrar todos os filmes.\n\nSelecione a opção desejada: ");
    opcao = Integer.parseInt(in.nextLine());
    
        switch(opcao){
            case 1: printaFilmesGenero(filmes);
            break;
            
            case 2: printaFilmeNome(filmes);
            break;
            
            case 3: printaFilmeAno(filmes);
            break;
            
            case 4: assisteFilme(filmes);
            break;
            
            case 5: printaTodosFilmes(filmes);
            break;
        }
    }
    
    }
    
    public static void printaTodosFilmes(Filme[]filme){
        System.out.println("Todos os filmes:\n");
            for(int i=0;i<filme.length;i++){
                System.out.println(filme[i]);
            }
            
        System.out.println("\nRetorne ao menu digitando 0: ");
        opcao = Integer.parseInt(in.nextLine());
    }
    
    public static void printaFilmesGenero(Filme[]filme){
        int num = 1;
        String print= "";
        for(int i=0;i<filme.length;i++){
                if(!print.contains(filme[i].getGenero())){
                print =print + num+". "+filme[i].getGenero()+"\n";
                num++;
            }
            }
            
        System.out.println(print+"");
        System.out.println ("Escolha um genero de filme desejado: ");
        num = Integer.parseInt(in.nextLine());
        
        int num2 = 1;
        String generos = "";
        String generoEscolhido = "";
        
        for(int i=0;i<filme.length;i++){
            if(num==num2)  generoEscolhido = filme[i].getGenero();
                if(!generos.contains(filme[i].getGenero())){
                generos = generos +", "+filme[i].getGenero();
                num2++;
            }
            }
            
        for(int i=0;i<filme.length;i++){
            if(filme[i].getGenero().contains(generoEscolhido)) System.out.println(filme[i]);
            }
            
            System.out.println("\nRetorne ao menu digitando 0: ");
            opcao = Integer.parseInt(in.nextLine());
        
    }
    
    public static void printaFilmeNome(Filme[]filme){
        printaTodosFilmes(filme);
        System.out.println("Pesquise seu filme: ");
        String nome = "";
        nome = in.nextLine();
        for(int i=0;i<filme.length;i++){
            if(filme[i].getNome().toLowerCase().contains(nome.toLowerCase())){
                System.out.println(filme[i]);
            }
            }
        System.out.println("\nRetorne ao menu digitando 0: ");
        opcao = Integer.parseInt(in.nextLine());
    }
    
    public static void printaFilmeAno(Filme[]filme){
        System.out.println("Digite o ano do filme: ");
        int ano = Integer.parseInt(in.nextLine());
        for(int i=0;i<filme.length;i++){
            if(filme[i].getAno()==ano){
                System.out.println(filme[i]);
            }
            }
        System.out.println("\nRetorne ao menu digitando 0: ");
        opcao = Integer.parseInt(in.nextLine());
    }
    
    public static void assisteFilme(Filme[]filme){
        System.out.println("Digite o código do filme que irá assistir: ");
        int codigo = Integer.parseInt(in.nextLine());
        double valor = 0;
        for(int i=0;i<filme.length;i++){
            if(filme[i].getCodigo()==codigo){
                valor = filme[i].getMinuto()*0.07;
                System.out.printf("\nVocê escolheu assistir o filme:\n" + filme[i]+"\nFilme com duração de "+filme[i].getMinuto()+" minutos, portanto custará R$ %.2f reais.", valor);
            }
            }
        System.out.println("\nRetorne ao menu digitando 0: ");
        opcao = Integer.parseInt(in.nextLine());
    }
     
}
