package com.reboucas.api.cadastrodeproduto.repository;

import com.reboucas.api.cadastrodeproduto.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

}
