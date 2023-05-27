// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner; 
public class MoneyHeist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i = 0; 
		System.out.println ("$$$||  Welcome to Money Heist - The Experience Game  ||$$$");
		System.out.println ("CHOOSE YOUR PLAYER (Tokyo, Nairobi, Denver):");
		String PLAYER = input.nextLine();
		System.out.println ("Welcome " + PLAYER + "! The professor has been awaiting your arrival:) Please take your belongings and type \"go\" to join your friends at the Royal Mint of Spain to be part of the BIGGEST HEIST IN HISTORY!!!");
		Boolean game2Win = false;
		Boolean gameWin = false;
		do 
		{
			System.out.print("Action: ");
			String ACTION = input.next();
			ACTION = ACTION.toUpperCase();

			if (ACTION.equals("GO"))
			{
				System.out.println ("You have now entered the Royal Mint.");
				System.out.println ("||Berlin: \"Hi "+ PLAYER + "! Let's get straight to work.What would you like to you do?\"\n1-Feed the hostages\n2-Print the money\n3-Escape");
			}

			// 1. Feed the hostages
			if (ACTION.equals("1"))
			{
				System.out.println("||You: \"Hostages make a single file line and take one box of food each.\"\nA hostage is not eating any food.");
				System.out.println("type \"talk\" if you want to talk to the hostage, type \"ignore\" if you want to ignore:");
				String CHOICE = input.next();
				if (CHOICE.equals("IGNORE"))
				{
					System.out.println("The hostage has fallen ill and now you are in trouble!\n|| Berlin: \"The professor said to TAKE CARE of the hostages!!!! I can't trust you anymore, I have no choice but to kick you out.\"");
					ACTION = "GO";
					
				}
				if (CHOICE.equals("talk"))
				{
					System.out.println("|| You: \"Why are you not eating your food?\"\n|| Hostage: \"I am not feeling well. I want to rest inside.\"");
					System.out.println("type \"allow\" if you want to allow the hostage to rest, otherwiser type \"ignore\" if you want to ignore: ");
					CHOICE = input.next();
					CHOICE = CHOICE.toUpperCase();
				}
				if (CHOICE.equals("ALLOW"))
				{
					System.out.println("The hostage is well rested now. Good Job!");
					ACTION = "GO";
				}
				
			}

			// 2. Print the money 
			if (ACTION.equals("2"))
			{

				String PASSWORDS [] = {"salvador dali", "time", "sergio marquina" };
				String passwordMask [] = {"******** ****", "****", "****** ********"};
				String HINTS [] = {"Spanish Surrealist painter and inspiration for their masks", "the key component to the plan and their success", "the real name for the mastermind behind the plan"};

				int passNum = (int)((3)* Math.random() + 0);//(high - low +1) * Math.random () +low  allows us to adjust it
				System.out.println("You proceed to the printing room but the door is locked. You check your pockets to find the password but you LOST IT! "
						+ "\nYou look around and find a clue \"" + HINTS[passNum] +"\"\n");
				System.out.println(passwordMask[passNum]);

				String password = PASSWORDS[passNum];

				// Unlimited chances to get the password right
				while (game2Win == false)
				{
					System.out.println("Enter your guess: ");
					String wordGuess = input.nextLine();

					if (wordGuess.equals(password) == true)
					{
						System.out.println("Correct!");
						game2Win = true; 
						ACTION = "go";
					}
					else if  (game2Win != true)
					{
						System.out.println("Wrong Password! Try again!");
					} 
				}
			}
			// 3. Escape
			if (ACTION.equals("3"))
			{
				System.out.println ("|| The police are planning to break into the Royal Mint! You need to dig the tunnel to escape. Type \"dig\" to dig the hole.");
				String PERSON [] = {"||\t O\t||","||\t<|>\t||", "||   $$ / \\ $$ \t|| ", "||$$$$$$$$$$$$$$||"} ;
				
				for (int s= 0; s<4; s++)
				{
					System.out.print("Do:");
					String dig = input.next();
				    System.out.println(PERSON[s]);
				}
				System.out.println("Congratulations " + PLAYER + "! You have succeeded in the robbery!");
				gameWin = true;
			}

		} while (gameWin!= true );

		input.close();
	}

}

