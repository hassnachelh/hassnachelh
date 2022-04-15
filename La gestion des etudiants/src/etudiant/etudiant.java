package etudiant;

public class etudiant {
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
		// TODO Auto-generated method stub
		return nom+":"+note;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(((etudiant)obj).id==this.id) return true;
		else
			return false;
	}

}
