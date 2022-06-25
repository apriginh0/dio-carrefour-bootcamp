package one.digital.poo;

class Carro {
    String cor;            // São atributos
    String modelo;
    int capacidadeDoTanque;

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;    //método especial - Construtor
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    void setCor(String cor) {
        this.cor = cor;   // método
    }
    String getCor() {
        return cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }
    void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }
    int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }
    double totalValorTanque(double valorCombustivel) {
        return capacidadeDoTanque = valorCombustivel;
    }

    /*

    void finalize() {
                       método especial - Destrutor
    }
     */
}
