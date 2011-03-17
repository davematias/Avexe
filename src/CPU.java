
public class CPU 
{
	private int pc;
	private Register[] registers;

	public CPU()
	{
		pc = 0;
		registers = new Register[32];
	}
	
	public void setPC(int newPC)
	{
		pc = newPC;
	}
	
	public int getPC()
	{
		return pc;
	}
	
	public void incrementPC()
	{
		pc += 4;
	}

}
