package com.bushyou.handler;

import java.util.List;

/**
 * 责任链的抽象执行类
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
	 * 在T对象被克隆前会调用
	 * @param t
	 * @param r
	 */
	public void doBefore(T t, R r){
		
	}

	/**
	 * 执行责任链
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
