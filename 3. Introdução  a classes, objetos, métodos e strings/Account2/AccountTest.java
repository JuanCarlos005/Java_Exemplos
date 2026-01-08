package Account2;

// Usando o construtor de Account para inicializar a instância name
// váriavel no momento em que cada objeto Account é criado
public class AccountTest
{
    public static void main(String[] args)
    {
        // cria dois objetos Account
        Account account1 = new Account("Juan");
        Account account2 = new Account("Kessya");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account1 name is: %s%n", account2.getName());

    }
} // fim da classe AccountTest