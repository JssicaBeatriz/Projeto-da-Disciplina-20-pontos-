public class BancoTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", 5000.00);
        ContaBancaria conta2 = new ContaBancaria("Maria", 3000.00);

        conta1.depositar(1500.00);
        conta2.sacar(1000.00);
        conta1.transferir(conta2, 2000.00);

        System.out.println("Saldo João: R$ " + conta1.getSaldo());
        System.out.println("Saldo Maria: R$ " + conta2.getSaldo());
    }
}
