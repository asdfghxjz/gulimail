package cloud.xjzown.gulimail.product.dao;

import cloud.xjzown.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
