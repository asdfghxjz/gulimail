package cloud.xjzown.gulimail.product.service.impl;

import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cloud.xjzown.gulimail.product.dao.OmsPaymentInfoDao;
import cloud.xjzown.gulimail.product.entity.OmsPaymentInfoEntity;
import cloud.xjzown.gulimail.product.service.OmsPaymentInfoService;


@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfoEntity> implements OmsPaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsPaymentInfoEntity> page = this.page(
                new Query<OmsPaymentInfoEntity>().getPage(params),
                new QueryWrapper<OmsPaymentInfoEntity>()
        );

        return new PageUtils(page);
    }

}