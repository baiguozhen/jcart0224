package controller;

import Dao.in.out.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }
    @PostMapping("/create")
    public <AddressCreateInDTO> Integer create (AddressCreateInDTO addressCreateInDTO,
                                                @RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/update")
    public <AddressUpdateInDTO> void update(AddressUpdateInDTO addressUpdateInDTO,
                                            @RequestAttribute Integer
                                            custoer){

    }


    @PostMapping
    public void delete(@RequestBody Integer addressId){

    }

}
