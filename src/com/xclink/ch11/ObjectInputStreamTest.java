package com.xclink.ch11;

public class ObjectInputStreamTest {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("aabcc");
			/*FileInputStream fs = new FileInputStream(new File("e:\\obj.txt"));
			ObjectInputStream os = new ObjectInputStream(fs);
			int a = os.readInt();
			System.out.println(a);
			
			//git
			Object obj = os.readObject();
			Person p1 = (Person) obj;
			System.out.println(p1.getName());
			System.out.println(p1.getAge());*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
