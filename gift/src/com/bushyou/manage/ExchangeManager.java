package com.bushyou.manage;

/**
 * 
 * @author bushe
 *
 * @param <T> ҵ�������
 * @param <R> ҵ�����ض���resultDO
 */
public interface ExchangeManager<T, R> {
	void exchange(T t,R r);
}
