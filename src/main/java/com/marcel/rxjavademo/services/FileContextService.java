package com.marcel.rxjavademo.services;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Data
@Service
//@Scope(WebApplicationContext.SCOPE_REQUEST)
public class FileContextService {
    private String fileUuid;
}
