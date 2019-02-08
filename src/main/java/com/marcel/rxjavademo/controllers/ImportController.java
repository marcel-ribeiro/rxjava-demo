package com.marcel.rxjavademo.controllers;

import com.marcel.rxjavademo.services.FileContextService;
import com.marcel.rxjavademo.services.ImportFileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportController {
    private final ImportFileService importFileService;

    public ImportController(ImportFileService importFileService) {
        this.importFileService = importFileService;
    }

    @GetMapping("import/{fileUuid}/{numberOfLines}")
    public void importFile(@PathVariable("fileUuid") String fileUuid, @PathVariable("numberOfLines") Integer numberOfLines){
        importFileService.importFile(numberOfLines);

    }
}
