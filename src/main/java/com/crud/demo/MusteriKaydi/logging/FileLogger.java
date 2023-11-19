package com.crud.demo.MusteriKaydi.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Gönderilen Data Loglandı : " + data);
    }
}
