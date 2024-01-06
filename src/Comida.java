public class Comida extends Menu {
    String tipo_comida;
    String preferencia;

    public Comida(String nombre, String menu, String tipo, String tipo_comida, String preferencia){
    super(nombre, menu, tipo);
    this.tipo_comida = tipo_comida;
    this.preferencia = preferencia;
    }
    public String getTipo_comida(){
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
}
