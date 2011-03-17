
public class Executor 
{
	private CPU cpu;
	private Memory mem;
	
	public Executor(CPU cpu, Memory mem)
	{
		this.cpu = cpu;
		this.mem = mem;
	}
	
	public Instruction execute(Instruction ins)
	{
		Instruction current = ins;
		Instruction next = ins;
		while (next != null) 
		{
			current = next;
			next = current.execute(cpu, mem);
		}
		//if we are returning it's because the last instruction has no nextInstruction yet translated
		return current;
	}

}
