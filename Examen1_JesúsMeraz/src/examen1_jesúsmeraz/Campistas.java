package examen1_jesúsmeraz;

public class Campistas extends Personas {

    private String Tipo_campista;
    private String EstadoDeVida;

    public Campistas() {
        super();
    }

    public Campistas(String Nombre, int Edad, String Sexo, String Arma, String Tipo_campista, String EstadoDeVida) {
        super(Nombre, Edad, Sexo, Arma);
        this.Tipo_campista = Tipo_campista;
        this.EstadoDeVida = EstadoDeVida;
    }

    public String getTipo_campista() {
        return Tipo_campista;
    }

    public void setTipo_campista(String Tipo_campista) {
        this.Tipo_campista = Tipo_campista;
    }

    public String getEstadoDeVida() {
        return EstadoDeVida;
    }

    public void setEstadoDeVida(String EstadoDeVida) {
        this.EstadoDeVida = EstadoDeVida;
    }

    @Override
    public String toString() {
        return this.toString() + "Campistas{" + "Tipo_campista=" + Tipo_campista + ", EstadoDeVida=" + EstadoDeVida + '}';
    }

}
