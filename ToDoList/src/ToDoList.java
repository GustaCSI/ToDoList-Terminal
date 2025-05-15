import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Tarefa> tarefas = new ArrayList<>();
       int opcao;

       do {
           System.out.println("\n=== TO-DO LIST ===");
           System.out.println("1 - Adicionar tarefa");
           System.out.println("2 - Listar tarefas");
           System.out.println("3 - Marcar tarefa como concluída");
           System.out.println("0 - Sair");
           System.out.print("Escolha uma opção: ");
           opcao = scanner.nextInt();
           scanner.nextLine(); // Limpar buffer

           switch (opcao) {
               case 1:
                   System.out.println("Digite a descrição da tarefa: ");
                   String desc = scanner.nextLine();
                   tarefas.add(new Tarefa(desc));
                   break;

                   case 2:
                       System.out.println("\n=== TAREFAS ===");
                       for (int i = 0; i < tarefas.size(); i++) {
                           System.out.println(i + " - " + tarefas.get(i));
                       }
                       break;
               case 3:
                   System.out.print("Digite o número da tarefa para marcar como concluída: ");
                   int index = scanner.nextInt();
                   if (index >= 0 && index < tarefas.size()) {
                       tarefas.get(index).marcarConcluida();
                       System.out.println("Tarefa concluída!");
                   } else {
                       System.out.println("Número inválido.");
                   }
                   break;
               case 0:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida.");
           }
       } while (opcao != 0);

        scanner.close();
           }
       }

