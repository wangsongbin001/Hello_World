package com.wangsb.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xiaosongshu on 2019/3/29.
 */
@Target(ElementType.TYPE)//注解对象是类
@Retention(RetentionPolicy.CLASS)
public @interface RouteAnnotation {
    String name();
}
