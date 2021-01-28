
public class PartF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<5; i ++)
		{
		    for (int k=0; k < (4 - i); k++)
		    {
		        System.out.print(" ");
		    }
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
		for (int i=1; i<5; i ++)
		{
		    for (int k=4; k > (4 - i); k--)
		    {
		        System.out.print(" ");
		    }
		    for(int l = 4; l > i; l--) {
		    	System.out.print("* ");
		    }
		    System.out.println("");
	}
}
}

