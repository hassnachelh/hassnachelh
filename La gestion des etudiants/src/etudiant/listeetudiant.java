package etudiant;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

public class listeetudiant extends ArrayList<etudiant> {
	@Override
	public boolean add(etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	public interface condition{
		
	}
   
}
 
