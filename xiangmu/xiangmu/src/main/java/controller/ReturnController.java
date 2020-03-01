package controller;

import Dao.in.out.out.PageOutDTO;
import Dao.in.out.out.ReturnListOutDTO;
import Dao.in.out.out.ReturnShowOutDTO;
import in.ReturnSearchInDTO;
import in.ReturnUpdateActionInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ForkJoinTask;

@RestController
@RequestMapping("/return")
public class ReturnController {
    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
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

    @PostMapping("/cancel")
    public void cancel(@RequestBody Integer returnId){
        ForkJoinTask<V> returnService = null;
        returnService.cancel(returnId);
    }
}
