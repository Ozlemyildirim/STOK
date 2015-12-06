package com.vektorel.DerbyOrnek;

import com.vektorel.entity.Skart;
import com.vektorel.service.SkartService;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        SkartService skartService = new SkartService();
        Skart k= new Skart();
     
        k.setTanım("ABCD");
        k.setKod("DEFG");
      
        k.setBarkod(Long.MIN_VALUE);
        k.setBirimFiyat(Long.MIN_VALUE);
        
        k.setGelistarihi(new Date(1,1,1945));
        skartService.save(k);
        
        
        List<Skart> list =skartService.getAll(Skart.class);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());    
        }

        System.out.println("Kaydedildi");
    }
}
