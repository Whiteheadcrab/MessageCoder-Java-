package DecoderElements;

import java.util.Arrays;

public class DecoderElementsDown implements Interfaces.SymbolsLists{
	
	//Decode when we moved down on 2 positions
	public String DecodeDown2 (String Message)
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
				if (LetterNumber + 2 <= 24)
				{
					LetterNumber += 2;
				}
				else
				{
					LetterNumber -= 23 ; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber + 2 <= 24)
					{
						LetterNumber += 2;
					}
					else
					{
						LetterNumber -= 23 ;
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber + 2 <= 9)
						{
							LetterNumber += 2;
						}
						else
						{
							LetterNumber -= 8; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber + 2 <= 31)
							{
								LetterNumber += 2 ;
							}
							else
							{
								LetterNumber -= 30; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}

	//Decode when we moved down on 8 positions
	public String DecodeDown8 (String Message)
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
				if (LetterNumber + 8 <= 24)
				{
					LetterNumber += 8 ;
				}
				else
				{
					LetterNumber -= 17; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber + 8 <= 24)
					{
						LetterNumber += 8 ;
					}
					else
					{
						LetterNumber -= 17; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber + 8 <= 9)
						{
							LetterNumber += 8;
						}
						else
						{
							LetterNumber = (LetterNumber  + 8) % 10;
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber + 8 <= 31)
							{
								LetterNumber += 8;
							}
							else
							{
								LetterNumber -= 24; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Decode when we moved down on 4 positions
	public String DecodeDown4 (String Message)
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
				if (LetterNumber + 4 <= 24)
				{
					LetterNumber += 4;
				}
				else
				{
					LetterNumber -= 21; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber + 4 <= 24)
					{
						LetterNumber += 4;
					}
					else
					{
						LetterNumber -= 21; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber + 4 <= 9)
						{
							LetterNumber += 4 ;
						}
						else
						{
							LetterNumber = (LetterNumber  + 4) % 10;
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber + 4 <= 31)
							{
								LetterNumber += 4 ;
							}
							else
							{
								LetterNumber -= 28; 
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
