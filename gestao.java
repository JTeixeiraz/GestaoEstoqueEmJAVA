import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class gestao {
    public static void main(String[] args) throws IOException{
    
    }
}

class estoque{
    Produto produto = new Produto();
    List<Produto> pessoas = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    void adicionarLista() throws IOException{
        System.out.println("Digite seu nome");
        String nome = reader.readLine();
        System.out.println("O seu nome é: "+nome);
        //apenas testando o metodo de input, mais tarde irei fazer tudo funcionar corretamente
    }
}

class Produto {
    private String _nome;
    private Double _preco;
    private int _quantEstoque;
    private String _descricao;

    public Produto(){
        this._nome = get_nome();
        this._preco = get_preco();
        this._quantEstoque = get_quant();
        this._descricao = get_desc();
    }

    public String get_nome() {
        return _nome;
    }
    public void set_nome(String nome) {
        this._nome = nome;
    }

    public Double get_preco(){
        return _preco;
    }
    public void set_preco(Double preco){
        this._preco = preco;
    }

    public int get_quant(){
        return _quantEstoque;
    }
    public void set_quant(int quant){
        this._quantEstoque = quant;
    }

    public String get_desc(){
        return _descricao;
    }
    public void set_desc(String desc){
        this._descricao = desc;
    }
}