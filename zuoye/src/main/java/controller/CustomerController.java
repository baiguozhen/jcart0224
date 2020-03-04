package controller;

import dto.in.CustomerSearchInDTO;
import dto.out.CustomerListOutDTO;
import dto.out.CustomerShowOutDTO;
import dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/serach")
    public PageOutDTO<CustomerListOutDTO> serach(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }
    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
