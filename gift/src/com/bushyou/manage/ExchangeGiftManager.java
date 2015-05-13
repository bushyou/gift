package com.bushyou.manage;

import java.util.List;

import com.bushyou.domain.ExchangeGiftDO;
import com.bushyou.domain.ExchangeGiftQuery;

public interface ExchangeGiftManager {
	/**
	 * √Ë ˆ£∫ select exchange_gift
	 * 
	 * @author ≤ª…· Date 2015-04-01
	 */
	public List<ExchangeGiftDO> getExchangeGiftList(ExchangeGiftQuery exchangeGiftQuery);

	/**
	 * √Ë ˆ£∫ select count exchange_gift
	 * 
	 * @author ≤ª…· Date 2015-04-01
	 */
	public Integer getExchangeGiftCount(ExchangeGiftQuery exchangeGiftQuery);

	/**
	 * √Ë ˆ£∫ insert into exchange_gift
	 * 
	 * @author ≤ª…· Date 2015-04-01
	 */
	public Long insertExchangeGift(ExchangeGiftDO exchangeGiftDO);

	/**
	 * √Ë ˆ£∫ update exchange_gift
	 * 
	 * @author ≤ª…· Date 2015-04-01
	 */
	public Integer updateExchangeGift(ExchangeGiftDO exchangeGiftDO);
}
