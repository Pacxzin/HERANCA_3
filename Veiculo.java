// Classe base
class Veiculo {
    private String modelo;
    private int anoFabricacao;
    private String montadora;
    private String cor;
    private double kilometragem;

    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }

    // Getters e Setters
    // ...

    public String gerarInsert() {
        return String.format("INSERT INTO veiculos (modelo, ano_fabricacao, montadora, cor, kilometragem) VALUES ('%s', %d, '%s', '%s', %.2f);",
                             modelo, anoFabricacao, montadora, cor, kilometragem);
    }
}

// Classe Automovel
class Automovel extends Veiculo {
    private int quantidadeMaximaPassageiros;
    private String tipoFreio;
    private boolean airbag;

    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                     int quantidadeMaximaPassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO automoveis (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_maxima_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                             // Chama o método da superclasse
                             super.getModelo(), super.getAnoFabricacao(), super.getMontadora(), super.getCor(),
                             super.getKilometragem(), quantidadeMaximaPassageiros, tipoFreio, airbag);
    }
}

// Classe Motocicleta
class Motocicleta extends Veiculo {
    private int cilindrada;
    private int torque;

    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
                       int cilindrada, int torque) {
        super(modelo, anoFabricacao, montadora, cor, kilometragem);
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO motocicletas (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %d);",
                             super.getModelo(), super.getAnoFabricacao(), super.getMontadora(), super.getCor(),
                             super.getKilometragem(), cilindrada, torque);
    }
}