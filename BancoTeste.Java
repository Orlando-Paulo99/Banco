import banco.Cadastro;
import banco.Cliente;
import banco.ContaCorrente;
import banco.Poupanca;
import java.util.Scanner;


public class bancoTeste {

  public static void main(String[] args) {
  
  //CADASTRO DO CLIENTE
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

System.out.println("Digite seu Telefone");
user.tell=teclado.nextInt();




if(user.idade<16){
  System.out.printf("Olá %s!\nInfelizmente não podemos seguir em frente com o seu cadastro,pois você não é maior que 16 anos",user.primeiroNome);
}else{
  System.out.println("Cadastro concluido com sucesso");
  
}
//ATRIBUINDO OS DADOS DOS CLIENTES
System.out.println("====================================");
Cliente c=new Cliente();
c.pNome=user.primeiroNome;
c.sNome=user.segundoNome;
c.cpf=user.cpf;
c.telefone=user.tell;
System.out.println("Olá "+c.pNome+"! Seja muito bem-vindo\nSegue abaixo seus dados:");
System.out.println("CPF:"+c.cpf);
System.out.println("Telefalone:"+c.telefone);
System.out.println("Agencia:0001");
c.geradorConta();

System.out.println("====================================");
//Conta Corrente
ContaCorrente cc=new ContaCorrente();

cc.Ccredito=50;
System.out.println("olá"+user.primeiroNome+"Deseja solicitar cartão de credito?\nDigite [1] para Sim ou [2] para não");
int pergunta=teclado.nextInt();

if(pergunta==1){
  System.out.println("Digite seu CPF");
  int digCpf=teclado.nextInt();
  if(digCpf != c.cpf){}
    System.out.println("CPF invalido!Volte outra vez");
  }else{
    if(user.idade<18){
      System.out.println("Infelizmente não temos credito disponivel para você");
    }else{
      System.out.println("Parabéns! Você ganhou "+cc.Ccredito+" de crédito");
    }
  }

if(pergunta==2){
  System.out.println("Poxa...Tudo bem,quando desejar solicitar seu cartão de credito estamos a sua disposição");
  
}


//POUPANÇA
Poupanca p=new Poupanca();


p.set_depositar(100);
System.out.println("Seu saldo é:"+p.get_deposito());


//TRANSFERENCIA
System.out.println("Transferir para conta corrente?[1]-Sim\n[2]-Não");
int userP=teclado.nextInt();

if(userP==1){
  
  cc.saldo=p.get_deposito();
  System.out.println("Saldo Conta Corrente:"+cc.saldo);
  System.out.println("Saldo conta poupança:"+p.get_deposito());
  
}
else{
  System.out.println("Tudo bem");
}


  }
}

 
