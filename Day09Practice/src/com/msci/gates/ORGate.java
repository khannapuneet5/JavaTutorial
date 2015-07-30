package com.msci.gates;

public class ORGate implements Gate{
	
	@Override
	public boolean gateOutput(boolean input1, boolean input2) {
		// TODO Auto-generated method stub
		return input1 || input2;
	}

}
