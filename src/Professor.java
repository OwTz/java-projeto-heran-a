import java.lang.reflect.Method;

public final class Professor extends Trabalhador{
    private String tipoc;
    
    public Professor(String nome, int idade, String sexo, float sal, String cargo){
        super(nome, idade, sexo, sal, cargo);
    }

    public void setTipoc(String tipoC){
        this.tipoc = tipoC;

    }
    public void aumentarSal(float aumentoSal){
        float valor;
        valor = getSal() + aumentoSal;
        setSal(valor);
    }
    /*  Não pode ser alterado por causa do final na classe abstrata pessoa
    public void status(){

    }*/
}
