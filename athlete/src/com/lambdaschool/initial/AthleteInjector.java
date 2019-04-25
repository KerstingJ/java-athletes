package com.lambdaschool.initial;

public class AthleteInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new AthleteImpl());
    }
}
