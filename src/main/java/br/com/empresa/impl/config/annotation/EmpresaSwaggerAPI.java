package br.com.empresa.impl.config.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = { java.lang.annotation.ElementType.TYPE })
public @interface EmpresaSwaggerAPI {
    String title();

    String basePath();

    String version();
}
