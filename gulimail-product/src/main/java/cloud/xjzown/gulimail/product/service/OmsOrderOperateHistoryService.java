package cloud.xjzown.gulimail.product.service;

import cloud.xjzown.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.gulimail.product.entity.OmsOrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:52
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

