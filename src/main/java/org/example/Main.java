package org.example;

public class Main {
    public static void main(String[] args) {
        Ikperson Person1= new Ikperson();
        Person1.PersonelAdi="Ayşe";
        Person1.PersonelSoyadi="Can";
        Person1.PersonelMail="aysecan@gmail.com";
        Person1.PersonelTelefon="905396711213";
        Person1.PersonelNumber=256755;
        Person1.PersonelMaas=37000;
        Person1.Personellistesi();

        Ikperson Person2= new Ikperson();
        Person2.PersonelAdi="Kaan";
        Person2.PersonelSoyadi="Şanlı";
        Person2.PersonelMail="kaansanli@gmail.com";
        Person2.PersonelTelefon="905396711415";
        Person2.PersonelNumber=256856;
        Person2.PersonelMaas=50000;
        Person2.Personellistesi();


    }
}