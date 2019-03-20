package CoderElements;

public class MessageSplit {
	
	//We split into two parts when length of the first part is equal to length of the second part
	public String SplitHalf(String Message)
	{
		int checkAdditionalSymbol = 0;
		String additionalSymbol = null;
		int Length = Message.length();
		
		//This split won't show any results if message is consist of less then 2 elements 
		if(Length < 2)
		{
			return Message;
		}
			
		if (Length % 2 == 0)
		{
			Length = Length / 2;
		}
		else
		{
			additionalSymbol = Message.substring(Message.length()-1);
			checkAdditionalSymbol = 1;
			Message = Message.substring(0,Message.length()-1);
			Length = Length  / 2;
		}
		if(checkAdditionalSymbol == 1)
		{
			Message = Message.substring(Length) + Message.substring(0, Length) + additionalSymbol;
		}
		else
		{
			Message = Message.substring(Length) + Message.substring(0, Length);
		}
		
		return Message;
	}
	
	//We split into two parts when length of the first part is bigger then length of the second part
	public String SplitLeftBigger(String Message)
	{
		int checkAdditionalSymbol = 0;
		String additionalSymbol = null;
		int Length = Message.length();
		
		//Special cases when length of message is less then 4
		if(Length < 2)
		{
			return Message;
		}
		else
		{
			if (Length < 4)
			{
				Length 	-= 1;
				Message = Message.substring(Length) + Message.substring(0, Length);
				return Message;
			}
		}
		
		if (Length % 2 == 0)
		{
			Length = (Length / 4);
			
		}
		else
		{	
			additionalSymbol = Message.substring(Message.length()-1);
			checkAdditionalSymbol = 1;
			Message = Message.substring(0,Message.length()-1);
			Length = Length  / 4;
		}	
		
		int LeftPart = 3 * Length;
		
		if(checkAdditionalSymbol == 1)
		{
			Message = Message.substring(LeftPart) + Message.substring(0, LeftPart) + additionalSymbol;
		}
		else
		{
			Message = Message.substring(LeftPart) + Message.substring(0, LeftPart);
		}
		
		return Message;
		
		
	}

	//We split into two parts when length of the first part is less then length of the second part
	public String SplitRigthBigger(String Message)
	{
		int checkAdditionalSymbol = 0;
		String additionalSymbol = null;
		int Length = Message.length();
		
		//Special cases when length of message is less then 4
		if(Length < 2)
		{
			return Message;
		}
		else
		{
			if (Length < 4)
			{
				Message = Message.substring(1) + Message.substring(0, 1);
				return Message;
			}
		}
		
		if (Length % 2 == 0)
		{
			Length = (int)(Length / 4);
		}
		else
		{	
			additionalSymbol = Message.substring(Message.length()-1);
			checkAdditionalSymbol = 1;
			Message = Message.substring(0,Message.length()-1);
			Length = Length  / 4;
		}

		if(checkAdditionalSymbol == 1)
		{
			Message = Message.substring(Length) + Message.substring(0, Length) + additionalSymbol;
		}
		else
		{
			Message = Message.substring(Length) + Message.substring(0, Length);
		}
		return Message;
	}
}
