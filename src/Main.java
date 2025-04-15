import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        //exemplo_01
        Empregado[] empregados = new Empregado[3];
        empregados[0] = new EmpregadoComissionado(1, "Lucas", 1000, 20);
        empregados[1] = new EmpregadoHorista(2, "Toshi", 1000, 10);
        empregados[2] = new EmpregadoComissionado(3, "Pietro", 1000, 30);

        for( Empregado e : empregados ){
            System.out.println(e.getDados());
            System.out.println("Valor do salário: R$" + df.format(e.calcularSalario()) + "\n");
        }
    }
}
