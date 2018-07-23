
package s10.modelos;


public class Usuario {
    
    public Usuario(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    private String nombre;
    private int age;
}
