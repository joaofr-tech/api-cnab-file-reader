package com.importacao.cnab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.importacao.cnab.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
    
}
