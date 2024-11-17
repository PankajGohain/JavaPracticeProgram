package package2.DesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonExample {

	public static void main(String[] args) throws Exception{
			
		Samosa s1=Samosa.getSamosa();
		
		System.out.println(s1.hashCode());
		
		//Reflection API to break singleton pattern
		//sol 1: if object is there then throw exception from inside the constructor.
		//sol 2: use enum class
		
		Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Samosa s2=constructor.newInstance();
		System.out.println(s2.hashCode());

	}

}
