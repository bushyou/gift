package com.bushyou.handler;

import com.bushyou.domain.ExchangeGiftSendResultDO;
import com.bushyou.domain.UserExchangeGiftDO;

public class SendHandlerBizChain extends HandlerBizChain<UserExchangeGiftDO, ExchangeGiftSendResultDO> {

	/**
	 * ������������һ��Ŀ�ʼʱ���Լ�����ʱ��
	 */
	@Override
	public void doBefore(UserExchangeGiftDO t, ExchangeGiftSendResultDO r) {

	}

	@Override
	public void doAfter(UserExchangeGiftDO t, ExchangeGiftSendResultDO r) {
		// �û����

	}

}
