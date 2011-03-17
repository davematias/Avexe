
public class Translator 
{
	//read the file and translate instructions and put to translation table

	private Executor executor;
	private Memory mem;
	TranslationTable translationTable;
	
	
	public Translator(Executor executor, Memory sourceMemory, TranslationTable t)
	{
		this.executor = executor;
		this.mem = sourceMemory;
		this.translationTable = t;
	}
	
	public void translate(int pc)
	{
		Word currentWord = mem.loadWord(pc);
		//do the magic
		//add to translation table
		Instruction currentInst = wordToInstruction(currentWord);
		translationTable.addInstruction(pc, currentInst);
	    executor.execute(currentInst);
	}
	
	private Instruction wordToInstruction(Word w)
	{
		return new AddInstruction();
	}
	
}
