package com.lambdaschool.initial;

public class MyApplication implements Processor
{
    private AthleteService athlete;
    private CourtService court;

    public MyApplication(AthleteService athlete)
    {
        this.athlete = athlete;
        this.court = new GenericCourt();
    }

    public MyApplication(AthleteService athlete, CourtService court)
    {
        this.athlete = athlete;
        this.court = court;
    }

    public void create(String sport)
    {
        System.out.println("************");
        athlete.display(sport);
        court.display(sport);
        System.out.println("************\n");
    }

}
