package DecoderElements;

import java.util.Arrays;

public class DecoderReverseElements implements Interfaces.CombinedSymbolsList{
	
	//Decode when we changed element to another using its position according to the middle of CombinedSymbols's list
	public String DecodeReverseKeySymbols(String Message)
	{
		int LetterNumber;
		String Letter;
		int Length = Message.length();
			
		for(int Index = 0;Index < Length-1;Index++)
		{

			Letter = Character.toString(Message.charAt(Index));
			LetterNumber = Arrays.asList(KeySymbols).indexOf(Letter);
				
			if (LetterNumber != -1 )
			{
				Message = Message.substring(0,Index)+KeySymbols[91-LetterNumber]+Message.substring(Index+1);
			}
		}
		return Message;
	}

}
