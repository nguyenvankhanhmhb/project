package vn.titv.spring.demo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.titv.spring.demo.dao.SinhVienDAOImpl;
import vn.titv.spring.demo.entity.SinhVien;

import java.sql.SQLOutput;
import java.util.Scanner;

@Configuration
public class MyConfiguration {

    @Bean
//    @Autowired
    public CommandLineRunner getRunner(SinhVienDAOImpl sinhVienDAOImpl) {
        return runner -> {
            Scanner scanner =new Scanner(System.in);
            while (true){
                intMenu();
                int luachon = scanner.nextInt();
                if(luachon==1){
                    // gọi phương thức thêm sinh viên
                    themSinhVien(sinhVienDAOImpl);

                }else if(luachon==2){
                    // gọi hàm tìm sinh viên
                    timSinhVien(sinhVienDAOImpl);
                }
            }
        };
    }

    private void timSinhVien(SinhVienDAOImpl sinhVienDAOImpl) {
        Scanner scanner =new Scanner(System.in);
        // lấy thông tin sinh viên
        System.out.println("nhập mã sinh viên:  ");
        int id = scanner.nextInt();
        SinhVien sinhVien = sinhVienDAOImpl.getByID(id);
        if(sinhVien==null){
            System.out.println("không tìm thấy !");
        }else{
            System.out.println(sinhVien);
        }

    }




    public void themSinhVien(SinhVienDAOImpl  sinhVienDAOImpl){
        Scanner scanner =new Scanner(System.in);
        // lấy thông tin sinh viên
        System.out.println("nhập họ đệm:  ");
        String ho_dem =scanner.nextLine();

        System.out.println("nhập tên:  ");
        String ten =scanner.nextLine();

        System.out.println("nhập email:  ");
        String email =scanner.nextLine();

        SinhVien sinhVien =new SinhVien(ho_dem,ten,email);
        //lưu xuống CSDL
        sinhVienDAOImpl.save(sinhVien);
    }
    public void intMenu(){
        System.out.println("=======================================\n");
        System.out.println("MENU:\n"+
                "1.thêm sinh viên:\n"+
                "2.tìm sinh viên:\n"+
                "3.xoá sinh viên:\n"+
                "LUA CHỌN :\n"


        );
}
}
