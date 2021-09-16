package com.ruoyi.system.product.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.product.mapper.FeiyanProductMapper;
import com.ruoyi.system.product.domain.FeiyanProduct;
import com.ruoyi.system.product.service.IFeiyanProductService;
import com.ruoyi.common.core.text.Convert;

/**
 * 产品展示Service业务层处理
 * 
 * @author liyunfei
 * @date 2021-09-15
 */
@Service
public class FeiyanProductServiceImpl implements IFeiyanProductService 
{
    @Autowired
    private FeiyanProductMapper feiyanProductMapper;

    /**
     * 查询产品展示
     * 
     * @param id 产品展示主键
     * @return 产品展示
     */
    @Override
    public FeiyanProduct selectFeiyanProductById(Long id)
    {
        return feiyanProductMapper.selectFeiyanProductById(id);
    }

    /**
     * 查询产品展示列表
     * 
     * @param feiyanProduct 产品展示
     * @return 产品展示
     */
    @Override
    public List<FeiyanProduct> selectFeiyanProductList(FeiyanProduct feiyanProduct)
    {
        return feiyanProductMapper.selectFeiyanProductList(feiyanProduct);
    }

    /**
     * 新增产品展示
     * 
     * @param feiyanProduct 产品展示
     * @return 结果
     */
    @Override
    public int insertFeiyanProduct(FeiyanProduct feiyanProduct)
    {
        feiyanProduct.setCreateTime(DateUtils.getNowDate());
        return feiyanProductMapper.insertFeiyanProduct(feiyanProduct);
    }

    /**
     * 修改产品展示
     * 
     * @param feiyanProduct 产品展示
     * @return 结果
     */
    @Override
    public int updateFeiyanProduct(FeiyanProduct feiyanProduct)
    {
        feiyanProduct.setUpdateTime(DateUtils.getNowDate());
        return feiyanProductMapper.updateFeiyanProduct(feiyanProduct);
    }

    /**
     * 批量删除产品展示
     * 
     * @param ids 需要删除的产品展示主键
     * @return 结果
     */
    @Override
    public int deleteFeiyanProductByIds(String ids)
    {
        return feiyanProductMapper.deleteFeiyanProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品展示信息
     * 
     * @param id 产品展示主键
     * @return 结果
     */
    @Override
    public int deleteFeiyanProductById(Long id)
    {
        return feiyanProductMapper.deleteFeiyanProductById(id);
    }
}
