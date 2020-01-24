
public class Mamifero extends Animal {
	//so tem metodotos
	private String corPelo;
	//metodos
	@Override //= a sobrepor
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Mamando....");
	}
	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
	}
	//metodos
	
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
