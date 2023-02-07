import banco.Cliente;
import banco.ContaCorrente;
import java.util.Scanner;


public class bancoTeste {

  public static void main(String[] args) {
  
  
  Cliente user=new Cliente();
  Scanner teclado=new Scanner(System.in);

  
  System.out.println("Digite seu nome");
  user.nome=teclado.next();
  System.out.printf("Olá,%s.Seja muito bem-vindo",user.nome);
  user.set_digiCpf(122222333);
  System.out.println("\nDados da conta");
  System.out.println("\nCpf: "+user.get_mostrarCpf());
  user.agencia=00-01;
  System.out.println("Agencia: "+user.agencia);
  user.geradorConta();
  user.set_digiTell(992624419);
  System.out.println("Telefone: "+user.get_mostrarTelefone());
  user.set_digiEndereco("Subida Pedro Braz,n°54");
  System.out.println("Endereço: "+user.get_mostrarEndereco());
  
  //CONTA-CORRENTE
  ContaCorrente cr=new ContaCorrente();
  
  System.out.println("Digite sua idade");
  cr.idade=teclado.nextInt();
  cr.Ccredito=0;
  
  
if(cr.idade<=16 || cr.idade>=18){
  System.out.println("Conta aprovada com sucesso");
}if(cr.idade>=18){
  if(cr.Ccredito==0){
    cr.Ccredito=50;
    System.out.println("Foi liberado R$ "+cr.Ccredito+" para você");
   }
}
  
  
   
  
  
  
  
   
  }
}
 
