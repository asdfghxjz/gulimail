package cloud.xjzown.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.gulimail.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 23:50:36
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

