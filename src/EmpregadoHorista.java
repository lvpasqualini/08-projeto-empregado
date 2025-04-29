import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado {
    private int totalDeHorasTrabalhadas;
    private double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    @Override
    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de horas trabalhadas: " + totalDeHorasTrabalhadas + "\n";
        aux += "Valor da hora trabalhada: " + df.format(valorDaHoraTrabalhada)+"\n";
        return aux;
    }

    @Override
    public double calcularSalario () {
       return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }
}
