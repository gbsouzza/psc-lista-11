public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(this.modelo + " " + this.marca + " está acelerando e empinando a roda dianteira!");
    }
}