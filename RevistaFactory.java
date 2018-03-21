package exercicio2;

public class RevistaFactory extends DocumentoFactory {
	
	public Documento createDocumento() {
	return new Revista();		
	}

}
