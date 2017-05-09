
package algorithms.recursion;

public class TowersOfHanoi {

	public void changeDiscs(int n, String src, String aux, String dest){
		if(n==1){
			System.out.println("Moving of Disc "+  n + ": ("+ src + "-> " + dest+")");
		}
		else{
			
			changeDiscs(n-1, src, dest, aux);
	
			System.out.println("Moving of Disc " + n + ": ("+src + "-> " + dest+")");
			
			changeDiscs(n-1, aux, src, dest);	
		}
	}
	public static void main (String[] args)
	{
		int n = 3;
		TowersOfHanoi obj = new TowersOfHanoi();
		System.out.println("Towers Of Hanoi: \n" );
		obj.changeDiscs(n,"A","C","B");
	}
}