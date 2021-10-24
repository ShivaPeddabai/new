package main;
import Singleton.*;
import Factory.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternTesting
{

    @Test
    public void FactoryTesting()
    {
        CarpetFactory teaFactory=new CarpetFactory();

        Carpet tea=teaFactory.getCarpet("White");


        assertEquals(tea instanceof WhiteCarpet,true);
    }
}

