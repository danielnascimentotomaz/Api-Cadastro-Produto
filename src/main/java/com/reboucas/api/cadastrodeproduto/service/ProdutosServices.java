package com.reboucas.api.cadastrodeproduto.service;

import com.reboucas.api.cadastrodeproduto.dto.ProdutoDto;
import com.reboucas.api.cadastrodeproduto.model.Produtos;
import com.reboucas.api.cadastrodeproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosServices  implements IProdutoServices
{

    @Autowired
    private ProdutoRepository produtosRepository;


    @Override
    public List<Produtos> findAll() {
        return produtosRepository.findAll();


    }

    @Override
    public Produtos findById(Long id) {

        Produtos produtos = produtosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        return produtos;

    }

    @Override
    public Produtos save(ProdutoDto produtoDto) {

        Produtos produtos = new Produtos();
        produtos.setNome(produtoDto.getNome());
        produtos.setDescricao(produtoDto.getDescricao());
        produtos.setPreco(produtoDto.getPreco());
        produtos.setQuantidade(produtoDto.getQuantidade());

        produtosRepository.save(produtos);

        return produtos;
    }

    @Override
    public void delete(Long id) {

    }
}
