package com.easylife.easyapi.repository;

import com.easylife.easyapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByNome(String username);

    Optional<Usuario> findByEmail(String email);
}
