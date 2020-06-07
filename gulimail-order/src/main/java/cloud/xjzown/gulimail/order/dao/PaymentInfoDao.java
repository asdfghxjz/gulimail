package cloud.xjzown.gulimail.order.dao;

import cloud.xjzown.gulimail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-07 00:15:10
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
