package CoderElements;

import java.util.Arrays;

public class ElementsDown implements Interfaces.SymbolsLists  {
	
	//Move down on 2 positions
	public String Down2(String Message)
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
				if (LetterNumber - 2 < 0)
				{
					LetterNumber = 23 + LetterNumber;
				}
				else
				{
					LetterNumber -= 2 ; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber - 2 < 0)
					{
						LetterNumber = 23 + LetterNumber;
					}
					else
					{
						LetterNumber -= 2 ;
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber - 2 < 0)
						{
							LetterNumber = 7 + LetterNumber;
						}
						else
						{
							LetterNumber -= 2; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber - 2 < 0)
							{
								LetterNumber += 30 ;
							}
							else
							{
								LetterNumber -= 2; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Move down on 8 positions
	public String Down8(String Message)
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
				if (LetterNumber - 8 < 0)
				{
					LetterNumber = 17 + LetterNumber;
				}
				else
				{
					LetterNumber -= 8 ; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber - 8 < 0)
					{
						LetterNumber = 17 + LetterNumber;
					}
					else
					{
						LetterNumber -= 8 ;
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber - 8 < 0)
						{
							LetterNumber = 1 + LetterNumber;
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
							if (LetterNumber - 8 < 0)
							{
								LetterNumber += 24 ;
							}
							else
							{
								LetterNumber -= 8; 
							}
							Message = Message.substring(0,Index)+Symbols[LetterNumber]+Message.substring(Index+1);
						}
					}
				}
			}
		}
		
		return Message;
	}
	
	//Move down on 4 positions
	public String Down4(String Message)
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
				if (LetterNumber - 4 < 0)
				{
					LetterNumber = 21 + LetterNumber;
				}
				else
				{
					LetterNumber -= 4 ; 
				}
				Message = Message.substring(0,Index)+Letters[LetterNumber]+Message.substring(Index+1);
			}
			else
			{
				LetterNumber = Arrays.asList(UpLetters).indexOf(Letter);
				
				if (LetterNumber != -1 )
				{
					if (LetterNumber - 4 < 0)
					{
						LetterNumber = 21 + LetterNumber;
					}
					else
					{
						LetterNumber = LetterNumber - 4 ;
					}
					Message = Message.substring(0,Index)+UpLetters[LetterNumber]+Message.substring(Index+1);
				}
				else
				{
					LetterNumber = Arrays.asList(Numbers).indexOf(Letter);
					
					if (LetterNumber != -1 )
					{
						if (LetterNumber - 4 < 0)
						{
							LetterNumber = 5 + LetterNumber;
						}
						else
						{
							LetterNumber -= 4; 
						}
						Message = Message.substring(0,Index)+Numbers[LetterNumber]+Message.substring(Index+1);
					}
					else
					{
						LetterNumber = Arrays.asList(Symbols).indexOf(Letter);
						
						if (LetterNumber != -1 )
						{
							if (LetterNumber - 4 < 0)
							{
								LetterNumber += 28 ;
							}
							else
							{
								LetterNumber -= 4; 
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
