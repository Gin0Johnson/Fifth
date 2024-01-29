package Reflectionapi;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Guru99VariableMetaDataTest {
	public static void main(String[] args) throws IllegalArgumentException,
	IllegalAccessException { 
	
		Guru99VariableMetaData x= new Guru99VariableMetaData(); 
	Class c = x.getClass();
	
	Field[] y= c.getDeclaredFields();
	
	for(Field f : y) { 
	System.out.println("Variable name : "+f.getName());
	System.out.println("Datatypes of the variable :"+f.getType());
	int s = f.getModifiers();
	System.out.println("Access Modifiers of the variable :"+Modifier.toString(s));
	System.out.println("Value of the variable : "+f.get(x));
	System.out.println();
	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **") ;
	}
	}

}
