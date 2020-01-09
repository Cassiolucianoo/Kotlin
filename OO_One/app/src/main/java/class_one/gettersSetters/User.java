package class_one.gettersSetters;

public class User {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Maquina m = new Maquina("Gt");
        m.getMarca();
        m.setMarca("Gt");


    }
}
