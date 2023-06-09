package DataClasses;

public class Usuario {
    public String nombre;
    public String apellido;
    public String correo;
    private String password;

    public Usuario(String nombre,String apellido, String correo,
                   String password)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return this.nombre+" "+this.apellido;
    }
}
