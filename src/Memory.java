import java.util.ArrayList;

public class Memory 
{
	private ArrayList<Word> sourceBinary;
		
	public Memory(ArrayList<Word> source)
	{
		this.sourceBinary = source;
	}
	
	//for self modifications
	//update Instruction in Translation table here??
	//nix passiert
	public void storeWord(int pc, Word word)
	{
		sourceBinary.set(pc, word);
	}
	
	public Word loadWord(int pc)
	{
		//translate pc to index in arrayList and return word
		return sourceBinary.get(pc/4);
	}

}
