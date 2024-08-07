package vn.titv.demo.demo63.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
    //files thuộc tính
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  id;

    @Column(name ="ho_dem",length = 45)
    private String hoDem;



    @Column(name ="ten", length = 45)
    private String ten;
    @Column(name ="email",length = 45)
    private String email;


    //constructor
    public SinhVien() {

    }

    public SinhVien(String hoDem, String ten, String email) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.email = email;
    }

    public SinhVien(int id, String hoDem, String ten, String email) {
        this.id = id;
        this.hoDem = hoDem;
        this.ten = ten;
        this.email = email;
    }
    //getter/ setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //tostring in thông tin bên trong đối tượng

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", hoDem='" + hoDem + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
