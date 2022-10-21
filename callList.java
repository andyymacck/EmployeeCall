
import java.util.Scanner;
import java.util.*;


public class callList extends employee{
	public static void main(String[] args){
		ArrayList<employee> list = new ArrayList<employee>();//sorted by seniority
		
		employee Andrew = new employee ("Andrew", 37717179, getcurrentDate());
		employee Jenn = new employee ("Jenn",99779985, getcurrentDate());
		employee Steve = new employee ("Steve",77855413 , getcurrentDate());
		employee Quinn = new employee ("Quinn", 41735413, getcurrentDate());
		employee Rachel = new employee ("Rachel",37355413, getcurrentDate());
		employee Marty = new employee ("Marty", 27855173, getcurrentDate());
		employee Warwick = new employee ("Warwick",77173413, getcurrentDate());
		employee Craig = new employee ("Craig",17376719, getcurrentDate());
		employee Shauna = new employee ("Shauna",37855414, getcurrentDate());
		employee Rick = new employee ("Rick",77855413, getcurrentDate());
		employee Anthony = new employee ("Anthony",17935615, getcurrentDate());
		employee Sarah = new employee ("Sarah",27380410, getcurrentDate());

		list.add(Andrew);
		list.add(Jenn);
		list.add(Steve);
		list.add(Quinn);
		list.add(Rachel);
		list.add(Marty);
		list.add(Warwick);
		list.add(Craig);
		list.add(Shauna);
		list.add(Rick );
		list.add(Anthony);
		list.add(Sarah);



		System.out.println("\nThis is the employee list sorted, ascending alphabetically.");
		list.sort(Comparator.comparing(employee::getName) );	//This will sort list by the name
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i).getidNumber() );	
			System.out.print("\t" + list.get(i).getName() + "\n" );//
		}
		boolean end = false;
		int input, cycles = 0;
		Scanner scanner = new Scanner(System.in);
		while (!end) {
			if (cycles < 5 ) {    // passes through 5 cycles of employee info entry
	
				System.out.println("enter your ID"); 
				input = scanner.nextInt();
			  
				for (employee n : list) {
					if (input == (n.getidNumber())) {
						System.out.println("you have accepted the work offer for" + getcurrentDate()); 
						++cycles;
					} else {
						System.out.println("ID does not match"); 
					}
				}
			} else {
				System.out.println("employee list full");
				end = true;
			}
		}
	}
}
	
	
	
	



