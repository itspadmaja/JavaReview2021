package loopsConcept;

public class loopsPractice {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			System.out.println("Welcome");
//			i++;
//	}
		int k = 1;
		for(k=1;k<=10;k++) {
			System.out.println(k);
		}
		System.out.println("**********************");
//		for( ; ; ) {
//			System.out.println("hello");
//		}
		System.out.println();
		for(int even=0;even<=10;even=even+2) {
			System.out.println(even);
		}
		for(int odd=1;odd<=10;odd=odd+2) {
			System.out.println(odd);
		}
		System.out.println("************************************************");
		
		for(int h=1;h<=100;h++) {
			System.out.println(h);
			if(h%5==0) {
				System.out.println("helloWorld");
			}
			
		}
		System.out.println("****************************************************");
		//do-while (execute the statement at least once before starting the loop)
		int p = 1;
		do {
			System.out.println(p);
			p++;
		}
		while(p<=10);
		System.out.println("******************************************************");
		for(char c ='a';c<='z';c++) {//char incremental
			System.out.println(c);
		}
		for(byte b=1;b<=5;b++) {
			System.out.println(b);
		}
		for(double d = 1.1;d<=10;d++) {
			System.out.println(d);
		}
		System.out.println("*******************************************************");
		for(String st = "hello";st.equals("hello");) {
			System.out.println(st);
			break;
		}
		
		
	
	}

}

