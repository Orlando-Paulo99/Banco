import java.util.Random;

public class Cliente extends   BancoModelo{

//Atributos
public String pNome;
public String sNome;
public int cpf;
 String endereco;
public int telefone;
public int agencia;



//GERADOR DE NUMERO DE CONTA
 void geradorConta(){
  Random gerador=new Random();
  int numConta=gerador.nextInt(10000);
  System.out.println("Conta: "+numConta);
}


}
