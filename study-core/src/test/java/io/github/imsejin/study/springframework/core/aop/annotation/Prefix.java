package io.github.imsejin.study.springframework.core.aop.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Prefix {

    String value() default "";

}