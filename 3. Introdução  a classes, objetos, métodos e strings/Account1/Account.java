package Account1;

public class Account
{
    private String name; // variável de instância

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