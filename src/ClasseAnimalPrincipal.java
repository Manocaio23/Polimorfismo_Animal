
public class ClasseAnimalPrincipal {
	public static void main(String [] args) {
	//Animal a=new Animal();
	Mamifero m = new Mamifero();
	Reptil r=new Reptil();
	Peixe p =new Peixe();
	Ave a = new Ave();
	Canguru c=new Canguru();
	Cachorro ca=new Cachorro();
	Cobra co=new Cobra();
	Tartaruga t=new Tartaruga();
	Goldfish g=new Goldfish();
	Arara ar=new Arara();
	

	//colocando valores no mamifero 
	m.setPeso(35.3f);
	m.setCorPelo("MARROM");
	m.setIdade(40);
	m.setMembros(4);
	m.alimentar();
	m.emitirSom();
	m.locomover();
	
	//colocando de reptil
	System.out.println("O repitil");
	r.locomover();
	System.out.println("A ave ");
	//ave
	a.locomover();
	
	//canguru
	System.out.println("o canguru ele...");
	c.locomover();
	//o chachorro ele...
	System.out.println("O cachorr faz que som ?");
	ca.emitirSom();
	
	
	
	}
	
	

}
