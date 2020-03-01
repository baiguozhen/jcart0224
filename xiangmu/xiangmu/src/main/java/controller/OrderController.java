package controller;

import Dao.in.out.out.*;
import in.OrderSearchInDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getList")
    public <Page> PageOutDTO<OrderListOutDTO> getList(
            @RequestAttribute Integer customerID
    ){
        Page orderService = null;
        PageOutDTO<OrderListOutDTO> pageOutDTO=new PageOutDTO<OrderListOutDTO>();
        pageOutDTO.setTotal(pageOutDTO.getTotal());
        pageOutDTO.setPageSize(pageOutDTO.getPageSize());
        pageOutDTO.setPageNum(pageOutDTO.getPageNum());
        pageOutDTO.setList(pageOutDTO);
        return null;
    }

}
