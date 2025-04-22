import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Util {
    private Controle controle = new Controle();

    public void menu() {
        String menu = "1 - Inserir \n2 -  Pesquisar\n3 - Listar\n 4 - Encerrar";
        int option;
        do {
            option = parseInt(showInputDialog(menu));
            if (option < 1 || option > 3) {
                showMessageDialog(null, "Opção inválida!");
            } else {
                switch (option) {
                    case 1:
                        inserir();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        listar();
                        break;
                }
            }

        } while (option != 4);
    }

    public void inserir() {
        int opcao = parseInt(showInputDialog("1. Empregado Comissionado\n2. Empregado Horista\n3. Sair"));

        while(true) {
            if (opcao == 3){
                return;
            }
            if (opcao == 1 || opcao == 2){
                String nome = showInputDialog("Nome do empregado: ");
                long matricula = parseLong(showInputDialog("Número da matricula: "));
                if(opcao == 1) {
                    double totalDeVendas = parseDouble(showInputDialog("Total de vendas: "));
                    double comissao = parseDouble(showInputDialog("Comissão: "));
                    controle.inserir(new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao));
                    break;
                }else {
                    int totalDeHorasTrabalhadas = parseInt(showInputDialog("Horas trabalhadas: "));
                    double valorDaHoraTrabalhada = parseInt(showInputDialog("Valor da hora: "));
                    controle.inserir(new EmpregadoHorista(matricula, nome, totalDeHorasTrabalhadas, valorDaHoraTrabalhada));
                    break;
                }
            }
        }
    }

    public void pesquisar() {
        long matricula = parseInt(showInputDialog("Matricula para pesquisa: "));
        Empregado empregado = controle.pesquisar(matricula);
        if (empregado == null) {
            showInputDialog(null, "Empregado com matricula " + matricula + " não foi encontrado!");
        }
        showInputDialog(null, empregado.getDados());
    }

    public void listar() {
        showMessageDialog(null , controle.listar());
    }
}
