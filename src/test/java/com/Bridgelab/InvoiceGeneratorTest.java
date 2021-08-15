package com.Bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    void givenDistanceAndTime_ShouldReturnFare(){
        InvoiceGeneretor invoiceGeneretor = new InvoiceGeneretor();
        double distance =2.0;
        int time =5;
        double fare = invoiceGeneretor.caclulateFare(distance,time);
        Assertions.assertEquals(25 ,fare,0.0);
    }

    @Test
    public  void  givenLessDistanceOrTime_SholudReturnMinFare() {
        InvoiceGeneretor invoiceGeneretor = new InvoiceGeneretor();
        double distance = 0.1;
        int time =1 ;
        double fare = invoiceGeneretor.caclulateFare(distance,time);
        Assertions.assertEquals(5 , fare ,0.0);

    }

}
