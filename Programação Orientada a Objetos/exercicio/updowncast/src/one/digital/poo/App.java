package one.digital.poo;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();   Forma errada de Downcast
        Vendedor vendedor1 = (Vendedor) new Funcionario();  // Forma correta
    }
}
