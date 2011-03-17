import java.util.Hashtable;


public class TranslationTable 
{
	private Hashtable<Integer, Instruction> table;
	
	public TranslationTable() 
	{
		table = new Hashtable<Integer, Instruction>();
	}
	
	public void addInstruction(int pc, Instruction inst)
	{
		table.put(pc, inst);
	}
	
	public Instruction getInstruction(int pc) 
	{
		return table.get(pc);
	}

}
