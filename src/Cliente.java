import java.io.Serializable;

public class Cliente implements Serializable {

	 private int id;
	 private String nombre;
	 private String apellidos;
	 private String telefono;
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
public Cliente(int id, String nombre, String apellidos, String telefono)
{
	this.id=id;;
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.telefono=telefono;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
}
