package controller;

import Dao.in.out.out.AdministratorGetProfileOutDTO;
import Dao.in.out.out.AdministratorListOutDTO;
import Dao.in.out.out.AdministratorShowOutDTO;
import Dao.in.out.out.PageOutDTO;
import in.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("administrator")
public class AdministratorController {
    @GetMapping("/logion")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false)Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @GetMapping("/resetPwd")
    public void resetPwd(@RequestParam AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer administratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }






}
