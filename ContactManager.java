
class GerenciadorContatos {

    static java.util.List<Contato> contatos = new java.util.ArrayList<>();

    static java.util.Scanner scanner = new java.util.Scanner(System.in);

    static void adicionarContato() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String numeroTelefone = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        contatos.add(new Contato(nome, numeroTelefone, email));
        System.out.println("Contato adicionado!");
    }

    static void buscarContato() {
        System.out.print("Digite o nome ou telefone para buscar: ");
        String termoBusca = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.nome.equalsIgnoreCase(termoBusca) || contato.numeroTelefone.equals(termoBusca)) {
                System.out.println("Contato encontrado:\n" + contato);
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    static void removerContato() {
        System.out.print("Digite o nome ou telefone do contato para remover: ");
        String termoRemocao = scanner.nextLine();
        contatos.removeIf(contato -> contato.nome.equalsIgnoreCase(termoRemocao) || contato.numeroTelefone.equals(termoRemocao));
        System.out.println("Contato removido (se encontrado).");
    }

    static void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia.");
            return;
        }
        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Gerenciador de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    adicionarContato();
                    break;
                case "2":
                    buscarContato();
                    break;
                case "3":
                    removerContato();
                    break;
                case "4":
                    listarContatos();
                    break;
                case "5":
                    System.out.println("Saindo do gerenciador de contatos.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
