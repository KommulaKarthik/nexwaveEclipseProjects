import java.util.HashMap;

public class GenericsType<T> {
		 
    public GenericsType() {
    	
	}

	private T obj;
     
    public T get(){
        return obj;
    }
     
    public void set(T t1){
        obj=t1;
    }
     
    public static void main(String args[  ]){
    	    	    	
        GenericsType<String> type = new GenericsType<String>();        
        type.set("pankaj");        
        String str = type.get();    //No type casting required.        
        System.out.println(str);
         
        GenericsType type1 = new GenericsType();   //raw type. In place of 'T' Object will be used.  
        type1.set("Pankaj");   //valid
        type1.set(10);    //valid and autoboxing support
        Integer i = (Integer)type1.get();    //type casting, error prone and can cause ClassCastException 
        System.out.println(i);                
    }
}
