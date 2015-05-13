package com.bushyou.handler;

import com.bushyou.domain.UserExchangeGiftDO;

/**
 * 简单工厂方法接口，根据赠送的福袋id，来获取赠送责任链对方
 * 
 * @author bushe
 * 
 */
public interface HandlerBizChainFactory {
	// 赠送福袋 返回 handler.context.xml 中的配置的赠送福袋需要走的业务逻辑簇
	HandlerBizChain createSendHandlerBizChain(UserExchangeGiftDO userExchangeGiftDO);

	// 兑换福袋 返回handler.context.xml 中配置的兑换福袋需要走的业务逻辑簇
	HandlerBizChain exchangeHandlerBizChain(UserExchangeGiftDO userExchangeGiftDO);
}
