package com.msci.ex1;

import java.util.ArrayList;
import java.util.List;

public class ClassApplication {
	private Class cls;
	
	public ClassApplication(String className) throws ClassNotFoundException{
		cls = Class.forName(className);
	}
	public boolean isClass(){
		return !cls.isInterface() && !cls.isEnum();
	}
	public boolean isInterface(){
		return cls.isInterface();
	}
	public boolean isEnum(){
		return cls.isEnum();
	}
	
	public String getSuperClass(){
		Class superclass = cls.getSuperclass();
		return superclass == null ? "null" : superclass.getName();
	}
	public List<String> getInterfaces(){
		List<String> interfaces = new ArrayList<String>();
		for (Class interfaceCls : cls.getInterfaces()){
			interfaces.add(interfaceCls.getName());
		}
		return interfaces;
	}
		
}
