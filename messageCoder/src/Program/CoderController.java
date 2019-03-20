package Program;

import java.util.Random;


//Importing encryption protocols
import CoderElements.ElementsDown;
import CoderElements.ElementsUp;
import CoderElements.MessageSplit;
import CoderElements.ReverseElements;

//Importing decryption protocols
import DecoderElements.DecoderElementsDown;
import DecoderElements.DecoderElementsUp;
import DecoderElements.DecoderMessageSplit;
import DecoderElements.DecoderReverseElements;

public class CoderController {
	//This controller contains protocols for encryption/decryption processes 
	
	//Protocol for encryption process
	public String EncryptionProtocol (String Message)
	{
		ElementsDown ElementsD = new ElementsDown();
		ElementsUp ElementsU = new ElementsUp();
		MessageSplit MessageS = new MessageSplit();
		ReverseElements ElementsR = new ReverseElements();
		
		int randomSequence;
		int previousSequence = 0;
		String sequence = null ;
		int firstletter = 0;
		
		for(int count = 0 ; count < 9 ; count ++)
		{
			Random random = new Random();
			randomSequence = random.nextInt(9) + 1;
					
			while(randomSequence == previousSequence && ((previousSequence == 7) || (previousSequence == 10) ))
			{
				randomSequence = random.nextInt(9) + 1;
			}
			
			switch(randomSequence)
			{
			case 1 :
			{
				Message = ElementsD.Down2(Message);
				break;
			}
			
			case 2 :
			{
				Message = ElementsD.Down4(Message);
				break;
			}
			
			case 3 :
			{
				Message = ElementsD.Down8(Message);
				break;
			}
			
			case 4 :
			{
				Message = ElementsU.Up1(Message);
				break;
			}
			
			case 5 :
			{
				Message = ElementsU.Up3(Message);
				break;
			}
			
			case 6 :
			{
				Message = ElementsU.Up7(Message);
				break;
			}
			
			case 7 :
			{
				Message = MessageS.SplitHalf(Message);
				break;
			}
			
			case 8 :
			{
				Message = MessageS.SplitLeftBigger(Message);
				break;
			}
			
			case 9 :
			{
				Message = MessageS.SplitRigthBigger(Message);
				break;
			}
			
			case 10 :
			{
				Message = ElementsR.ReverseKeySymbols(Message);
				break;
			}
			}
			
			previousSequence = randomSequence ;
			if (firstletter == 0)
			{
				sequence = String.valueOf(randomSequence);
				firstletter = 1;
			}
			else
			{
				sequence = sequence + randomSequence;
			}		
		}
		
		int length = Message.length();
		Message = Message.substring(0, length - 1) + sequence + Message.substring(length - 1);
		
		return Message;
	}
	
	//Protocol for decryption process
	public String DecryptionProtocol (String Message)
	{
		DecoderElementsDown DElementsD = new DecoderElementsDown();
		DecoderElementsUp DElementsU = new DecoderElementsUp();
		DecoderMessageSplit DMessageS = new DecoderMessageSplit();
		DecoderReverseElements DElementsR = new DecoderReverseElements();
		
		int length = Message.length();
		String sequence = Message.substring(length-10, length-1);
		Message = Message.substring(0,length-10) + Message.substring(length-1);
		int sequenceL = sequence.length();
		int protocol;
		
		for(int count = 0 ; count < 9 ; count++)
		{
			protocol = Integer.parseInt(sequence.substring(sequenceL-1));
			sequence = sequence.substring(0, sequenceL-1);
			sequenceL = sequence.length();
			
			switch (protocol)
			{
			case 1 :
			{
				Message = DElementsD.DecodeDown2(Message);
				break;
			}
			
			case 2 :
			{
				Message = DElementsD.DecodeDown4(Message);
				break;
			}
			
			case 3 :
			{
				Message = DElementsD.DecodeDown8(Message);
				break;
			}
			
			case 4 :
			{
				Message = DElementsU.DecodeUp1(Message);
				break;
			}
			
			case 5 :
			{
				Message = DElementsU.DecodeUp3(Message);
				break;
			}
			
			case 6 :
			{
				Message = DElementsU.DecoderUp7(Message);
				break;
			}
			
			case 7 :
			{
				Message = DMessageS.DecodeSplitHalf(Message);
				break;
			}
			
			case 8 :
			{
				Message = DMessageS.DecodeSplitLeftBigger(Message);
				break;
			}
			
			case 9 :
			{
				Message = DMessageS.DecodeSplitRigthBigger(Message);
				break;
			}
			
			case 10 :
			{
				Message = DElementsR.DecodeReverseKeySymbols(Message);
				break;
			}
			}
		}
		
		return Message;
	}
	
	//Protocol for checking results of ecryption or decryption processes
	public String CheckProtocol (String ResultMessage , String InitialMessage)
	{
		String Result;
		String ReDecodingResult = null;
		
		ReDecodingResult = DecryptionProtocol(ResultMessage);	
		
		if (InitialMessage.equals(ReDecodingResult) )
		{
			Result = "Checking done successfully";
		}
		else
		{
			Result = "Can't create such encyption from inputed text";
		}
		return Result;
	}

}
