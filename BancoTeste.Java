import banco.Cadastro;
import banco.Cliente;
import banco.ContaCorrente;
import java.util.Scanner;


public class bancoTeste {

  public static void main(String[] args) {
  
  
  Cadastro user=new Cadastro();
  Scanner teclado=new Scanner(System.in);

System.out.print("Digite seu primeiro nome:");
user.primeiroNome=teclado.next();

System.out.print("Digite seu segundo nome:");
user.segundoNome=teclado.next();

System.out.print("Digite sua idade");
user.idade=teclado.nextInt();

System.out.print("Digite seu CPF");
user.cpf=teclado.nextInt();

if(user.idade<16){
  System.out.printf("Olá %s!\nInfelizmente não podemos seguir em frente com o seu cadastro,pois você não é maior que 16 anos",user.primeiroNome);
}else{
  System.out.println("Cadastro concluido com sucesso");
  
}
//ATRIBUINDO OS DADOS DOS CLIENTES

Cliente c=new Cliente();
c.pNome=user.primeiroNome;
c.cpf=user.cpf;

System.out.println(c.cpf);


ContaCorrente cc=new ContaCorrente();
System.out.println("Digite seu primeiro nome");
cc.primeiroNome=teclado.next();
System.out.println("Digite seu segundo nome");
cc.segundoNome=teclado.next();

if(cc.primeiroNome != user.primeiroNome || cc.segundoNome != user.segundoNome);{
  System.out.println("Dados não cadastrados");
}


   
   
   
   
   
  }
}
 
