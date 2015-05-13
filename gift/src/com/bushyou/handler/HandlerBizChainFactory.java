package com.bushyou.handler;

import com.bushyou.domain.UserExchangeGiftDO;

/**
 * �򵥹��������ӿڣ��������͵ĸ���id������ȡ�����������Է�
 * 
 * @author bushe
 * 
 */
public interface HandlerBizChainFactory {
	// ���͸��� ���� handler.context.xml �е����õ����͸�����Ҫ�ߵ�ҵ���߼���
	HandlerBizChain createSendHandlerBizChain(UserExchangeGiftDO userExchangeGiftDO);

	// �һ����� ����handler.context.xml �����õĶһ�������Ҫ�ߵ�ҵ���߼���
	HandlerBizChain exchangeHandlerBizChain(UserExchangeGiftDO userExchangeGiftDO);
}
