package io.github.cursodsousa.msclients.infra.repository;

import io.github.cursodsousa.msclients.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    Optional<Cliente> findByCpf(String cpf);
}
