package cloud.xjzown.gulimail.order.dao;

import cloud.xjzown.gulimail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-07 00:15:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
