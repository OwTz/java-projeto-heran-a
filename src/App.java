public class App {
    public static void main(String[] args) throws Exception {

        Trabalhador t[] = new Trabalhador[3];
        Professor p[] = new Professor[1];
        
        
        t[0] = new Trabalhador("Souza",28,"masculino",1512f,"SG");
        t[0].aniversarioUp();
        t[0].status();
        
        p[0] = new Professor("Filipe", 18, "M", 1566, " professor- história");
        p[0].status();
        p[0].aniversarioUp();
        p[0].status();
        p[0].aumentarSal(1500f);



    }
}
