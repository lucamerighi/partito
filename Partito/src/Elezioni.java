import java.text.NumberFormat;

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
	
	private long getNumVoti() {
		long result = 0;
		for (Partito p : partiti) {
			result += p.getVoti();
		}
		return result;
	}
	
	@Override
	public String toString() {
		NumberFormat form = NumberFormat.getPercentInstance();
		StringBuilder s = new StringBuilder();
		long voti = getNumVoti();
		
		for (Partito p : partiti) {
			s.append(p);
			double perc = (double)p.getVoti() / voti;
			s.append(form.format(perc) + "\n");
		}
		
		return s.toString();
	}
}
