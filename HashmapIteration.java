import java.util.HashMap;
import java.util.Scanner;

public class HashmapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> dataset=new HashMap<Integer, String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many person's record want to store: ");
		int students=sc.nextInt();
		int id=0;
		String StudentData[]=new String[students];
		for(int i=0;i<StudentData.length;i++)
		{
			System.out.print("Enter Id of "+(i+1)+" Student: ");
			id=sc.nextInt();
			System.out.print("Enter Name of "+(i+1)+" Student: ");
			StudentData[i]=sc.next();
			dataset.put(id, StudentData[i]);
			System.out.println();
		}
		for(Integer ids:dataset.keySet())
		{
			System.out.println(ids+" "+dataset.get(ids));
		}

	}

}
