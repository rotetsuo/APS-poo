public abstract class Produto{
  public int codigo;
  public String nome;
  public String fabricante;
  public int estoque;
  public double valor;

  public Produto(int codigo, String nome, String fabricante, int quantidade, double valor){
    this.codigo = codigo;
    this.nome = nome;
    this.fabricante = fabricante;
    this.estoque = quantidade;
    this.valor = valor;
  }

  public double vender(int quantidade){
    if(this.estoque > quantidade){
      this.estoque -= quantidade;
      return this.valor * quantidade;
    }else{
      return -1;
    }
  }
  public void comprar(int quantidade){
    this.estoque += quantidade;
  }
  public String toString () {
    return "Produto \ncodigo = " + codigo  + "\nNome = " + nome + "\nFabricante = " + fabricante + "\nEstoque= " + estoque + "\nValor Unitario = "+ valor;
  }
  public int getCodigo(){
    return this.codigo;
  }
  public String getNome(){
    return this.nome;
  }
  public String getFabricante(){
    return this.fabricante;
  }
  public int getEstoque(){
    return this.estoque;
  }
  public double getValor(){
    return this.valor;
  }
  

}