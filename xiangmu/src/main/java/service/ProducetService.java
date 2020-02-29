package service;

import Dao.in.out.out.ProductListOutDTO;
import Dao.in.out.out.ProductShowOutDTO;
import in.ProductCreateInDTO;
import in.ProductUpdateInDTO;

import java.util.List;

public interface ProducetService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

//    Page<ProductListOutDTO> search(Integer pageNum);pageNum

    ProductShowOutDTO getById(Integer productId);
}
