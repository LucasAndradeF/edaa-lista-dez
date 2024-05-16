import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {

        Queue<Cliente> filaDeClientes = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            filaDeClientes.add(new Cliente(i));
            System.out.println(LocalDateTime.now() + " : Cliente " + i + " entrou na fila de espera.");
        }

        while (!filaDeClientes.isEmpty()) {
            Funcionario funcionario = new Funcionario();
            LocalDateTime inicioAtendimento = LocalDateTime.now();
            System.out.println();
            System.out.println(inicioAtendimento + " : Atendendo Cliente " + filaDeClientes.peek().getId()
                    + " com Funcionário " + funcionario.getId() + "...");
            Cliente clienteAtual = filaDeClientes.poll();
            System.out.println(inicioAtendimento + " : Cliente " + clienteAtual.getId() + " atendido pelo Funcionario "
                    + funcionario.getId() + " com o tempo de " + clienteAtual.getTempoAtendimento() + " segundos");
            TimeUnit.SECONDS.sleep(clienteAtual.getTempoAtendimento());
        }

        LocalDateTime fimAtendimento = LocalDateTime.now();
        System.out.println();
        System.out.println(fimAtendimento + " : Todos os clientes foram atendidos.");
    }
}