package cloud.xjzown.gulimail.product.service;

import cloud.xjzown.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.gulimail.product.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:51
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

