package com.gui.minhasfinancias.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gui.minhasfinancias.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
