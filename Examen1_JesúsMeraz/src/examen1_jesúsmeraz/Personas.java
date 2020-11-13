package examen1_jesúsmeraz;

public class Personas {

    private String Nombre;
    private int Edad;
    private String Sexo;
    private String Arma;

    public Personas() {

    }

    public Personas(String Nombre, int Edad, String Sexo, String Arma) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Arma = Arma;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Arma=" + Arma + '}';
    }

}
