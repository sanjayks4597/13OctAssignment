import java.util.HashMap;

public class HasmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="aaaaa bbbbbb c";
		char []ch=str.toCharArray();
		HashMap<Character,Integer> datamap=new HashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isWhitespace(ch[i]))
			{
				if(datamap.containsKey(ch[i]))
				{
					Integer value=datamap.get(ch[i]);
					value++;
					datamap.put(ch[i], value);
				}
				else
				{
					datamap.put(ch[i], 1);
				}
			}
		}
		System.out.println(datamap);
		int max=0;
		char maxChar=0;
		
		for(Character key:datamap.keySet())
		{
			if(max<datamap.get(key))
			{
				max=datamap.get(key);
				maxChar=key;
			}
		}
		
		int min=Integer.MAX_VALUE;
		char minChar=0;
		
		for(Character key:datamap.keySet())
		{
			if(min>datamap.get(key))
			{
				min=datamap.get(key);
				minChar=key;
			}
		}
		
		System.out.println("maxChar: "+maxChar+": "+max);
		System.out.println("minChar: "+minChar+": "+min);
		

	}

}
