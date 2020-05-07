package com.example.AOPdemo.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//track performance on only methods
@Target(ElementType.METHOD)

//calculate during run time
@Retention(RetentionPolicy.RUNTIME)


public @interface TrackTime {

}
