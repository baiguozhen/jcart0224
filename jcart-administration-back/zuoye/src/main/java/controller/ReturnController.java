package controller;

import dto.in.ReturnSearchInDTO;
import dto.in.ReturnUpdateActionInDTO;
import dto.out.PageOutDTO;
import dto.out.ReturnListOutDTO;
import dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {
    @GetMapping("/serach")
    public PageOutDTO<ReturnListOutDTO> serach(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }
    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
