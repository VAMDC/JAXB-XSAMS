package org.vamdc.xsams.cases;

import org.vamdc.xsams.cases.nltos.QNs;
import org.vamdc.xsams.util.QuantumNumber;
import org.vamdc.xsams.util.StateCore;
import org.vamdc.xsams.util.QuantumNumber.QNType;

public class CaseNLTOS 
	extends org.vamdc.xsams.cases.nltos.Case{

	public CaseNLTOS(StateCore state){
		super();
		//Set ID
		this.caseID="nltos";
		
		//Attach quantum numbers
		this.qNs = new QNs();
		
		//Fill in quantum numbers
		//Electronic state label
		qNs.setElecStateLabel(state.getElecState());
		//Electronic symmetries
		if (state.checkQNum(QNType.elecSym))
			qNs.setElecSym(new  SymmetrySpeciesType(
					state.getQNumByType(QNType.elecSym)));
		qNs.setElecInv(state.getQNumStrValueByType(QNType.elecInv));

		//S
		qNs.setS(state.getQNumValueByType(QNType.S));
		//N
		qNs.setN(state.getQNumIntValueByType(QNType.N));
		
		//Vibration
		for (QuantumNumber qn: state.getQNumsByType(QNType.V)){
			switch (qn.getModeIndex()){
			case 1:
				qNs.setV1(qn.getIntValue());
			case 2:
				qNs.setV2(qn.getIntValue());
			case 3:
				qNs.setV3(qn.getIntValue());
			}
		}
		
		//J
		qNs.setJ(state.getQNumValueByType(QNType.J));
		
		//Ka
		qNs.setKa(state.getQNumIntValueByType(QNType.Ka));
		//Kc
		qNs.setKc(state.getQNumIntValueByType(QNType.Kc));
		
		//intermediate angular momentum Fi
		for (QuantumNumber qn: state.getQNumsByType(QNType.Fi)){
			switch (qn.getModeIndex()){
			case 1:
				qNs.setF1(new NuclearSpinAMType(qn));
			case 2:
				qNs.setF2(new NuclearSpinAMType(qn));
			}
		}
		
		//intermediate angular momentum F
		//F
		if (state.checkQNum(QNType.F))
			qNs.setF(new NuclearSpinAMType(
					state.getQNumByType(QNType.F)));
		//R
		for (QuantumNumber qn: state.getQNumsByType(QNType.R)){
			qNs.getRS().add(new RankingType(qn));
		}
		
		//parity
		qNs.setParity(state.getQNumStrValueByType(QNType.Parity));
		
		//asSym
		qNs.setAsSym(state.getQNumStrValueByType(QNType.AsSym));
		
	}
}
