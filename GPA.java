import java.util.Scanner;

public class GPA {
	public static void main(String[] args){
		
		double mathAct = 0;
		Scanner input = new Scanner(System.in);
		
		String math ;
		
		System.out.println("Type in your grade for each subject (ex. A+, B, D-)");
		System.out.println("Math:");
		math = input.next();
		
		if(math.equalsIgnoreCase("A+")){
			mathAct = 4.33;
		}
		else if(math.equalsIgnoreCase("A")){
			mathAct= 4;
		}
		else if(math.equalsIgnoreCase("A-")){
			mathAct = 3.66;
		}
		else if(math.equalsIgnoreCase("B+")){
			mathAct = 3.33;
		}
		else if(math.equalsIgnoreCase("B")){
			mathAct = 3;
		}
		else if(math.equalsIgnoreCase("B-")){
			mathAct = 2.66;
		}
		else if(math.equalsIgnoreCase("C+")){
			mathAct = 2.33;
		}
		else if(math.equalsIgnoreCase("C")){
			mathAct = 2;
		}
		else if(math.equalsIgnoreCase("C-")){
			mathAct= 1.66;
		}
		else if(math.equalsIgnoreCase("D+")){
			mathAct = 1.33;
		}
		else if(math.equalsIgnoreCase("D")){
			mathAct = 1;
		}
		else if(math.equalsIgnoreCase("D-")){
			mathAct= .66;
		}
		else if(math.equalsIgnoreCase("F")){
			mathAct= 0;
		}
		else{
			System.out.println("Invalid Input");
			math = input.next();
		}
		
		double sciAct = 0;
		String sci;
		System.out.println("Science:");
		sci = input.next();
		if(sci.equals("A+")){
			sciAct= 4.33;
		}
		else if(sci.equalsIgnoreCase("A")){
			sciAct = 4;
		}
		else if(sci.equalsIgnoreCase("A-")){
			sciAct = 3.66;
		}
		else if(sci.equalsIgnoreCase("B+")){
			sciAct = 3.33;
		}
		else if(sci.equalsIgnoreCase("B")){
			sciAct = 3;
		}
		else if(sci.equalsIgnoreCase("B-")){
			sciAct = 2.66;
		}
		else if(sci.equalsIgnoreCase("C+")){
			sciAct = 2.33;
		}
		else if(sci.equalsIgnoreCase("C")){
			sciAct = 2;
		}
		else if(sci.equalsIgnoreCase("C-")){
			sciAct = 1.66;
		}
		else if(sci.equalsIgnoreCase("D+")){
			sciAct = 1.33;
		}
		else if(sci.equalsIgnoreCase("D")){
			sciAct = 1;
		}
		else if(sci.equalsIgnoreCase("D-")){
			sciAct = .66;
		}
		else if(sci.equalsIgnoreCase("F")){
			sciAct = 0;
		}
		else{
			System.out.println("Invalid Input");
			sci = input.next();
		}
		
		
		double engAct=0;
		String eng;
		System.out.println("English:");
		eng = input.next();
		if(eng.equals("A+")){
			engAct = 4.33;
		}
		else if(eng.equalsIgnoreCase("A")){
			engAct = 4;
		}
		else if(eng.equalsIgnoreCase("A-")){
			engAct = 3.66;
		}
		else if(eng.equalsIgnoreCase("B+")){
			engAct = 3.33;
		}
		else if(eng.equalsIgnoreCase("B")){
			engAct = 3;
		}
		else if(eng.equalsIgnoreCase("B-")){
			engAct = 2.66;
		}
		else if(eng.equalsIgnoreCase("C+")){
			engAct = 2.33;
		}
		else if(eng.equalsIgnoreCase("C")){
			engAct = 2;
		}
		else if(eng.equalsIgnoreCase("C-")){
			engAct = 1.66;
		}
		else if(eng.equalsIgnoreCase("D+")){
			engAct = 1.33;
		}
		else if(eng.equalsIgnoreCase("D")){
			engAct = 1;
		}
		else if(eng.equalsIgnoreCase("D-")){
			engAct = .66;
		}
		else if(eng.equalsIgnoreCase("F")){
			engAct = 0;
		}
		else {
			System.out.println("Invalid Input");
		}
		double hisAct=0;
		String his;
		System.out.println("History:");
		his = input.next();
		if(his.equals("A+")){
			hisAct = 4.33;
		}
		else if(his.equalsIgnoreCase("A")){
			hisAct = 4;
		}
		else if(his.equalsIgnoreCase("A-")){
			hisAct = 3.66;
		}
		else if(his.equalsIgnoreCase("B+")){
			hisAct = 3.33;
		}
		else if(his.equalsIgnoreCase("B")){
			hisAct = 3;
		}
		else if(his.equalsIgnoreCase("B-")){
			hisAct =2.66;
		}
		else if(his.equalsIgnoreCase("C+")){
			hisAct= 2.33;
		}
		else if(his.equalsIgnoreCase("C")){
			hisAct = 2;
		}
		else if(his.equalsIgnoreCase("C-")){
			hisAct = 1.66;
		}
		else if(his.equalsIgnoreCase("D+")){
			hisAct = 1.33;
		}
		else if(his.equalsIgnoreCase("D")){
			hisAct = 1;
		}
		else if(his.equalsIgnoreCase("D-")){
			hisAct = .66;
		}
		else if(his.equalsIgnoreCase("F")){
			hisAct = 0;
		}
		else{
			System.out.println("Invalid Input");
		}
		double lanAct=0;
		String lan;
		System.out.println("Language:");
		lan = input.next();
		
		
		if(lan.equalsIgnoreCase("A+")){
			lanAct = 4.33;
		}
		else if(lan.equalsIgnoreCase("A")){
			lanAct = 4;
		}
		else if(lan.equalsIgnoreCase("A-")){
			lanAct = 3.66;
		}
		else if(lan.equalsIgnoreCase("B+")){
			lanAct = 3.33;
		}
		else if(lan.equalsIgnoreCase("B")){
			lanAct = 3;
		}
		else if(lan.equalsIgnoreCase("B-")){
			lanAct = 2.66;
		}
		else if(lan.equalsIgnoreCase("C+")){
			lanAct = 2.33;
		}
		else if(lan.equalsIgnoreCase("C")){
			lanAct = 2;
		}
		else if(lan.equalsIgnoreCase("C-")){
			lanAct = 1.66;
		}
		else if(lan.equalsIgnoreCase("D+")){
			lanAct = 1.33;
		}
		else if(lan.equalsIgnoreCase("D")){
			lanAct = 1;
		}
		else if(lan.equalsIgnoreCase("D-")){
			lanAct = .66;
		}
		else if(lan.equalsIgnoreCase("F")){
			lanAct = 0;
		}
		else{
			System.out.println("Invalid Input");
		}
		
		double eleAct=0;
		String ele;
		System.out.println("Elective:");
		ele = input.next();
		if(ele.equals("A+")){
			eleAct = 4.33;
		}
		else if(ele.equalsIgnoreCase("A")){
			eleAct = 4;
		}
		else if(ele.equalsIgnoreCase("A-")){
			eleAct = 3.66;
		}
		else if(ele.equalsIgnoreCase("B+")){
			eleAct = 3.33;
		}
		else if(ele.equalsIgnoreCase("B")){
			eleAct = 3;
		}
		else if(ele.equalsIgnoreCase("B-")){
			eleAct = 2.66;
		}
		else if(ele.equalsIgnoreCase("C+")){
			eleAct = 2.33;
		}
		else if(ele.equalsIgnoreCase("C")){
			eleAct = 2;
		}
		else if(ele.equalsIgnoreCase("C-")){
			eleAct = 1.66;
		}
		else if(ele.equalsIgnoreCase("D+")){
			eleAct = 1.33;
		}
		else if(ele.equalsIgnoreCase("D")){
			eleAct = 1;
		}
		else if(ele.equalsIgnoreCase("D-")){
			eleAct = .66;
		}
		else if(ele.equalsIgnoreCase("F")){
			eleAct = 0;
		}
		else{
			System.out.println("Invalid Input");
			
			
		}
		
		
		
	
		
	double gpa = (sciAct + mathAct + engAct + eleAct + lanAct + hisAct)/6;
	
	System.out.printf("Your gpa is %.2f\n", + gpa);	
	String s;
	
	if( gpa<3.7 && (gpa>3.0 || gpa == 3.0)){
		System.out.println("You have earned Honors");
	}
	else if(gpa > 3.7 || gpa == 3.7){
		System.out.println("You have earned Highest Honors. Congrats.");
	}
	else if((gpa> 2.7 || gpa == 2.7) && gpa< 3){
		System.out.println("You have earned Commendations");
	}
	else{
		System.out.println("Contact a local tutor.");
	
	
	}
	}
}
		

