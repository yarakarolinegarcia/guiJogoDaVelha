package POO;


public class Eixo implements Comparable<Eixo> {

    public int getId() {
        return id;
    }

    private int id;

    public int getValor() {
        return valor;
    }

    private int valor;

    public Eixo(int i, int soma) {
        this.id = i;
        this.valor = soma;
    }


    @Override
    public int compareTo(Eixo e2) {
        if (valor < e2.valor) {
            return 1;
        } else if (valor > e2.valor)
            return -1;
        else {
            if (id < e2.id) {
                return 1;
            } else if (id > e2.id)
                return -1;

            return 0;
        }
    }

    @Override
    public String toString() {
        return "Eixo{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }
}
