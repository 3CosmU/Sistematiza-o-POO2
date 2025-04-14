class Contato {
    String nome;
    String numeroTelefone;
    String email;

    // Construtor para criar um novo contato
    public Contato(String nome, String numeroTelefone, String email) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    // Método para mostrar as informações do contato como texto
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + numeroTelefone + ", Email: " + email;
    }
}
