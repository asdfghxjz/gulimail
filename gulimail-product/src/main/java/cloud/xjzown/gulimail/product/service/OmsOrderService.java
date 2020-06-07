package cloud.xjzown.gulimail.product.service;

import cloud.xjzown.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.gulimail.product.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:53
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

