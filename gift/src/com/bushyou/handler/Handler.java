/**
 * �������߽�ɫ��
 */
package com.bushyou.handler;

/**
 * 
 * @author bushe
 *
 * @param <T>
 *            ҵ�������
 * @param <R>
 *            ҵ�����ض���
 */
public abstract class Handler<T, R> {

	public abstract void doHandler(T t, R r) throws Exception;
}
