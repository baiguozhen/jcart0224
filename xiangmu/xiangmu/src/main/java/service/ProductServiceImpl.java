package service;

import Dao.in.out.out.ProductShowOutDTO;
import in.ProductCreateInDTO;
import in.ProductUpdateInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProducetService{

    @Autowired
//    private ProductMapper






    @Override
    public Integer create(ProductCreateInDTO productCreateInDTO) {
        return null;
    }

    @Override
    public void update(ProductUpdateInDTO productUpdateInDTO) {

    }

    @Override
    public void delete(Integer productId) {

    }

    @Override
    public void batchDelete(List<Integer> productIds) {

    }

    @Override
    public ProductShowOutDTO getById(Integer productId) {
        return null;
    }
}
