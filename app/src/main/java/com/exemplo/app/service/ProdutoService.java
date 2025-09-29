package com.exemplo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.app.model.Produto;
import com.exemplo.app.repository.ProdutoRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class ProdutoService {
    
    @Autowired
    private final ProdutoRepository produtoRepository;


    // GET


    public List<Produto> listarTodosProdutos() {
        return (List<Produto>) produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id);
    }


    // POST


    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }


    // DELETE


    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }


    // PUT


    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        return produtoRepository.findById(id)
                .map(produto -> {
                    produto.setNome(produtoAtualizado.getNome());
                    produto.setQuantidade(produtoAtualizado.getQuantidade());
                    produto.setPreco(produtoAtualizado.getPreco());
                    return produtoRepository.save(produto);
                })
                .orElseGet(() -> {
                    produtoAtualizado.setId(id);
                    return produtoRepository.save(produtoAtualizado);
                });
    }


}

