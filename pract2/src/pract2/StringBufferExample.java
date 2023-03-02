package pract2;

public class StringBufferExample {
	
	
	
	
	public static void main(String args[]){  
		
		//StringBuffer Class append() Method
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		
		
		//StringBuffer insert() Method
		
		StringBuffer p=new StringBuffer("Hello ");  
		p.insert(1,"Java");//now original string is changed  
		System.out.println(p);//prints HJavaello  
		
		
		
		
		//StringBuffer replace() Method
		
		StringBuffer q=new StringBuffer("Hello");  
		q.replace(1,3,"Java");  
		System.out.println(q);//prints HJavalo 
		
		
		
		
		//StringBuffer delete() Method
		
		StringBuffer r=new StringBuffer("Hello");  
		r.delete(1,3);  
		System.out.println(r);//prints Hlo 
		
		
		//StringBuffer reverse() Method
		
		StringBuffer t=new StringBuffer("Hello");  
		t.reverse();  
		System.out.println(t);//prints olleH 
		
		
		//StringBuffer Capacity
		
		StringBuffer u=new StringBuffer();  
		System.out.println(u.capacity());//default 16  
		u.append("Hello");  
		System.out.println(u.capacity());//now 16  
		u.append("java is my favourite language");  
		System.out.println(u.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  

		
		
		
		//StringBuffer ensureCapacity() method
		
		StringBuffer v=new StringBuffer();  
		System.out.println(v.capacity());//default 16  
		v.append("Hello");  
		System.out.println(v.capacity());//now 16  
		v.append("java is my favourite language");  
		System.out.println(v.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		v.ensureCapacity(10);//now no change  
		System.out.println(v.capacity());//now 34  
		v.ensureCapacity(50);//now (34*2)+2  
		System.out.println(v.capacity());//now 70
		
		
		
		
		
		
		}  

}
