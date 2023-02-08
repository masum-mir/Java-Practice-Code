package com.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class PrivateMethodOverride {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {


			Class c = Class.forName("A");
			
			Object o = c.newInstance();
			
			Method m = c.getDeclaredMethod("message", null);
			
			m.setAccessible(true);
			m.invoke(o, null);
			
		
	}

}

//class PrivateMethodOverride {
//    private void fun() {
//         System.out.println("Outer fun()");
//    }
//
//    class Inner extends PrivateMethodOverride {
//    	
//        private void fun()  {
//              System.out.println("Accessing Private Member of Outer: " );
//        }
//    }
//
//    public static void main(String args[])  {
//
//    	PrivateMethodOverride o = new PrivateMethodOverride();
//         Inner  i   = o.new Inner();
//         i.fun();
//         o = i;
//         o.fun();
//    }
//}
