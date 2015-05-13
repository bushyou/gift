package com.bushyou.manage;

import java.util.List;

import com.bushyou.domain.ExchangeGiftDO;
import com.bushyou.domain.ExchangeGiftQuery;

public interface ExchangeGiftManager {
	/**
	 * ������ select exchange_gift
	 * 
	 * @author ���� Date 2015-04-01
	 */
	public List<ExchangeGiftDO> getExchangeGiftList(ExchangeGiftQuery exchangeGiftQuery);

	/**
	 * ������ select count exchange_gift
	 * 
	 * @author ���� Date 2015-04-01
	 */
	public Integer getExchangeGiftCount(ExchangeGiftQuery exchangeGiftQuery);

	/**
	 * ������ insert into exchange_gift
	 * 
	 * @author ���� Date 2015-04-01
	 */
	public Long insertExchangeGift(ExchangeGiftDO exchangeGiftDO);

	/**
	 * ������ update exchange_gift
	 * 
	 * @author ���� Date 2015-04-01
	 */
	public Integer updateExchangeGift(ExchangeGiftDO exchangeGiftDO);
}
