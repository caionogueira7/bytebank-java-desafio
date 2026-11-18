public class Conta {
    private int saldo;

    public Conta(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(int valor) {
        validarValor(valor);
        saldo += valor;
    }

    public void sacar(int valor) {
        validarValor(valor);

        if (valor > saldo) {
            throw new IllegalArgumentException("Erro: saldo insuficiente");
        }

        saldo -= valor;
    }

    public int getSaldo() {
        return saldo;
    }

    private void validarValor(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor invalido");
        }
    }
}