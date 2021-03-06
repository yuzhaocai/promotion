package yike.example.service.condition;

import java.util.List;

import org.springframework.stereotype.Service;

import yike.bo.PromotionRuleBO;
import yike.dto.CartCustomerDTO;
import yike.dto.CartStockDTO;
import yike.example.constants.PromotionConstants;

/**
 * 包邮
 * @author Administrator
 *
 */
@Service
public class PostFeeOtherConditionService implements IPromotionRuleOtherService {

	@Override
	public Boolean filterByOtherRule(PromotionRuleBO promotionRule, CartCustomerDTO cartCustomerContext, List<CartStockDTO> promotionContext) {
		return true;
	}

	@Override
	public Long lockStock(PromotionRuleBO promotionRule, CartCustomerDTO cartCustomerContext, List<CartStockDTO> promotionContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean useStock(Long orderId, Long promotionStockId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String promotionRuleType() {
		return PromotionConstants.PROMOTION_RULE_TYPE_FREE_POSTFEE + "";
	}

}
