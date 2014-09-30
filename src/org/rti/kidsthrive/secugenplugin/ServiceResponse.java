package org.rti.kidsthrive.secugenplugin;

import org.json.JSONObject;

public class ServiceResponse extends JSONObject {
	
	private JSONObject scannerPayload;
	private String serviceMessage;
	
	public JSONObject getScannerPayload() {
		return scannerPayload;
	}
	public void setScannerPayload(JSONObject scannerPayload) {
		this.scannerPayload = scannerPayload;
	}
	public String getServiceMessage() {
		return serviceMessage;
	}
	public void setServiceMessage(String serviceMessage) {
		this.serviceMessage = serviceMessage;
	}
	
	

}
