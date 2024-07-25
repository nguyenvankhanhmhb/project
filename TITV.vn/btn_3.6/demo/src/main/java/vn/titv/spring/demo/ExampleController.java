package vn.titv.spring.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String index(){
        return "HELLO";
    }
    @GetMapping("/H2")
    public String H2(){
        return "H2 TÔI LÀ NGUYENX VĂN KHÁNH DV20A" +"<br/>" +
                "TRƯỜNG ĐH GIAO THÔNG VẬN TẢI  ";
    }
}
