package exercicio2;

public class LivroFactory extends DocumentoFactory {
	
	public Documento createDocumento(){
	return new Livro();
	}
	
}
