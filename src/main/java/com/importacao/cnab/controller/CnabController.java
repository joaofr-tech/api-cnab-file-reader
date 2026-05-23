package com.importacao.cnab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.importacao.cnab.model.Transacao;
import com.importacao.cnab.service.CnabService;



@RestController
@RequestMapping("/cnab")
public class CnabController {
    
    @Autowired
    private CnabService cnabService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Arquivo vazio");
        }

        cnabService.arquivoProcessar(file);
        return ResponseEntity.ok("Arquivo processado");
    }

    @GetMapping("/trasacao")
    public List<Transacao> getMethodNlistarTransacoes() {
        return cnabService.listarTransacoes();
    }
    
    
}
