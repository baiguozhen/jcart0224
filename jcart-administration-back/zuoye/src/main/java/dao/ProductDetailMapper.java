package dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDetailMapper<ProductDetail> {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);

//    custom

    int batchDelete(@Param("productIds") List<Integer> productIds);
}
