package com.marcel.rxjavademo.configurers;

import com.marcel.rxjavademo.services.FileContextService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static java.lang.String.format;

@Slf4j
@Component
public class FileContextInterceptor implements HandlerInterceptor {
    private final FileContextService fileContextService;

    public FileContextInterceptor(FileContextService fileContextService) {
        this.fileContextService = fileContextService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info(format("fileContextService: %s", fileContextService));
        fileContextService.setFileUuid("TEST");
        return true;
    }
}
