class ContaCorrente {
    private float saldo;
    private float limite;
    private float valorLimite;
    
    public ContaCorrente(float limite, float valorLimite) {
        this.saldo = 0.00f;
        this.limite = limite;
        this.valorLimite = valorLimite;
    }

    public void sacar(float saque) {
        if (saque < 0) {
            throw new IllegalArgumentException("Valor de saque negativo");
        }
        
        if (saque > (this.saldo + this.limite)) {
            throw new IllegalArgumentException("Valor de saque maior que o saldo em conta");
        }
    this.saldo -= saque;
    }

    public void depositar(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito negativo");
        }

        this.saldo += valor;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public float getLimite() {
        return this.limite;
    }

    public void setValorLimite(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não é possível definir um valor de limite negativo.");
        }
        this.valorLimite = valor;
    }
}


public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(200, 260);
        try {
            conta.sacar(100);
            conta.depositar(-800);
            System.out.print(conta.getSaldo());
        } catch(IllegalArgumentException err) {
            System.out.println(err);
        }
    }
}