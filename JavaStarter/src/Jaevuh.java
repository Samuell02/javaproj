import java.math.MathContext;

class Main2 {
    public  static void  main(String[] args) {


        System.out.println("Vejamos um produto sendo adicionado");

        Produto produto1 = new Produto();

        void adicionarProduto(Produto produto){

            System.out.println("Adicionou produto " + produto1.nome);
            Produto produto2 = new Produto();
            produto1.nome = "Carne Bovina";
            Produto produto3 = new Produto();
            produto1.nome = "Tomate Enlatado";

            System.out.println("Agora removemos um produto");
            void removerProduto (Produto produto);
            System.out.println(produto1.nome + "removido");


            System.out.println("Vamos listar os produtos");
            void listarProdutos (Produto produto);
            System.out.println("Agora eles serao vendidos");
            void venderProduto(Produto produto);
            System.out.println("Hora de re-estocar");
            void adicionarEstoque(Produto produto, int quantidade);


        }


    }
}

  class Produto {
    String nome;
    double preco;
    int quantidade;

    public String getnome(){
        return nome;

    }

     public void setNome(String novonome) {
         this.nome = novonome;
     }

     public double getpreco(){
         return preco;

     }

     public void setpreco(double novopreco) {
         this.preco = novopreco;
     }

     public int getquantidade(){
         return quantidade;

     }

     public void setquantidade(int novoquantidade) {
         this.quantidade = novoquantidade;
     }
 }

 class Loja{
    Produto produto1 = new Produto();
     Produto produto2 = new Produto();
     Produto produto3 = new Produto();

      void adicionarProduto(Produto novoproduto){
         if(produto1==null){
             produto1 = novoproduto;
             produto1.nome ="leite";
         }
          if(produto2==null){
              produto2 = novoproduto;
          }
          if(produto3==null){
              produto3 = novoproduto;
          }
     }

     void removerProduto(Produto produto){
         if(produto1 != null) {
             produto1 = null;
         }
         if(produto2!=null){
             produto2 = null;
         }
         if(produto3!=null){
             produto3 = null;
         }
     }

     void listarProdutos(Produto produto){
         System.out.println(produto1);
         System.out.println(produto2);
         System.out.println(produto3);}

     void venderProduto(Produto produto){
         if (produto1.quantidade>=1){
             System.out.println(produto1.nome + "vendido com sucesso");

         }
         else {
             System.out.println(produto1.nome+ "fora de estoque");

         }

         if (produto2.quantidade>=1){
             System.out.println(produto2.nome + "vendido com sucesso");

         }
         else {
             System.out.println(produto2.nome+ "fora de estoque");

         }

         if (produto3.quantidade>=1){
             System.out.println(produto3.nome + "vendido com sucesso");

         }
         else {
             System.out.println(produto3.nome+ "fora de estoque");

         }
         System.out.println("Valor Total:"+ produto1.preco+produto2.preco+ produto3.preco);



     }

     void adicionarEstoque(Produto produto, int quantidade){
          if (produto1.quantidade == 0){
              produto1.quantidade++;

          }
              if (produto2.quantidade == 0){
                 produto2.quantidade++;

             }
                 if (produto3.quantidade == 0){
                     produto3.quantidade++;

                 }

     }
 }