package DataClasses;

public class Formulario {
    public String id_form;
    public String nombre;
    public String apellido;
    public String cedula;
    public String telefono;
    public String genero;
    public String edad;
    public String tipo_de_acoso;
    public String frecuencia;
    public String ejercido_por;
    public String descripcion;
    public String forma_de_contacto;

    public Formulario(String id_form, String nombre, String apellido, String cedula,
                      String telefono, String genero, String edad, String tipo_de_acoso,
                      String frecuencia, String ejercido_por, String descripcion, String forma_de_contacto )
    {
        this.id_form= id_form;
        this.nombre= nombre;
        this.apellido= apellido;
        this.cedula=cedula;
        this.telefono=telefono;
        this.genero=genero;
        this.edad=edad;
        this.tipo_de_acoso=tipo_de_acoso;
        this.frecuencia=frecuencia;
        this.ejercido_por=ejercido_por;
        this.descripcion=descripcion;
        this.forma_de_contacto=forma_de_contacto;
    }

    public String getId_form() {
        return id_form;
    }

    public void setId_form(String id_form) {
        this.id_form = id_form;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo_de_acoso() {
        return tipo_de_acoso;
    }

    public void setTipo_de_acoso(String tipo_de_acoso) {
        this.tipo_de_acoso = tipo_de_acoso;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getEjercido_por() {
        return ejercido_por;
    }

    public void setEjercido_por(String ejercido_por) {
        this.ejercido_por = ejercido_por;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getForma_de_contacto() {
        return forma_de_contacto;
    }

    public void setForma_de_contacto(String forma_de_contacto) {
        this.forma_de_contacto = forma_de_contacto;
    }

    @Override
    public String toString(){
        return this.descripcion;
    }
}
