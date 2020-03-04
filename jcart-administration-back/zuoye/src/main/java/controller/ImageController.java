package controller;

import constant.ClientExceptionConstant;
import exception.ClientException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Array;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/image")
@CrossOrigin
public class ImageController {
    private List<String> imageExts= Array.asList("jps","jpge","png");

    @PostMapping("/upload")
    public String upload(MultipartFile image) throws IOException, ClientException {
        String originalFilename = image.getOriginalFilename();
        String[] splits=originalFilename.split("\\.");
        String ext=splits[splits.length -1];
        ext=ext.toLowerCase();
        boolean contains=imageExts.contains(ext);
        if (!contains){
            throw new ClientException(ClientExceptionConstant.IMAGE_INVALID_ERRMSG,
                    ClientExceptionConstant.IMAGE_INVALID_ERRMSG);
        }
        String uuid= UUID.randomUUID().toString();
        String filename=String.format("%s.%s",uuid,ext);
        String fileepth=String.format("www/image/%s",filename);
        try(FileOutputStream out=new FileOutputStream(fileepth)){
            byte[] data=image.getBytes();
            out.write(data);
        }
        return filename;
    }
}
