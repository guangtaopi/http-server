package com.silu.dinner.database;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(value = RetentionPolicy.RUNTIME)
public @interface DataSource {

    String value();

}
