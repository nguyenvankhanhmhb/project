package vn.titv.spring.demo55;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Calculator myCalulator;


    @Autowired
    public Controller(@Qualifier("getCalculator") Calculator myCalulator){
        this.myCalulator = myCalulator;
    }
    @GetMapping("/canBacHai")
    public String tinhCanBacHai(@RequestParam("value") double x ){
       return "SQRT ("+x+") = " + myCalulator.canBacHai(x);
    }
    @GetMapping("/binhPhuong")
    public String tinhBinhPhuong(@RequestParam("value") double x ){
        return " ("+x+"^2) = " + myCalulator.binhPhuong(x);
    }
}
