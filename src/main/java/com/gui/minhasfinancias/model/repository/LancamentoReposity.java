package com.gui.minhasfinancias.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gui.minhasfinancias.model.entity.Lancamento;

public interface LancamentoReposity extends JpaRepository<Lancamento, Long> {

}
