package arrayConcept;

public class StaticArray {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		int l = i.length;
		System.out.println(l);
		//i[4]=50;//ArrayIndexOutofBoundsException
		//i[-1]=60;//No reverse indexing
		//Static Array stores uses only similar data values
		//2 limitations for static array = size is fixed, and stores only similar type of data, to overcome this issue, use dynamic Array (ArrayList),Object Static Array 
		//to print all the values of array, use for loop
		for(int n=0;n<l;n++) {
			System.out.println(i[n]);
		}
		System.out.println("*****************************");
		for(int p=0;p<=l-1;p++) {
			System.out.println(i[p]);
		}
		System.out.println("**********************************");
		//for each loop
		for(Integer e : i) {
			System.out.println(e);
		}
		//double Array
		double d[] = new double[3];
		d[0]=12.2;
		d[1]=22.22;
		d[2]=100;
		for(Double k : d) {
			System.out.println(k);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		for(double s=0;s<d.length;s++) {
			System.out.println(d.length);
			System.out.println(d[(int) s]);
		}
		char c[] = new char[2];
		//String Array
		String student[] = new String[3];
		student[0]="Rama";
		student[1]="Seetha";
		student[2]="Krishna";
		
		for(int x=0;x<student.length;x++) {
			System.out.println(student[x]);
		}
		for(String e : student) {
			System.out.println(e);
		}
		//Object Array(Object Array is super class of all Arrays
		System.out.println("*********************");
		Object ob[] = new Object[5];
		ob[0] = "SeethaRama";
		ob[1] = 25;
		ob[2] = 'M';
		ob[3] = 12.22;
		ob[4] = true;
		
		for(Object emp : ob) {
			System.out.println(emp);
		}
		for(int h=0;h<ob.length;h++) {
			System.out.println(ob[h]);
		}
		
		
		
	
		
		
		
		
		
	}

}
