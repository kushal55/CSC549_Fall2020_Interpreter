import java.util.ArrayList;

public class VariableEnvironment 
{
	private ArrayList<NameValuePair> theVariables;
	
	public VariableEnvironment()
	{
		this.theVariables = new ArrayList<NameValuePair>();
	}
	
	public void display()
	{
		for(NameValuePair nvp : this.theVariables)
		{
			nvp.display();
		}
	}
	
	//take in a name and a value and create a NameValuePair and add
	//it to theVariables
	public void addVariable(String name, int value)
	{
		env.add("a",5);
		env.add("b",7);
		System.out.println(env); 
	}
	
	//take in a name and it should retrieve the value associated
	//with that variable name.  For now, you can assume that
	//any name you look for, will be found.
	public int getValue(String name)
	{
		return this.theVariables = name;
	}
}
