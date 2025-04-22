public class Controle {
    private Empregado[] empregados = new Empregado[5];
    private int index = 0;

    public void inserir (Empregado empregado) {
        this.empregados[index++] = empregado;
    }

    public Empregado pesquisar (long matricula) {
        for (int i = 0; i < index; i++) {
            if(empregados[i].getMatricula() == matricula) {
                return empregados[i];
            }
        }
        return null;
    }

    public String listar () {
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += empregados[i].getDados() + "\n";
        }
        return aux;
    }
}