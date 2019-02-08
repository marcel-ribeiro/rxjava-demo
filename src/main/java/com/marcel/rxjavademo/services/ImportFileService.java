package com.marcel.rxjavademo.services;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import org.springframework.stereotype.Service;

@Service
public class ImportFileService {

    private final FileContextService fileContextService;
    private final RowProcessingService rowProcessingService;

    public ImportFileService(FileContextService fileContextService, RowProcessingService rowProcessingService) {
        this.fileContextService = fileContextService;
        this.rowProcessingService = rowProcessingService;
    }

    public void importFile(Integer numberOfLines) {
        Flowable.range(1, numberOfLines)
            .map(line -> line + "," + fileContextService.getFileUuid())
            .subscribe(rowProcessingService::processRow, Throwable::printStackTrace);
    }

}
