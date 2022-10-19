package string;

public class CONCAT_usingStringBUILDER {

	public static void main(String[] args) {

		StringBuilder s1 = new StringBuilder("good ");
		
		StringBuilder s2 = new StringBuilder("night");

		StringBuilder s3= s1.append(s2);
		
		System.out.println(s3);

		
		
		
	}

}
