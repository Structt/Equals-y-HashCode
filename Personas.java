package Ejercicio1;

import java.util.Objects;

public class Personas {

	private int id;
	private String nombre;
	
	public Personas()
	{
		id=0;
		nombre="sin nombre";
	}
	
	public Personas(int id,String nombre)
	{
		this.id=id;
		this.nombre=nombre;
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

	@Override
	public String toString() {
		return "Personas [id=" + id + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personas other = (Personas) obj;
		return id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
}
