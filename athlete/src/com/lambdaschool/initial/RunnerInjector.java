package com.lambdaschool.initial;

public class RunnerInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new RunnerImpl());
    }
}
