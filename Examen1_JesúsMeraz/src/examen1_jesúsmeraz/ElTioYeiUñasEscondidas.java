package examen1_jesúsmeraz;

public class ElTioYeiUñasEscondidas extends Personas {

    private int Cantidad;

    public ElTioYeiUñasEscondidas() {
        super();
    }

    public ElTioYeiUñasEscondidas(String Nombre, int Edad, String Sexo, String Arma, int Cantidad) {
        super(Nombre, Edad, Sexo, Arma);
        this.Cantidad = Cantidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return this.toString() + "ElTioYeiUñasEscondidas{" + "Cantidad=" + Cantidad + '}';
    }
}
