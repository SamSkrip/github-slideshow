package lab7;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
		private Card mcdavid;
		private Card kane;
		private Card ovechkin;
		private Card subban;
		private Card gretzky;
		private Card crosby;
		private CardCollection cc1;
			
		@Before
		public void setup() {
			mcdavid=new Card("Connor McDavid", 2011);
			kane = new Card("Patrick Kane", 2003);
			ovechkin= new Card("Alexander Ovechkin", 2005);
			subban= new Card("P.K. Subban", 2009);
			crosby= new Card("Sydney Crosby", 2033);
			gretzky= new Card("Wayne Gretzky", 2033);
			
			cc1= new CardCollection("Sam");	
			cc1.addCard(mcdavid);
			cc1.addCard(kane);
			cc1.addCard(ovechkin);
			cc1.addCard(subban);
			cc1.addCard(crosby);
			cc1.addCard(gretzky);
			cc1.addCard(kane);
		}
			
		@Test
		public void Test() {
				System.out.println(cc1.getCollectorName());
				System.out.println(cc1.getCards());
				System.out.println(cc1.getNumberOfCards());
				cc1.listByPlayer("PatrIck kane");
				cc1.listByYear(2033);
				cc1.findFirstPlayer("kan");
				cc1.removeCard(3);
		}
	}
