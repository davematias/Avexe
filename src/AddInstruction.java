
public class AddInstruction implements Instruction
{

	private Instruction nextInstruction;
	
	@Override
	public void setNextInstruction(Instruction inst, int sourcePC) 
	{
		nextInstruction = inst;
	}

	@Override
	public Instruction execute(CPU cpu, Memory mem) {
		// TODO Auto-generated method stub
		return nextInstruction;
	}
	
	
}
