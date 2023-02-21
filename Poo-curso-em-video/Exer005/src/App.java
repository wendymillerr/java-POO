import projetolivro.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("wendy", 22, "fem");
        Livro livro = new Livro("Java para iniciantes", "José silva", 150, 50, pessoa);
        System.out.println(livro.detalhes()); 
    }
}
