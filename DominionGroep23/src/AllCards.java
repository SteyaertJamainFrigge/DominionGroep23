

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllCards
 */
@WebServlet("/AllCards")
public class AllCards extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AllCards() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	// victory cards
	public class curse{
		int price = 0;
		
		int victorypoints = -1;
	}
	public class estate{
		int price = 2;
		
		int victorypoints = 1;
	}
	public class duchy{
		int price = 5;
		
		int victorypoints = 3;
	}
	public class province{
		int price = 8;
		
		int victorypoints = 6;
	}
	// treasure cards
	public class copper{
		int price = 0;
		
		int value = 1;
	}
	public class silver{
		int price = 3;
		
		int value = 2;
	}
	public class gold{
		int price = 6;
		
		int value = 3;
	}
	// action cards
	public class adventurer{
		int price = 6;
		
		String special = new String("reaveal cards untill you have 2 treasure cards , take the treasure cards and discard others");
	}
	public class ambassador{
		int price = 3;
		
		String special = new String("Reveal a card from your hand , return up to 2 copies of it from your hand to the supply. Then each other player gains a copy of it");
				
	}
	public class bureaucrat{
		int price = 4;
		
		
		String special = new String("Gain a silver card and put it on top of your deck. Each other player reveals a victory card from his hand and puts it on his deck (or reveals a hand with no victory cards");
		
	}
	public class cellar{
		int price =2;
		
		int extraactions = 1;
		String special = new String("discard any number of cards , get a new card for every discarded card");
		
	}
	public class chancellor{
		int price = 3;
		
		int extracoins = 2;
		String special = new String("put your deck in your discard pile");
	}
	public class chapel{
		int price = 2;
		
		String special = new String("trash up to 4 cards from your hand");
	}
	public class councilroom{
		int price = 5;
		
		int extracards = 4;
		int extrabuys = 1;
		
		String special = new String("each other player draws a card");
		
	}
	public class feast{
		int price = 4;
		
		String special = new String("trash this card and gain a card costing up to 5 coins");
	}
	public class festival{
		int price = 5;
		
		int extraactions = 2;
		int extrabuys = 1;
		int extracoins = 2;
	}
	public class gardens{
		int price = 4;
		
		String special = new String("get a victorypoint for every 10 cards you have");
	}
	public class laboratory{
		int price = 5;
		
		int extracards = 2;
		int extraactions = 1;
		
	}
	public class library{
		int price = 5;
		
		String special = new String("draw cards untill you have 7 in hand you can discard all action cards or keep them");
	}
	public class market{
		int price = 5;
		
		int extracards = 1;
		int extraactions = 1;
		int extrabuys = 1;
		int extracoins = 1;
	}
	public class militia{
		int price = 4;
		
		int extracoins = 2;
		String special = new String("each other player discards down to 3 cards in his hand");
	}
	public class mine{
		int price = 5;
		
		String special = new String("trash a treasure card from your hand. gain a treasure card costing up to 3 coins more");
		
	}
	public class moat{
		int price = 2;
		
		int extracards = 2;
		String special = new String("use this card to be unaffected by enemy attack cards");
		
	}
	public class moneylender{
		int price = 4;
		
		String special = new String("trash a copper card to get 3 extra coins in the buying fase");
	}
	public class remodel{
		int price = 4;
		
		String special = new String("trash a card from your hand and gain a card costing up to 2 more than the trashed card");
	}
	public class smithy{
		int price =4;
		
		int extracards = 3;
	}
	public class spy{
		int price =4;
		
		int extracards = 1;
		int extraactions = 1;
		String special = new String("each player (including you) shows the top card of their deck and you choose wether you discard it or not");
	}
	public class thief{
		int price = 4;
		
		String special = new String("each player reveals the top 2 cards of their deck and you can trash one treasure card of your choise, you then can take any of the trashed treasure cards");
	}
	public class throneroom{
		int price = 4;
		
		String special = new String("choose an action card from your hand and play it twice");
	}
	public class village{
		int price = 3;
			
		int extracards =1;
		int extraatctions = 2;
	}
	public class witch{
		int price = 5;
		
		int extracards = 2;
		String special = new String("each other player gets a curse card");
	}
	public class woodcutter{
		int price = 3;
	
		int extrabuys = 1;
		int extracoins = 2;
	}
	public class workshop{
		int price = 3;
		
		String special = new String("gain a card costing up to 4 coins");
	}
}
