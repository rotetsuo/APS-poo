public class Eletronico extends Produto{
  public String voltagem;
  public float potencia;
  public String eficiencia;

  public Eletronico(int codigo, String nome, String fabricante, int quantidade, double valor, String voltagem, float potencia, String eficiencia){
    super(codigo, nome, fabricante, quantidade, valor);
    this.voltagem = voltagem;
    this.potencia = potencia;
    this.eficiencia = eficiencia;
  }

  @Override
  public String toString () {
    return "Produto Eletronico \ncodigo = " + codigo  + "\nNome = " + nome + "\nFabricante = " + fabricante + "\nEstoque= " + estoque + "\nValor Unitario = "+ valor +"\nvoltagem = " + voltagem +"\npotencia = " + potencia + "\neficiencia = " + eficiencia;
  }

}