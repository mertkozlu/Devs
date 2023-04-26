package Kodlama.io.Devs.wepApi.controllers;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;
    @Autowired
    public ProgrammingLanguagesController (ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getAll")
    public List<ProgrammingLanguage>getAll() {
        return programmingLanguageService.getAll();
    }
}
