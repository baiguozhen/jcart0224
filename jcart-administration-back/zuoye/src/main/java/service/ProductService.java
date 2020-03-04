package service;

import dto.in.ProductCreateInDTO;
import dto.in.ProductUpdateInDTO;
import dto.out.ProductListOutDTO;
import dto.out.ProductShowOutDTO;

import java.util.List;


public class ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO) {
               return null;

    }

    void update(ProductUpdateInDTO productUpdateInDTO) {
    }

    void delete(Integer productId) {

    }

    void batchDelete(List<Integer> productIds) {

    }

//    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId) {
        return null;
    }
}
