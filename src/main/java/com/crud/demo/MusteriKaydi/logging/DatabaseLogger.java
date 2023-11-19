package com.crud.demo.MusteriKaydi.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Gönderilen Data Veritabanı'na Loglandı : " + data);
    }
}
