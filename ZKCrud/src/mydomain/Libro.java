package mydomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "libros")
	public class Libro {

	    private int id;
	    private String nombre;

	    @Id
	    @GeneratedValue
	    public int getID() {
	        return id;
	    }

	    public void setID(int iD) {
	        id = iD;
	    }

	    @Column(name = "nombre")
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String Nombre) {
	        nombre = Nombre;
	    }


	    @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder();
	        String NEW_LINE = System.getProperty("line.separator");
	        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
	        result.append(" User ID : " + this.id + NEW_LINE);
	        result.append(" Last Name : " + this.nombre + NEW_LINE);
	        result.append("}");
	        return result.toString();
	    }
	}

