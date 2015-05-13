package com.bushyou.handler;

import com.bushyou.domain.ExchangeGiftSendResultDO;
import com.bushyou.domain.UserExchangeGiftDO;

public class SendHandlerBizChain extends HandlerBizChain<UserExchangeGiftDO, ExchangeGiftSendResultDO> {

	/**
	 * 用于设置礼包兑换的开始时间以及结束时间
	 */
	@Override
	public void doBefore(UserExchangeGiftDO t, ExchangeGiftSendResultDO r) {

	}

	@Override
	public void doAfter(UserExchangeGiftDO t, ExchangeGiftSendResultDO r) {
		// 用户打标

	}

}
