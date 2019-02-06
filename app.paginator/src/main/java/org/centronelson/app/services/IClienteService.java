package org.centronelson.app.services;

import java.util.List;
import java.util.Optional;

import org.centronelson.app.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {
	public List<Cliente> findAll();
	public Page<Cliente> findAll(Pageable pageable);
	public void save(Cliente cliente);
	public Optional<Cliente> findById(Long id);
	public void delete(Long id);
}
