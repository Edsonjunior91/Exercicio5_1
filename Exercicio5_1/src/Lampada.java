
public class Lampada {
	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	public void  ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	public void imprimir() {
		if(ligada) {
			System.out.println("L�mpada Ligada");
		}else {
			System.out.println("Lampada Desligada");
		}
	}
	
}
