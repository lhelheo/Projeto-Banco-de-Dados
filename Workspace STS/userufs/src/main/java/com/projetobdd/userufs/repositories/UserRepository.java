package com.projetobdd.userufs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetobdd.userufs.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer>{
	
}
