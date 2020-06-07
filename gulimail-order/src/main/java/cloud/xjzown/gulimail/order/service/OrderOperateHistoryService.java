package cloud.xjzown.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.gulimail.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-07 00:15:10
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

