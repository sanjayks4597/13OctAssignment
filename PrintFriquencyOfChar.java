import java.util.HashMap;

public class PrintFriquencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbbcccddeeeffffksacd";
		HashMap<Character, Integer> datamap=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') {
				if(datamap.containsKey(str.charAt(i)))
				{
					Integer value=datamap.get(str.charAt(i));
					value++;
					datamap.put(str.charAt(i), value);
				}
				else
				{
					datamap.put(str.charAt(i), 1);
				}
			}
		}
		
		for(Character key:datamap.keySet())
		{
			System.out.print( key+" :" +datamap.get(key)+" ,");
		}

	}

}
