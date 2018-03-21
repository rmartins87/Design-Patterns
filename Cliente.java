package exercicio2;

public class Cliente{
	
	public static void main(String[] args) {
		DocumentoFactory df = new RevistaFactory();
		Documento doc = df.createDocumento();
		doc.imprimir();
		
		DocumentoFactory de = new LivroFactory();
		Documento dc = de.createDocumento();
		dc.imprimir();
	}

}
