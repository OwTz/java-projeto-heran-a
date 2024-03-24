public class Trabalhador extends Pessoa {
  
private String cargo;
private float sal;

   public Trabalhador(String nome, int idade, String sexo, float sal,String cargo) {
    this.setNome(nome);
    this.setIdade(idade);
    this.setSexo(sexo);
    this.setSal(sal);
    this.setCargo(cargo);
}
   
public void setCargo(String cargo) {

   if(getIdade() < 18 ){
    System.out.print("o cargo não pode ser atribuído!");
   } else {
    System.out.println("Cargo atribuído");
    this.cargo = cargo;
   }
}
public String getCargo() {
    return this.cargo;
}
public void setSal(float sal){
 this.sal = sal;
}
protected float getSal(){
    return this.sal;
}

}
