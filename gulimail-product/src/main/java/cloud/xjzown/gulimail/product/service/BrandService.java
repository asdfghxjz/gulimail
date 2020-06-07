package cloud.xjzown.gulimail.product.service;

import cloud.xjzown.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.gulimail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:55
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

