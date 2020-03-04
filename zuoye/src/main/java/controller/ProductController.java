package controller;

import Dao.in.out.out.ProductShowOutDTO;
import dto.in.ProductCreateInDTO;
import dto.in.ProductSearchInDTO;
import dto.in.ProductUpdateInDTO;
import dto.out.PageOutDTO;
import dto.out.ProductListOutDTO;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProducetService;

import java.util.List;

@RestController
@RequestMapping("/produce")
@CrossOrigin
public class ProductController<Page> {
    @Autowired
    private ProducetService producetService;

    @GetMapping("/serach")
    public PageOutDTO<ProductListOutDTO> serach(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false,defaultValue = "1")Integer pageNum){
        Page page= (Page) producetService.toString(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO=new PageOutDTO<>();
//        pageOutDTO.setTotal(page.getTotal());
//        pageOutDTO.setPageSize(page.getClass());
            return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer produceId){
        Dao.in.out.out.ProductShowOutDTO productShowOutDTO=producetService.getById(produceId);
        return productShowOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId=producetService.create(productCreateInDTO);
        return productId;

    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        producetService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        producetService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        producetService.batchDelete(productIds);
    }

}
