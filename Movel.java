public class Movel extends Produto{
  public String tipoMaterial;

  public Movel(int codigo, String nome, String fabricante, int quantidade, double valor, String tipoMaterial){
    super(codigo, nome, fabricante, quantidade, valor);
    this.tipoMaterial = tipoMaterial;
    
  }

  @Override
  public String toString () {
    return "Produto movel \ncodigo = " + codigo  + "\nNome = " + nome + "\nFabricante = " + fabricante + "\nEstoque= " + estoque + "\nValor Unitario = "+ valor +"\nTipo de material = " + tipoMaterial;
  }

}