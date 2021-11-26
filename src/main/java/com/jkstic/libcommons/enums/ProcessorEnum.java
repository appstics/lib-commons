package com.jkstic.libcommons.enums;

public enum ProcessorEnum {

	TO_START,COMPRANDO,VENDIENDO,WAIT_UP,WAIT_DOWN,PAUSE,FINALIZED;
	
	
	public static ProcessorEnum findByName(String name) {
		
		for(ProcessorEnum proce : ProcessorEnum.values()) {
			if(proce.toString().equals(name)) {
				return proce;
			}
		}
		return null;
	}
	
}
