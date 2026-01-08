package Account2;

public class Account
{
    private String name; // variável de instância

    // o construtor inicializa name com nome do parâmetro
    public Account(String name) // o nome do construtor é nome da classe
    {
        this.name = name;
    }

    // método para definir o nome no objeto
    public void setName(String name) // Esta linha é o cabeçalho do método
    {
        this.name = name; // armazena o nome
    }

    // método para recuperar o nome do objeto
    public String getName()
    {
        return name; // retorna valor do nome para o chamador
    } 
} // fim da classe Account