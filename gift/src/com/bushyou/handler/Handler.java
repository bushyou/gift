/**
 * 抽象处理者角色类
 */
package com.bushyou.handler;

/**
 * 
 * @author bushe
 *
 * @param <T>
 *            业务处理对象
 * @param <R>
 *            业务处理返回对象
 */
public abstract class Handler<T, R> {

	public abstract void doHandler(T t, R r) throws Exception;
}
