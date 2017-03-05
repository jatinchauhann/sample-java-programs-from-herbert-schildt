import java.util.Random;

public class Question  {
	Random rand;
	Answer ask (){
		int prob=(int)(100 * rand.nextDouble());
		if(prob<15)
			return Answer.MAYBE;
		else if(prob<30)
			return Answer.NO;
		else if(prob<60)
			return Answer.YES;
		else if(prob<75)
			return Answer.LATER;
		else if(prob<98)
			return Answer.SOON;
		else return Answer.NEVER;
	}
}
