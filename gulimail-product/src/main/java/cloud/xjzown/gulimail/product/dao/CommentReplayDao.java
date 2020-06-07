package cloud.xjzown.gulimail.product.dao;

import cloud.xjzown.gulimail.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:54
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
