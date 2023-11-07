package com.gui.minhasfinancias.service;

import com.gui.minhasfinancias.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);

}
