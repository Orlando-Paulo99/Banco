public class Poupanca {
private double saldo;

//DEPOSITO
public double get_deposito(){
  return saldo;
}
public void set_depositar(double d){
  this.saldo=this.saldo+d;
}
//rendimento
void rendimento(){
  this.saldo=this.saldo*0.1;
  System.out.println("Seu rendimento:"+this.saldo);
}

}
