package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class Fabonnaci
{
    @RequestMapping("/fabonnaci")

   public String fabonncinumber(@RequestParam ("holder") String Holder, @RequestParam ("numrange") int numrange)


    {
        int n1=1;
        int n2=2;
        int n3=3;
        int n4=4;
        int n5;
        String holder="";

        for(int i=0;i<=numrange;i++)
        {
           n5=n1+n2+n3+n4;
           n1=n2;
           n2=n3;
           n3=n4;
           n4=n5;
           holder += n5 + " ";
        }
        return numrange + holder;
    }
}
