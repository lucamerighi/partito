
public class Partito {
	private String nome;
	private long voti;
	
	
	public Partito(String nome, long voti) {
		super();
		this.nome = nome;
		this.voti = voti;
	}


	public String getNome() {
		return nome;
	}


	public long getVoti() {
		return voti;
	}
	
	@Override
	public String toString() {
		return (this.nome + "\t Voti: " + this.voti);
	}
	
}
