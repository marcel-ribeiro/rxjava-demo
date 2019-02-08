package com.marcel.rxjavademo.configurers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class ContextInterceptorConfigurer implements WebMvcConfigurer {
    private final FileContextInterceptor fileContextInterceptor;

    public ContextInterceptorConfigurer(FileContextInterceptor fileContextInterceptor) {
        this.fileContextInterceptor = fileContextInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(fileContextInterceptor);
    }
}
