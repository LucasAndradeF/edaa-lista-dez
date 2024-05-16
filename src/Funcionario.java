import java.util.Random;

public class Funcionario {
    private static Random random = new Random();
    private int id;

    public Funcionario() {
        this.id = random.nextInt(10) + 1;
    }

    public int getId() {
        return id;
    }
}