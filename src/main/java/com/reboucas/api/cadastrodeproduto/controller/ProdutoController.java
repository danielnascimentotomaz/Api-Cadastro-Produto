package com.reboucas.api.cadastrodeproduto.controller;

import com.reboucas.api.cadastrodeproduto.dto.ProdutoDto;
import com.reboucas.api.cadastrodeproduto.model.Produtos;
import com.reboucas.api.cadastrodeproduto.service.ProdutosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutosServices productosServices;


    @GetMapping("/listar")
    public ResponseEntity<List<Produtos>> listarProdutos() {
        List<Produtos> produtos = productosServices.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(produtos);

    }

    @PostMapping("/salvar")
    public ResponseEntity<Produtos> salvarProduto(ProdutoDto produtoDto) {
        Produtos produtos = productosServices.save(produtoDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtos);
    }


    @GetMapping("/buscarId{id}")
    public ResponseEntity<Produtos> buscarId(@PathVariable(name = "id") Long id) {


        return ResponseEntity.status(HttpStatus.OK).body(productosServices.findById(id));

    }


}