import java.util.Random;

public class Cliente extends   BancoModelo{

//Atributos
public String nome;
private int cpf;
private String endereco;
private int telefone;
public int agencia;

//MOSTRANDO OS ATRIBUTOS PRIVADOS
public int get_mostrarCpf(){
  return this.cpf;
}

public String get_mostrarEndereco(){
  return this.endereco;
}

public int get_mostrarTelefone(){
  return this.telefone;
}

//GERADOR DE NUMERO DE CONTA
 void geradorConta(){
  Random gerador=new Random();
  int outGerador=gerador.nextInt(10000);
  System.out.println("Numero da Conta: "+outGerador);
}

//METODOS PARA INSERIR VALORES NOS ATRIBUTOS PRIVADOS
public void set_digiCpf(int c){
  this.cpf=c;
}
public void set_digiEndereco(String e){
  this.endereco=e;
}

public void set_digiTell(int t){
  this.telefone=t;
}








}
