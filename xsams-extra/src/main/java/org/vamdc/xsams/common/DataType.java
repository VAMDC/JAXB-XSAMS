package org.vamdc.xsams.common;

import org.vamdc.xsams.schema.AccuracyType;
import org.vamdc.xsams.common.ValueType;

/**
Autogenerated customizeable class for user's handy methods
*/
public class DataType extends org.vamdc.xsams.schema.DataType {
	
	public DataType(){
		super();
	}

	/**
	 * Handy constructor
	 * @param value
	 * @param units
	 * @param accuracy
	 * @param comments
	 */
	public DataType(Double value,String units, AccuracyType accuracy, String comments){
		super();
		this.setValue(new ValueType(value,units));
		this.getAccuracies().add(accuracy);
		this.setComments(comments);
	}
	
	public DataType(Double value,String units){
		super();
		this.setValue(new ValueType(value,units));
	}
	
}

