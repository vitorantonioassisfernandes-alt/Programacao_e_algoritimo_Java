import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> ListaDeCompra = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        int opcaoLista = 0;
        int opcao = 0;
        String novoItem = "";

        do {
            try {
                System.out.println("""
                \n|Bem vindos ao programa lista de compras|
                Escolha a opçao desejada:
                1 - Criar uma nova Lista de compras
                2 - Sair
                """);
                opcaoLista = entrada.nextInt();
                entrada.nextLine();

                switch (opcaoLista) {
                    case 1 -> {
                        System.out.println("Lista criada com sucesso");
                        do {
                            System.out.println("""
                            \nEscolha a opção desejada:
                            1 - Adicionar um item a lista
                            2 - Ver a sua lista
                            3 - Sair
                            """);
                            opcao = entrada.nextInt();
                            entrada.nextLine();

                            switch (opcao) {
                                case 1 -> {
                                    System.out.println("Você escolheu criar um item da lista \n");
                                    System.out.print("Digite o nome do produto: ");
                                    novoItem = entrada.nextLine();
                                    ListaDeCompra.add(novoItem);
                                }
                                case 2 -> {
                                    System.out.println("\nSeus itens na lista:");
                                    for (String item : ListaDeCompra) {
                                        System.out.println("- " + item);
                                    }
                                }
                                case 3 -> System.out.println("Saindo");
                                default -> System.out.println("Opção inválida");
                            }
                        } while (opcao != 3);
                    }
                    case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                    default -> System.out.println("Opção inválida");
                }
            } catch (Exception Erro) {
                System.out.println("Erro, entrada inválida. Tente novamente.");
                entrada.nextLine(); 
                opcaoLista = 0;
            }
        } while (opcaoLista != 2);

        entrada.close();
    }
}

