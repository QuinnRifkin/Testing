import java.util.Scanner;

public class CaesarCoDec {
	String message;
	int shift_amount;
	
	public CaesarCoDec(String m, int s){
		message = m;
		shift_amount =s;
	}
	public char shiftChar(char ch){
		int int_version = (int) ch;
		int new_intversion = int_version + shift_amount;
		
		char new_char = (char) new_intversion;
		
		return new_char;
		
	 
	}
	public char shiftCharBack(char ch){
		int int_version = (int) ch;
		int new_intversion = int_version - shift_amount;
		
		char new_char = (char) new_intversion;
		
		return new_char;
		
	}
	
	public String encode(){
		String blank = "";
		for(int i=0; i<message.length(); i++){
			System.out.print("Old:" + message.charAt(i) + " " );
			char each_char = message.charAt(i);
			char shifted_char = shiftChar(each_char);
			System.out.println("New:" + shifted_char + " ");
			
			blank =  blank + shifted_char + " " ;
		}
		return blank;
		
	}
			
	public String decode(){
		String blank = "";
		for(int i =0; i<message.length(); i++){
			System.out.print("Old:" + message.charAt(i) + " " );
			char each_char = message.charAt(i);
			char shifted_char = shiftCharBack(each_char);
			System.out.println("New:" + shifted_char + " ");
			blank = blank + shifted_char ;
		}
		return blank;
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("type a message that you wish to encrypt or an encryped message you wish to decrypt");
		String message;
		Scanner ask0 = new Scanner (System.in);
		message= ask0.nextLine();
				
		CaesarCoDec codec = new CaesarCoDec( message, 1);
		String ans;
		System.out.println("Do you want to encode or decode a message?");
		Scanner ask = new Scanner (System.in);
		ans = ask.nextLine();
		if(ans.equalsIgnoreCase("encode")){
			System.out.println(message);
			System.out.println(codec.encode());
			
		}
		else if(ans.equalsIgnoreCase("decode")){
			System.out.println(message);
			System.out.println(codec.decode());
		}
		
		
		
	}

}
