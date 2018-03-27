
public class Elezioni {
	private Partito[] partiti;

	public Elezioni(Partito[] partiti) {
		super();
		this.partiti = partiti;
	}

	public Partito[] getPartiti() {
		return partiti;
	}
	
	
	public int getNumPartiti() {
		return this.partiti.length;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder();
		
		for (Partito p : partiti) {
			s.append(p);
			s.append("\n");
		}
	}
}
