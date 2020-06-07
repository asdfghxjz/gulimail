package cloud.xjzown.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-07 00:15:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

