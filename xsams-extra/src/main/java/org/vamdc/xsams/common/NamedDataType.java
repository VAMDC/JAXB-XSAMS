package org.vamdc.xsams.common;

/**
Autogenerated customizeable class for user's handy methods
*/
public class NamedDataType extends org.vamdc.xsams.schema.NamedDataType {
	
	public NamedDataType(){
		super();
	}

	public NamedDataType(String name, Double value, String units){
		super();
		this.setName(name);
		this.setValue(new ValueType(value,units));
	}
	
}

