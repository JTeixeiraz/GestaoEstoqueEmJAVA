import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class gestao {
    public static void main(String[] args) throws IOException{
        estoque e = new estoque();
        e.adicionarLista();
    }
}

class estoque{
    Produto produto = new Produto();
    Map<String,Object> produtos = new HashMap<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    void adicionarLista() throws IOException{
        System.out.println("Digite o nome do produto:");
        String nome = reader.readLine();
        System.out.println("----------------");
        System.out.println("Digite o preço do produto");
        String preco = reader.readLine();
        double valpreco = Double.parseDouble(preco);
        System.out.println("Digite o seu valor em estoque");
        String qntd = reader.readLine();
        int valQuantidade = Integer.parseInt(qntd);
        produtos.put("nome", new ArrayList<>(Arrays.asList(nome)));
        produtos.put("Preco", new ArrayList<>(Arrays.asList(valpreco)));
        produtos.put("Quantidade", new ArrayList<>(Arrays.asList(valQuantidade)));
        System.out.println("Valores adicionados com sucesso");
        System.out.print(produtos);
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