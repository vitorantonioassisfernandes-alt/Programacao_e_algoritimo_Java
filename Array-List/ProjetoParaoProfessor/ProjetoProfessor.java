import java.util.Scanner;

import java.util.ArrayList;
public class ProjetoProfessor{
    public static void main(String[]args)throws Exception{
      
        

         ArrayList<String> MinhaLista = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        int CriarLista =0;
        boolean ListaCriada = false;
        
        

        do{
             try{
            
        System.out.println("Bem vindo a loja do vitor");
        System.out.println("""

                   | 1- Criar Lista|
                   | 2- Ver Lista  |
                   | 3- Sair       |

                """);
            
            CriarLista = entrada.nextInt();
            entrada.nextLine();

            switch(CriarLista){
                case 1 ->{System.out.println("|sua Lista foi criada|");
                            System.out.println("                     ");
                    ListaCriada = true;
                }

                case 2 ->{
                    //nao consegui entender direito essa coisa de nao logica(pesquisar dps)
                    if(!ListaCriada){
                        System.out.println("|Crie a sua lista primeiro|");
                    }
                }

                case 3 ->{System.out.println("|Obrigado por usar o nosso sistema|");
                    return;
                }
                
            }
            //nao mexer, nao sei pq funciona(pesquisar depois)
            }catch(Exception Erro){
            System.out.println("Erro tentar novamente");
            entrada.nextLine();
            CriarLista = 0;
           }
        }while(CriarLista !=1);
           
            
           


          int Lista = 0;
            //colocar doWhile aqui
            do {
                try {
                    //colocar trycatch aqui
                    System.out.println("""
                                    1- Adicionar item na lista
                                    2- ver lista
                                    3- Remover item da Lista
                                    4- Sair
                                    

                            """);

                    Lista = entrada.nextInt();
                    entrada.nextLine();

                    switch (Lista) {
                        case 1 -> {
                            String AdicionarItem = "";
                            System.out.println("Item desejado:");
                            System.out.println("digite o item");
                            AdicionarItem = entrada.nextLine();
                            MinhaLista.add(AdicionarItem);
                        }

                        case 2 -> {
                            if (MinhaLista.isEmpty()) {
                                System.out.println("A lista está vazia!");
                            } else {
                                System.out.println("|Itens da Lista|");
                                for (int i = 0; i < MinhaLista.size(); i++) {
                                    System.out.println((i + 1) + " - " + MinhaLista.get(i));
                                }
                                System.out.println("");
                            }
                        }

                        case 3 -> {
                            if (MinhaLista.isEmpty()) {
                                System.out.println("A lista está vazia, nada para remover!");
                            } else {
                                System.out.println("Itens da Lista ");
                                for (int i = 0; i < MinhaLista.size(); i++) {
                                    System.out.println((i + 1) + " - " + MinhaLista.get(i));
                                }
                                System.out.println("");
                                System.out.println("Digite o número do item para remover:");
                                int numRemover = entrada.nextInt();
                                entrada.nextLine();
                                if (numRemover >= 1 && numRemover <= MinhaLista.size()) {
                                    String itemRemovido = MinhaLista.remove(numRemover - 1);
                                    System.out.println("Item  " + itemRemovido +" removido com sucesso!");
                                } else {
                                    System.out.println("Número inválido, tente novamente.");
                                }
                            }
                        }

                        case 4 -> {
                            System.out.println("obrigado por usar a nossa loja");
                        }
                    }

                } catch (Exception Erro2) {
                    System.out.println("Erro tentar novamente");
                    entrada.nextLine();
                    Lista = 0;
                }
            } while (Lista != 4);
                            
                    entrada.close();
    }
}        
        
        
    

    

