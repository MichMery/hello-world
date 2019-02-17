public class Bottles_of_Beer {
	public static void main(String[] args) {
		
		System.out.println(" Hello World!!");
		System.out.println("");
	
		byte i;
		
		for(i=99;i>1;) {
			
			if (i>1) {
					System.out.println(+i+ " bottles of beer on the wall, "+i+ " bottles of beer");
					System.out.println("Take one down and pass it around - "+ --i +" bottles of beer on the wall.");
					System.out.println("");
					}
			
			if (i==2) {
				System.out.println(+i+ " bottles of beer on the wall, "+i+ " bottles of beer");
				System.out.println("Take one down and pass it around - "+ --i +" bottle of beer on the wall.");
				System.out.println("");
				}
			
			if (i==1) {
				System.out.println(+i + " bottle of beer on the wall, "+ i+ " bottle of beer");
				System.out.println("Take it down and pass it around - no more bottles of beer on the wall");
				
			}
		};
		
	}
}