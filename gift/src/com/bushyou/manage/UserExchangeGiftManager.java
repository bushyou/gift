package com.bushyou.manage;

import java.util.List;

import com.bushyou.domain.ExchangeGiftSendResultDO;
import com.bushyou.domain.UserExchangeGiftDO;
import com.bushyou.domain.UserExchangeGiftQuery;

public interface UserExchangeGiftManager {
	/**
	 * ������ select user_exchange_gift
	 * 
	 * @author ���� Date 2015-04-02
	 */
	public List<UserExchangeGiftDO> getExchangeGiftList(
			UserExchangeGiftQuery userExchangeGiftQuery);

	/**
	 * ������ select count user_exchange_gift
	 * 
	 * @author ���� Date 2015-04-02
	 */
	public Integer getExchangeGiftCount(
			UserExchangeGiftQuery userExchangeGiftQuery);

	/**
	 * ������ insert into user_exchange_gift
	 * 
	 * @author ���� Date 2015-04-02
	 */
	// public Long insertExchangeGift(UserExchangeGiftDO userExchangeGiftDO);

	/**
	 * ������ update user_exchange_gift
	 * 
	 * @author ���� Date 2015-04-02
	 */
	public ExchangeGiftSendResultDO updateExchangeGift(
			UserExchangeGiftDO userExchangeGiftDO);
}
