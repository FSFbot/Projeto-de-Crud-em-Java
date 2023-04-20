import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int op;
        ArrayList <String> estoque = new ArrayList<>();
        do {
            System.out.println("""
                    ===================================================
                                    Menu
                                   1- Adicionar um Produto
                                   2- Mostrar o estoque
                                   3- Modificar o item dos estoque
                                   4- Remover produtos dos Estoque
                    """);

            op = reader.nextInt();
            reader.nextLine();

            switch (op){
                case 1:
                    System.out.printf("Escreva que produto vai ser inserido:\n ");
                    String prod = reader.nextLine();

                    estoque.add(prod);
                    break;
                case 2:
                    System.out.println(estoque);
                    break;
                case 3:
                    System.out.println("Por favor escreva o nome de um produto: ");
                    String mudaNome = reader.nextLine();
                    if(estoque.contains(mudaNome)){
                        estoque.remove(mudaNome);
                        estoque.add(mudaNome);
                        System.out.println("Produto Alterado\n");
                    }else {
                        System.out.println("Produto não localizado");
                    }
                    System.out.println("O produto foi editado com sucesso: ");

                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.println("Qual o produto que deseja remover ?");
                    String retirar = reader.nextLine();
                    if(estoque.contains(retirar)){
                        estoque.remove(retirar);
                        System.out.println("Produto foi excluido");
                    }else {
                        System.out.println("Agora a seu estoque ficou assim: ");
                        System.out.println(estoque);
                    }
                    break;
                default:
                    System.out.println("Opção invalida, escolha outra opção");
            }
        }while (op != 0);
    }
}