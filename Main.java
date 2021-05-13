import java.util.Scanner;

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
    
    System.out.println("|------------------------------|");
    System.out.println("|--Gerenciamento de produtos---|");
    Scanner entrada = new Scanner ( System.in);
    Scanner entradaTexto = new Scanner ( System.in);
    int texto = 0;
    while(texto != -1){
      System.out.println("Menu");
      System.out.println("Digite um dos números abaixo para fazer alguma ação:");
      System.out.println("1 - Adicionar Produto");
      System.out.println("2 - Remover Produto");
      System.out.println("3 - Buscar Produto por Código");
      System.out.println("4 - Listar Todos Produtos Eletronicos");
      System.out.println("5 - Listar Todos Produtos Pereciveis");
      System.out.println("6 - Listar Produtos Móveis");
      System.out.println("7 - Listar Produtos que possuem um estoque menor que...");
      System.out.println("8 - Listar Produtos com estoque vazio");
      System.out.println("9 - Listar Produtos por Fabricante");
      System.out.println("10 - Listar Produtos por Validade");
      System.out.println("11 - Vender Produto");
      System.out.println("12 - Comprar Produto");
      System.out.println("13 - Listar Todos os Produtos");
      System.out.println("-1 - Encerrar Programa");
      texto = entrada.nextInt();
      switch(texto) {
        case 1:
          String nomeProduto;
          System.out.println("Digite o nome do produto que deseja adicionar");
          break;
        case 2:
          // code block
          int codigoRemover;
          System.out.println("Digite o código do produto que deseja remover:");
          codigoRemover = entrada.nextInt();
          System.out.print(gerenciador.remover(codigoRemover));
          break;
        case 3:
          int codigoProduto;
          System.out.println("Digite o código do Produto para buscar");
          codigoProduto = entrada.nextInt();
          System.out.println(gerenciador.buscarPorCodigo(codigoProduto));
          break;
        case 4:
          System.out.println(gerenciador.listarEletronicos());
          break;
        case 5:
          System.out.println(gerenciador.listarPereciveis());          
          break;
        case 6:
          System.out.println(gerenciador.listarMoveis());  
          break;
        case 7:
          int quantidadeMinima;
          System.out.println("Digite o valor do estoque que deseja procurar");
          quantidadeMinima = entrada.nextInt();
          System.out.println(gerenciador.listarEstoqueMenorQue(quantidadeMinima));
          break;
        case 8:
          System.out.println(gerenciador.listarEstoqueVazio());
          break;
        case 9:
          String fabricante;
          System.out.println("Digite o fabricante:");
          fabricante = entradaTexto.nextLine();
          System.out.println(gerenciador.listarPorFabricante(fabricante));
          break;
        case 10:
          String dataValidade;
          System.out.println("Digite a data de validade: ");
          dataValidade = entradaTexto.nextLine();
          System.out.println(gerenciador.listarPorValidade(dataValidade));
          break;
        case 11:
          int codigoDoProduto, quantidade;  
          System.out.println("Digite o código do produto que deseja vender: ");
          codigoDoProduto = entrada.nextInt();
          System.out.println("Digite a quantidade que deseja vender: ");
          quantidade = entrada.nextInt();
          System.out.println(gerenciador.venderProduto(codigoDoProduto, quantidade));
          break;
        case 12:
          int produtoCompra, quantidadeCompra;  
          System.out.println("Digite o código do produto que deseja comprar: ");
          produtoCompra = entrada.nextInt();
          System.out.println("Digite a quantidade que deseja vender: ");
          quantidadeCompra = entrada.nextInt();
          System.out.println(gerenciador.comprarProduto(produtoCompra, quantidadeCompra));
          break;
        case 13:
          System.out.println(gerenciador.listarTudo());
          break;
        default:
          break;
      }
    }
  }
}