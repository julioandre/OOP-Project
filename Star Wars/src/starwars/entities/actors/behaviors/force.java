package starwars.entities.actors.behaviors;

public class force {
	int maxforce = 100;
	int adqforce = 70;
	
	public int increseforce(int i){
		int m = 0;
		if(i<maxforce){
			m=i+ 10;
		}
		return m;
	}
	public boolean checkforce(int i){
		if(i<adqforce){
			return false;
		}
		else{
			return true;
		}
	}

}
