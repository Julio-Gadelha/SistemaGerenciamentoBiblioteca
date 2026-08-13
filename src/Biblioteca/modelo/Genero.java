package Biblioteca.modelo;

public enum Genero {
    FICCAO(10.00),
    TECNICO(12.00),
    BIOGRAFIA(15.00);

 private  double valorMulta;

    Genero(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }
}
