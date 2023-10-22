package com.reboucas.api.cadastrodeproduto.service;

import com.reboucas.api.cadastrodeproduto.dto.ProdutoDto;
import com.reboucas.api.cadastrodeproduto.model.Produtos;

import java.util.List;

public interface IProdutoServices {

    List<Produtos> findAll();
    Produtos findById(Long id);
    Produtos save(ProdutoDto produtoDto);
    void delete(Long id);




}
