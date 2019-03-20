package DecoderElements;

import java.util.Arrays;

public class DecoderElementsUp implements Interfaces.SymbolsLists{

	//Decode when we moved up on 1 position
	public String DecodeUp1 (String Message)
	{
		int LetterNumber;
		String Letter;
		int Length = Message.length();
		
		for(int Index = 0;Index < Length-1;Index++)
		{

			Letter = Character.toString(Message.charAt(Index));
			LetterNumber = Arrays.asList(Letters).indexOf(Letter);
			
			if (LetterNumber != -1 )
			{
				if (LetterNumber - 1 < 0)
				{
					LetterNumber = 24 ;
				}
				else
				{
					LetterNumber -= 1; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber - 1 < 0)
					{
						LetterNumber = 24;
					}
					else
					{
						LetterNumber -= 1; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber - 1 < 0)
						{
							LetterNumber = 9 ;
						}
						else
						{
							LetterNumber -= 1; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber - 1 < 0)
							{
								LetterNumber = 31;
							}
							else
							{
								LetterNumber -= 1; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Decode when we moved up on 3 positions
	public String DecodeUp3 (String Message)
	{
		int LetterNumber;
		String Letter;
		int Length = Message.length();
		
		for(int Index = 0;Index < Length-1;Index++)
		{

			Letter = Character.toString(Message.charAt(Index));
			LetterNumber = Arrays.asList(Letters).indexOf(Letter);
			
			if (LetterNumber != -1 )
			{
				if (LetterNumber - 3 < 0)
				{
					LetterNumber += 22;
				}
				else
				{
					LetterNumber -= 3; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber - 3 < 0)
					{
						LetterNumber += 22;
					}
					else
					{
						LetterNumber -= 3; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber - 3 < 0)
						{
							LetterNumber += 7;
						}
						else
						{
							LetterNumber -= 3; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber - 3 < 0)
							{
								LetterNumber += 29;
							}
							else
							{
								LetterNumber -= 3; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Decode when we moved up on 7 positions
	public String DecoderUp7 (String Message)
	{
		int LetterNumber;
		String Letter;
		int Length = Message.length();
		
		for(int Index = 0;Index < Length-1;Index++)
		{

			Letter = Character.toString(Message.charAt(Index));
			LetterNumber = Arrays.asList(Letters).indexOf(Letter);
			
			if (LetterNumber != -1 )
			{
				if (LetterNumber - 7 < 0)
				{
					LetterNumber += 18;
				}
				else
				{
					LetterNumber -= 7; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber - 7 < 0)
					{
						LetterNumber += 18;
					}
					else
					{
						LetterNumber -= 7; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber - 7 < 0)
						{
							LetterNumber += 3;
						}
						else
						{
							LetterNumber -= 7; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber - 7 < 0)
							{
								LetterNumber += 25;
							}
							else
							{
								LetterNumber -= 7; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
		
}
