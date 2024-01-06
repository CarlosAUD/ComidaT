public class Menu extends ComidaTipica{
    String menu;
    String tipo;
    public  Menu(String nombre, String menu, String tipo){
        super(nombre);
        this.menu = menu;
        this.tipo = tipo;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
