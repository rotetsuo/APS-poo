import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Main {
  public static void main(String[] args) {
    
    Produto pd1 = new Eletronico(002, "celular", "samsung", 15, 250.00, "110", 150, "a");
    Produto pd2 = new Perecivel(450, "banana", "fazenda circular", 1250, 5.00, "25/04/2010", false);
    Produto pd3 = new Movel(250, "sofa", "casas bahia", 5000, 2300, "Algodão");
    Produto pd4 = new Eletronico(456, "tablet", "apple", 15, 250.00, "110", 150, "a");
    GerenciarProduto gerenciador = new GerenciarProduto();
    gerenciador.adicionar(pd1);
    gerenciador.adicionar(pd2);
    gerenciador.adicionar(pd3);
    gerenciador.adicionar(pd4);
   System.out.println(gerenciador.listarTudo());
/*
  System.out.println(celular.getEstoque());
   celular.vender(10);
   System.out.println(celular.toString());
*/
  }
}