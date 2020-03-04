package service.impl;

import dao.AdministratorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Administrator;
import service.AdministratorService;

import java.util.List;

@Service
public class AdministratorServiceImpl<Page> extends AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;


}
