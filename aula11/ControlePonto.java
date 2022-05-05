package aula11;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ControlePonto {
    
    public void RegistraEntrada(Funcionario f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date(System.currentTimeMillis());
        System.out.println("ENTRADA: " + f.getMatricula() + " - " + f.getNome());
        System.out.println("DATA: " + sdf.format(data));
    }

    public void RegistraSaida(Funcionario f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date(System.currentTimeMillis());
        System.out.println("SAIDA " + f.getMatricula() + " - " + f.getNome());
        System.out.println("DATA: " + sdf.format(data));
    }

}
