package com.lambdaschool.initial;

public class GenericCourt implements CourtService
{
    public void display(String sport)
    {
        System.out.println("Generic " + sport + " Field");
    }
}
