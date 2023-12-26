package com.example.task3;

public class Main {

    public static void main(String[] args)
    {
        String url1 = "https://cms.ucu.edu.ua/";
        CompanyData company1 = PDLReader.getCompanyInfo(url1);
        System.out.println(company1);

        String url2 = "https://github.com/";
        CompanyData company2 = PDLReader.getCompanyInfo(url2);
        System.out.println(company2);

        String url3 = "https://leetcode.com/";
        CompanyData company3 = PDLReader.getCompanyInfo(url3);
        System.out.println(company3);

        String url4 = "https://www.youtube.com/";
        CompanyData company4 = PDLReader.getCompanyInfo(url4);
        System.out.println(company4);

        String url5 = "https://refactoring.guru/";
        CompanyData company5 = PDLReader.getCompanyInfo(url5);
        System.out.println(company5);
    }
}

