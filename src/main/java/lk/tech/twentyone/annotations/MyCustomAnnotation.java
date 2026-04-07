package lk.tech.twentyone.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.PACKAGE,
ElementType.TYPE_USE, ElementType.RECORD_COMPONENT})
public @interface MyCustomAnnotation {

    String description();
    int version() default 1;
}
