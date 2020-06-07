package cloud.xjzown.gulimail.product.controller;

import java.util.Arrays;
import java.util.Map;


import cloud.xjzown.common.utils.PageUtils;
import cloud.xjzown.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cloud.xjzown.gulimail.product.entity.UmsMemberReceiveAddressEntity;
import cloud.xjzown.gulimail.product.service.UmsMemberReceiveAddressService;


/**
 * 会员收货地址
 *
 * @author xjz
 * @email 330984590@qq.com
 * @date 2020-06-06 18:34:50
 */
@RestController
@RequestMapping("product/umsmemberreceiveaddress")
public class UmsMemberReceiveAddressController {
    @Autowired
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:umsmemberreceiveaddress:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberReceiveAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:umsmemberreceiveaddress:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberReceiveAddressEntity umsMemberReceiveAddress = umsMemberReceiveAddressService.getById(id);

        return R.ok().put("umsMemberReceiveAddress", umsMemberReceiveAddress);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:umsmemberreceiveaddress:save")
    public R save(@RequestBody UmsMemberReceiveAddressEntity umsMemberReceiveAddress){
		umsMemberReceiveAddressService.save(umsMemberReceiveAddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:umsmemberreceiveaddress:update")
    public R update(@RequestBody UmsMemberReceiveAddressEntity umsMemberReceiveAddress){
		umsMemberReceiveAddressService.updateById(umsMemberReceiveAddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:umsmemberreceiveaddress:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberReceiveAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
