package POO;

import java.util.ArrayList;
import java.util.List;

public class Ex07Tarefas {
    String descricao;
    boolean concluida;

    void exibir() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }

    public static void main(String[] args) {
        Ex07Tarefas t1 = new Ex07Tarefas();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Ex07Tarefas t2 = new Ex07Tarefas();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        List<Ex07Tarefas> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Ex07Tarefas t : lista) {
            t.exibir();
        }
    }
}
