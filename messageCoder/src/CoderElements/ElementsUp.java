package CoderElements;

import java.util.Arrays;

public class ElementsUp implements Interfaces.SymbolsLists  {
	
	//Move up on 1 position
	public String Up1 (String Message)
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
				if (LetterNumber + 1 <= 24)
				{
					LetterNumber += 1 ;
				}
				else
				{
					LetterNumber = 0; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber + 1 <= 24)
					{
						LetterNumber += 1 ;
					}
					else
					{
						LetterNumber = 0; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber + 1 <= 9)
						{
							LetterNumber += 1 ;
						}
						else
						{
							LetterNumber = 0; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber + 1 <= 31)
							{
								LetterNumber += 1 ;
							}
							else
							{
								LetterNumber = 0; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Move up on 3 positions
	public String Up3 (String Message)
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
				if (LetterNumber + 3 <= 24)
				{
					LetterNumber += 3 ;
				}
				else
				{
					LetterNumber -= 22; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber + 3 <= 24)
					{
						LetterNumber += 3 ;
					}
					else
					{
						LetterNumber -= 22; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber + 3 <= 9)
						{
							LetterNumber += 3 ;
						}
						else
						{
							LetterNumber = (LetterNumber  + 3) % 10;
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber + 3 <= 31)
							{
								LetterNumber += 3 ;
							}
							else
							{
								LetterNumber -= 29; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Move up to 7 Positions
	public String Up7 (String Message)
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
				if (LetterNumber + 7 <= 24)
				{
					LetterNumber += 7 ;
				}
				else
				{
					LetterNumber -= 18; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber + 7 <= 24)
					{
						LetterNumber += 7 ;
					}
					else
					{
						LetterNumber -= 18; 
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber + 7 <= 9)
						{
							LetterNumber += 7 ;
						}
						else
						{
							LetterNumber = (LetterNumber  + 7) % 10;
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber + 7 <= 31)
							{
								LetterNumber += 7 ;
							}
							else
							{
								LetterNumber -= 25; 
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
