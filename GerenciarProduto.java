import java.util.ArrayList;
public class GerenciarProduto{
  
  ArrayList<Produto> produtos = new ArrayList();

  public void adicionar(Produto p){
    produtos.add(p);
  }

  public boolean remover(int codigo){
    for (Produto cadaProduto : produtos){
        if (cadaProduto.getCodigo() == codigo){
              produtos.remove(cadaProduto);
              return true;
        }
    }
    return false;
  }

  public Produto buscarPorCodigo(int codigo){
    for (Produto cadaProduto : produtos){
        if (cadaProduto.getCodigo() == codigo){   
              return cadaProduto;
        }
    }
    return null;
  }

  public String  listarEletronicos(){
    String teste = "\nProdutos eletronicos : \n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.toString().contains("Eletronico")){   
              teste += "\n";              
              teste += cadaProduto.toString();
        }
    }
    return teste;
  }
  public String  listarPereciveis(){
    String teste = "\nProdutos pereciveis : \n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.toString().contains("Perecivel")){   
              teste += "\n";
              teste += cadaProduto.toString();
        }
    }
    return teste;
  }
  public String  listarMoveis(){
    String teste = "\nProdutos móveis : \n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.toString().contains("movel")){   
              teste += "\n";
              teste += cadaProduto.toString();
        }
    }
    return teste;
  }

  public String listarEstoqueMenorQue(int quantidadeMinima){
    String estoque = "\nProdutos que possuem estoque menor que" + quantidadeMinima + ":\n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.getEstoque() < quantidadeMinima){   
              estoque += cadaProduto.toString();
        }
    }
    return estoque;
  }

  public String listarEstoqueVazio(){
    String estoquevazio = "\nProdutos com estoque vazio: \n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.getEstoque() < 1){   
              estoquevazio += cadaProduto.toString();
        }
    }
    return estoquevazio;
  }

  public String listarPorFabricante(String fabricante){
    String produtosFabricante = "\nProdutos com estoque vazio: \n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.toString().contains(fabricante)){   
              produtosFabricante += cadaProduto.toString();
        }
    }
    return produtosFabricante;
  }

  public String listarPorValidade(String data){
    String produtosPereciveis = "\nProdutos que vencerão na data de " + data +": \n";
    for (Produto cadaProduto : produtos){
        if (cadaProduto.toString().contains(data)){   
              produtosPereciveis += cadaProduto.toString();
        }
    }
    return produtosPereciveis;
  }

  public double venderProduto(int codigoProduto, int quantidade){
    for (Produto cadaProduto : produtos){
      if (cadaProduto.getCodigo() == codigoProduto){   
        return cadaProduto.vender(quantidade);
      }
    }
    return -1;
  }

  public boolean comprarProduto(int codigoProduto, int quantidade){
    for (Produto cadaProduto : produtos){
      if (cadaProduto.getCodigo() == codigoProduto){   
        cadaProduto.comprar(quantidade);
        return true;
      }
    }
    return false;
  }

  public String listarTudo(){
    String listaProdutos = "\n Todos produtos: \n";
    for (Produto cadaProduto : produtos){
      listaProdutos += cadaProduto;
    }
    return listaProdutos;
  }



}