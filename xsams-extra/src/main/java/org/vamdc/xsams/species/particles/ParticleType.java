package org.vamdc.xsams.species.particles;

import org.vamdc.xsams.util.StateInterface;
import org.vamdc.xsams.util.SpeciesInterface;

/**
Autogenerated customizeable class for user's handy methods
*/
public class ParticleType extends org.vamdc.xsams.schema.ParticleType implements StateInterface,SpeciesInterface{
	
	public ParticleType(){
		super();
	}


	@Override
	public String getStateID() {
		return this.speciesID;
	}

	@Override
	public void setStateID(String stateID) {
		// TODO Auto-generated method stub
		
	}

}
