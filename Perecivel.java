
public class Perecivel extends Produto{
    public String validade;
    public boolean refrigerado;
  
    public Perecivel(int codigo, String nome, String fabricante, int quantidade, double valor, String validade, boolean refrigerado){
      super(codigo, nome, fabricante, quantidade, valor);
      
      this.validade = validade;
      this.refrigerado = refrigerado;
    }
    @Override
    public String toString () {
      return "Produto Perecivel \ncodigo = " + codigo  + "\nNome = " + nome + "\nFabricante = " + fabricante + "\nEstoque= " + estoque + "\nValor Unitario = "+ valor +"\nvalidade = " + validade +"\nrefrigerado = " + refrigerado;
    }
  }