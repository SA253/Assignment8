package assignment;
import java.util.*;

public class insertdynamic {
	List<String>e1 ;
	List<String>e2 ;
 public insertdynamic(){
	 e1 = new ArrayList<String>();
	 e2 = new ArrayList<String>();
 }
	public static void main(String[] args) {
		int option =0;
		int n,n1;
		String e =null;
		String a =null;
		Scanner s = new Scanner(System.in);
		insertdynamic m = new insertdynamic();
		do {
			System.out.println("menu");
			System.out.println("1 arraylist");
			System.out.println("2 insert");
			System.out.println("3 retrive");
			System.out.println("4 search ");
			System.out.println("5 sort ");
			System.out.println("6 shuffle");
			System.out.println("7 reverse");
			System.out.println("8 compare");
			System.out.print("\noption>");
			option = s.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter the  no of elements in the array");
				n = s.nextInt();
				System.out.println("enter the elements ");
				for(int i=0;i<n;i++)
				{
				   e= s.next();
					m.add(e);
					
				}
                m.print();
				break;
			case 2:
				System.out.println("enter the inserted  elements in the array");
				e= s.next();
				m.insert(e);
				m.print();
				break;
				
			case 3:
				System.out.println("enter the retrive  element in the array");
				n= s.nextInt();
				m.retrive(n);
				break;
				
			case 4:
				System.out.println("enter the search  element in the array");
				e = s.next();
				m.search(e);
				break;
				
			case 5:
				System.out.println("sort the  elements in the array");
				m.sort(e);
				break;
				
			case 6:
				System.out.println("shuffle the  elements in the array");
				m.shuffle(e);
				break;
			case 7:
				System.out.println("reverse the  elements in the array");
				m.reverse(e);
				break;
				
			case 8:
				System.out.println("enter the  no of elements in the array");
				n1= s.nextInt();
				System.out.println("enter the elements ");
				for(int i=0;i<n1;i++)
				{
				   a= s.next();
					m.add1(a);
				}
				
				System.out.println("reverse the  elements in the array");
				m.compare();
				break;
				
			
			case 9:
				System.out.println("exiting..");
				break;
			}
		}while(option!=-1);
		s.close();
		}
	public void print() {
		for(String i:e1)
			System.out.println(i);
	}
	public void add(String e) {
		e1.add(e);
	}
	public void add1(String a) {
		e2.add(a);
	}
	
	public void insert(String e) {
		e1.add(0,e);
		
		
	}
	public void retrive(int n) {
		
		String k = e1.get(n);   /* for retriving the element*/
		System.out.println(k);
		
	}
	public void search(String e) {
	boolean f = e1.contains(e); /* for searching the element*/
	if(f)
		System.out.println("contains search element");
	else
		System.out.println("doesnot contains search element");
	}
	public void sort(String e) {
	Collections.sort(e1);  /* for sorting ascending the element*/
	System.out.println("after sorting"+e1);
	}
	public void shuffle(String e) {
		Collections.shuffle(e1); /*shuffle*/
		System.out.println("after shuffle"+e1);
	}
	public void reverse(String e) {
	Collections.reverse(e1);       /* for reversing the array*/
	System.out.println("reversing the list"+e1);
	}
	public void compare() {
	boolean isequal = e1.equals(e2);
	if(isequal)
		System.out.println("two array list are equal");
	else
		System.out.println("two array list are not equal");	
	}
}


