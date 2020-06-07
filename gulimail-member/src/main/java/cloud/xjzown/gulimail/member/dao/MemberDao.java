package cloud.xjzown.gulimail.member.dao;

import cloud.xjzown.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-07 00:02:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
