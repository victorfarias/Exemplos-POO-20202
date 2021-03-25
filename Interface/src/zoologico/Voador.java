package zoologico;

// Interface define tipo
public interface Voador {
	
	// implicitamente, é público
	void voar();
	
}

// Interfaces
// - Contrato
// - Não possui implementação - sem métodos concretos (salvo para Java 8+ - métodos default)
// - Seu métodos são públicos e abstratos
// - Não se pode instanciar
// - Não tem construtor nem atributos
// - Java não suporta herança múltiplas mas uma classe pode implementar várias interfaces
//
// Classes abstratas
//
// - Pode conter métodos concretos
// - Não se pode instanciar
// - Pode ter construtor
// - Pode ter atributos


