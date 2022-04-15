package etudiant;

public class etudiant  implements Comparable<etudiant>{
	public static void main(String[]args ) {
		
	}
	private int id;
	private String nom;
	private double note;
	public etudiant(int id,String nom) {
		this.id=id;
		this.note=10;
		this.nom=nom;	
	}
	@Override
	public String toString() {
		
		return nom+":"+note;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(((etudiant)obj).id==this.id) return true;
		else
			return false;
	}
	@Override
	public int compareTo(etudiant o) {
		if(this.note<o.note) return 1;
		return 0;
	}
	

}
