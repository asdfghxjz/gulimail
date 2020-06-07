package cloud.xjzown.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-07 00:02:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

