package cloud.xjzown.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.gulimail.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 23:50:35
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

