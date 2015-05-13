package com.bushyou.handler;

import java.util.List;

/**
 * �������ĳ���ִ����
 * @author bushe
 *
 * @param <T>
 * @param <R>
 */

public abstract class HandlerBizChain<T, R> {

	private List<Handler<T, R>> handlerList;

	public List<Handler<T, R>> getHandlerList() {
		return handlerList;
	}

	public void setHandlerList(List<Handler<T, R>> handlerList) {
		this.handlerList = handlerList;
	}
	
	/**
	 * ��T���󱻿�¡ǰ�����
	 * @param t
	 * @param r
	 */
	public void doBefore(T t, R r){
		
	}

	/**
	 * ִ��������
	 * @param t
	 * @param r
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public R handleRequest(T t, R r) throws Exception {
		List<Handler<T, R>> list = getHandlerList();
		for (Handler handler : list) {
			if (handler != null) {
				handler.doHandler(t, r);
			}
		}
		return r;
	}
	
	public void doAfter(T t, R r){
		
	}

}
