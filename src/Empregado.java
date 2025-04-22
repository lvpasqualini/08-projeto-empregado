public abstract class Empregado {
    private long matricula;
    private String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getDados () {
        String aux = "";
        aux += "Matricula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public abstract double calcularSalario ();
}