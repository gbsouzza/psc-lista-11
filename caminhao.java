public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println(this.modelo + " " + this.marca + " está engrenando a próxima marcha e acelerando lentamente.");
    }
}