public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;

    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public String toString() {
        return (concluida ? " [X]" : "[ ]") + descricao;
    }
}

