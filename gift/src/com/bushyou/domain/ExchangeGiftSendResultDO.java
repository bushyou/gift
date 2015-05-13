package com.bushyou.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExchangeGiftSendResultDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6020801353381147919L;

	private boolean sendSucc = true;

	private List<Integer> errorType;

	private List<String> errorMsg;

	public boolean isSendSucc() {
		return sendSucc;
	}

	public void setSendSucc(boolean sendSucc) {
		this.sendSucc = sendSucc;
	}

	public List<Integer> getErrorType() {
		return errorType;
	}

	public void addErrorType(Integer i) {
		if (errorType == null) {
			errorType = new ArrayList<Integer>();
		}
		errorType.add(i);
	}

	public List<String> getErrorMsg() {
		return errorMsg;
	}

	public void addErrorMsg(String errorMsgStr) {
		if (errorMsg == null) {
			errorMsg = new ArrayList<String>();
		}
		errorMsg.add(errorMsgStr);
	}

}
