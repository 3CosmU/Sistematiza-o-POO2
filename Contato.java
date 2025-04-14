class Contato {
    String nome;
    String numeroTelefone;
    String email;
  
    public Contato(String nome, String numeroTelefone, String email) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + numeroTelefone + ", Email: " + email;
    }
}
