package cloud.xjzown.gulimail.product.service;

import cloud.xjzown.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.gulimail.product.entity.UmsMemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:51
 */
public interface UmsMemberCollectSubjectService extends IService<UmsMemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

