
public interface Instruction 
{
	
	public void setNextInstruction(Instruction inst, int sourcePC); 
	/*{
		nextInstruction = inst;
		this.sourcePC = sourcePC;
	}*/
	
	/*override this!*/
	public Instruction execute(CPU cpu, Memory mem);
	/*{
		return nextInstruction;
	}*/
	
}
