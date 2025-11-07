public class SistemaVeiculos {

    public static void main(String[] args) {

        Veiculo carro = new Carro("Toyota", "Corolla", 2023);
        Veiculo moto = new Moto("Honda", "CBR 600", 2024);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 2020);

        System.out.println("--- Teste Carro ---");
        carro.exibirDetalhes();
        carro.acelerar();
        System.out.println("-------------------");

        System.out.println("--- Teste Moto ---");
        moto.exibirDetalhes();
        moto.acelerar();
        System.out.println("------------------");

        System.out.println("--- Teste Caminhão ---");
        caminhao.exibirDetalhes();
        caminhao.acelerar();
        System.out.println("----------------------");
    }
}