package dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper<Product> {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

//    custom

//    Page<ProductListOutDTO> search();
}
