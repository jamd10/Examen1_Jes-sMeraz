package examen1_jesúsmeraz;

public class Armas {

    private String tipo;

    public Armas() {
    }

    public Armas(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Armas{" + "tipo=" + tipo + '}';
    }

}
