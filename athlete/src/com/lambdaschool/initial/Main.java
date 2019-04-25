package com.lambdaschool.initial;

public class Main
{

    public static void main(String[] args)
    {
//        MyApplication myAthlete = new MyApplication();
//        myAthlete.create("Track");
//        myAthlete.create("Hockey");
//        myAthlete.create("Rugby");

        AthleteCreationInjector injector;
        Processor app;

        injector = new RunnerInjector();
        app = injector.getProcess();
        app.create("Track");

        injector = new GoalieInjector();
        app = injector.getProcess();
        app.create("Hockey");

        injector = new AthleteInjector();
        app = injector.getProcess();
        app.create("Rugby");

        injector = new AthleteInjector();
        app = injector.getProcess();
        app.create("Baseball");



    }
}
