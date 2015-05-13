package com.bushyou.handler;

import com.bushyou.domain.UserExchangeGiftDO;
import com.bushyou.manage.ExchangeManager;

public interface ExchangeBizFactory {
	ExchangeManager exchangeBean(UserExchangeGiftDO userExchangeGiftDO);
}
