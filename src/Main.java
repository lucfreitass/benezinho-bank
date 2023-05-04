import br.com.benezinhobank.model.*;
import br.com.benezinhobank.pessoa.model.PessoaFisica;
import br.com.benezinhobank.pessoa.model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Banco benezinho = new Banco("Benezinho Bank");
        Agencia osasco = new Agencia();
        osasco.setBanco(benezinho);
        osasco.setNome("Osasco");
        osasco.setNumero("1-9");

        PessoaFisica mae = new PessoaFisica();
        mae.setNome("Celi Maria Rinaldi");
        mae.setCPF("076914878-60");
        mae.setNascimento(LocalDate.of(1970,5,13));

        PessoaFisica lucca = new PessoaFisica();
        lucca.setCPF("523008958-51");
        lucca.setNascimento(LocalDate.of(2004,8,19));
        lucca.setNome("Lucca Freitas");
        lucca.setMae(mae);

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(osasco);
        cc.setTitular(lucca);
        cc.setSaldo(1_000_000.99);
        cc.setLimite(5_000_000);
        cc.setNumero("1-9");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("2-8");
        cp.setAniversario(4);
        cp.setAgencia(osasco);
        cp.setSaldo(500_000);
        cp.setTitular(mae);

        PessoaJuridica holding = new PessoaJuridica();
        holding.setCNPJ("123321/0001-09");
        holding.setNascimento(LocalDate.of(1988,10,5));
        holding.setNome("Lucca Holding SA");
        holding.setRazaoSocial("Lucca Best Bank");

        ContaCorrente cch = new ContaCorrente();
        cch.setNumero("1-9");
        cch.setLimite(800_000_000);
        cch.setSaldo(1_000_000_000);
        cch.setTitular(holding);
        cch.setAgencia(osasco);

        System.out.println(cch);

    }
}