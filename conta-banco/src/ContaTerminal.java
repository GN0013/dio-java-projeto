public class ContaTerminal {
    public static void main(String[] args) {
        // Dados 
        String agencia = "067-8";
        int numero = 1021;
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        // Sysout
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

        // Mensagem
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}