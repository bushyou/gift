package com.bushyou.manage;

/**
 * 
 * @author bushe
 *
 * @param <T> 业务处理对象
 * @param <R> 业务处理返回对象resultDO
 */
public interface ExchangeManager<T, R> {
	void exchange(T t,R r);
}
