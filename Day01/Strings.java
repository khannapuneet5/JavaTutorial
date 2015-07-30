public class Strings{
	public static void main(String[] args){
		String str = "Mumbai";
		System.out.println("First char : " + str.charAt(0));
		System.out.println("Length : " + str.length());
		System.out.println("Last two char : " + str.substring(str.length() - 2));
		System.out.println("In CAPS : " + str.toUpperCase());
		for (int i=0; i<str.length(); i=i+2){
			if (i % 2 != 0)
				System.out.println(str.charAt(i));
		}
		String str2 = "hello how are you?";
		String[] result = str2.split(" ");
		for (int j=0; j<result.length; j++){
			System.out.println(result[j]);
		}

	}
}