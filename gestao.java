public class gestao {
    public static void main(String[] args) {

    }
}

class Produto {
    private String _nome;
    private Double _preco;
    private int _quantEstoque;
    private String _descricao;

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