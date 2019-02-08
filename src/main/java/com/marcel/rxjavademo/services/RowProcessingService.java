package com.marcel.rxjavademo.services;

import io.reactivex.Observable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Slf4j
@Service
public class RowProcessingService {
    private final FileContextService fileContextService;

    public RowProcessingService(FileContextService fileContextService) {
        this.fileContextService = fileContextService;
    }
    public void processRow(String row) {
        log.info(format("2-%s-Processing row: %s", fileContextService.getFileUuid(), row));
        Observable.just(row)
                .map(r -> r.split(","))
                .subscribe(System.out::println, Throwable::printStackTrace);;
    }

}
