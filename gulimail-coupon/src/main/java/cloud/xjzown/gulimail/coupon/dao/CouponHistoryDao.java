package cloud.xjzown.gulimail.coupon.dao;

import cloud.xjzown.gulimail.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 23:50:37
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
