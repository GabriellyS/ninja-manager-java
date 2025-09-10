package Manager;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcaoMenu = 1;
        Scanner in = new Scanner(System.in);

        // Com API do Java
        LinkedList<Ninja> listaNinjas = new LinkedList<>();

        // Criando 7 ninjas na lista
        listaNinjas.add(new Ninja("Naruto Uzumaki", "Folha", 43));
        listaNinjas.add(new Ninja("Sasuke Uchiha", "Folha", 42));
        listaNinjas.add(new Ninja("Sakura Haruno", "Folha", 41));
        listaNinjas.add(new Ninja("Kakashi Hatake", "Som", 67));
        listaNinjas.add(new Ninja("Boruto Uzumaki", "Som", 23));
        listaNinjas.add(new Ninja("Sarada Uchiha", "Som", 22));
        listaNinjas.add(new Ninja("Konohamaru Sarutobi", "Ar", 78));

        //Ver Menu
        while (opcaoMenu != 6){
            System.out.println("\n------------ Menu ------------\n1 - Listar Ninjas\n2 - Remover Ninja do inicio\n3 - Adicionar Ninja no inicio" +
                    "\n4 - Buscar Ninja\n5 - Ordenar lista\n6 - Sair");
            opcaoMenu = in.nextInt(); in.nextLine();

            switch (opcaoMenu){
                case 1:
                    listarNinjas(listaNinjas);
                    break;
                case 2:
                    listaNinjas.removeFirst();
                    break;
                case 3:
                    System.out.print("Qual o nome do novo ninja? ");
                    String nome = in.nextLine();
                    System.out.print("Qual a idade do novo ninja? ");
                    int idade = in.nextInt();in.nextLine();
                    System.out.print("Qual a aldeia do novo ninja? ");
                    String vila = in.nextLine();

                    Ninja novo = new Ninja(nome,vila,idade);

                    listaNinjas.addFirst(novo);
                    break;
                case 4:
                    System.out.print("\nQual o nome do ninja que quer buscar? ");
                    String busca = in.nextLine();

                    buscarNinjas(listaNinjas,busca);
                    break;
                case 5:
                    System.out.println("\nComo deseja ordenar?\n1 - Nome\n2 - Idade\n3 - Vila");
                    int ordenar = in.nextInt(); in.nextLine();

                    if (ordenar == 1){
                        listaNinjas.sort(Comparator.comparing(Ninja::getNome));
                        System.out.println("\nLista ordenada com sucesso");
                    } else if (ordenar == 2) {
                        listaNinjas.sort(Comparator.comparing(Ninja::getIdade));
                        System.out.println("\nLista ordenada com sucesso");
                    } else if (ordenar == 3) {
                        listaNinjas.sort(Comparator.comparing(Ninja::getVila));
                        System.out.println("\nLista ordenada com sucesso");
                    }else {
                        System.out.println("\nOpçao inválida");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo...\n");
                    break;
                default:
                    System.out.println("\nOpçao inválida");
                    break;
            }
        }
    }

    // Listar os ninjas para evitar repetiçao
    public static void listarNinjas(LinkedList<Ninja> listaNinja){
        System.out.println("\n--------- Listando ---------");
        if (listaNinja.isEmpty()){
            System.out.println("Lista vazia");
        }else {
            for (Ninja n : listaNinja){
                System.out.println(n);
            }
        }
    }

    // Buscar os ninjas para evitar repetiçao
    public static void buscarNinjas(LinkedList<Ninja> linkedList, String nome){
        boolean achou = false;
        for (Ninja n: linkedList){
            if(n.getNome().contains(nome)){
                System.out.println(n);
                achou = true;
            }
        }
        if (!achou){
            System.out.println("\nNinja nao encontrado");
        }
    }
}
