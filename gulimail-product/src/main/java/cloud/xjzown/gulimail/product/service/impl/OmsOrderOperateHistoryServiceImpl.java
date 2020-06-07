package cloud.xjzown.gulimail.product.service.impl;

import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cloud.xjzown.gulimail.product.dao.OmsOrderOperateHistoryDao;
import cloud.xjzown.gulimail.product.entity.OmsOrderOperateHistoryEntity;
import cloud.xjzown.gulimail.product.service.OmsOrderOperateHistoryService;


@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistoryEntity> implements OmsOrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderOperateHistoryEntity> page = this.page(
                new Query<OmsOrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OmsOrderOperateHistoryEntity>()
        );

        return new PageUtils(page);
    }

}