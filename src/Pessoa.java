public abstract class Pessoa implements Pessoas{
    /* definindo classe abstrata para servir como raíz, ou super classe das outras  */
    private String nome, sexo;
    private int idade;
    private boolean estado;
    

    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean isEstado() {
        return this.estado;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return this.sexo;
    }

    /* métods especiais da classe */
    public void aniversarioUp(){
        this.idade++;
    }
    /* onão pode ser sobresposto com FINAL  */
    @Override
    public final void status() {
        System.out.println("======================== Status ========================");
        System.out.println(" NOME : "+getNome());
        System.out.println(" idade : "+getIdade());
        System.out.println(" SEXO :" +getSexo());
        System.out.println("======================== FIM Status ========================");
    }
    @Override
    public void menu() {
        
    }
}
