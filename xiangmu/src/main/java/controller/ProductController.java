package controller;

import Dao.in.out.out.PageOutDTO;
import Dao.in.out.out.ProductListOutDTO;
import Dao.in.out.out.ProductShowOutDTO;
import in.ProductCreateInDTO;
import in.ProductSearchInDTO;
import in.ProductUpdateInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNUm){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){

    }

}
