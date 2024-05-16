import java.util.Random;

public class Cliente {
    private int id;
    private int tempoAtendimento;

    public Cliente(int id) {
        this.id = id;
        this.tempoAtendimento = new Random().nextInt(5) + 1;
    }

    public int getId() {
        return id;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }
}