
public class Peixe extends Animal {
	private String corEscama;
	
	//metodos

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Porcaria deixada pelos outros na praia ou alga");
	}
	
	

	@Override
	public void emitirSom() {
		System.out.println("Peixe nao faz som ");		
	}
	
	public void saltarBolha() {
		
		System.out.println("soltou uma bolha ");
	}
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
