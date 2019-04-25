package com.lambdaschool.initial;

public class GoalieInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new GoalieImpl());
    }
}
