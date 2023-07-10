    package conversor;

import javax.swing.JOptionPane;

public class Conversor {
    private Double cantidad;
    private String divisa;
    private Double monedaLocal;
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Double getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(Double monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public Conversor() {
        this.monedaLocal = 560.0; // Valor por defecto, en este caso "USD"
    }

     public Double divisasColones(Double cantidad, String divisa) {
        if (divisa.equals("dolares")) {
            cantidad = cantidad * 539.01;
        }else if (divisa.equals("euros")){
            cantidad = cantidad * 590.97;
        }else if (divisa.equals("libras")){
            cantidad = cantidad * 691.71;
        }else if (divisa.equals("won")){
            cantidad = cantidad * 0.42;
        }

        return cantidad;
    }

    public Double ColonesDivisas(Double cantidad, String divisa) {
        if (divisa.equals("dolares")) {
            cantidad = cantidad / 539.01;
        }else if (divisa.equals("euros")){
            cantidad = cantidad / 590.97;
        }else if (divisa.equals("libras")){
            cantidad = cantidad / 691.71;
        }else if (divisa.equals("won")){
            cantidad = cantidad / 0.42;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de moneda no válido", "Error", JOptionPane.ERROR_MESSAGE);
            return 0.0;
        }

        return cantidad;
    }

    public static void main(String[] args) {
    Conversor conversor = new Conversor();



        
        Double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir:"));

        String divisa = JOptionPane.showInputDialog("Ingrese el tipo de moneda (dolares, euros, yen, libras, won):");

        Double resultado = conversor.divisasColones(cantidad, divisa);

        if (resultado != 0.0) {
            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado + " colones");
        }
    }
}