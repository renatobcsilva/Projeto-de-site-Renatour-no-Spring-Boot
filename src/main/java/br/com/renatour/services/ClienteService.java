package br.com.renatour.services;

import java.util.List;


import br.com.renatour.model.Cliente;

public interface ClienteService {

    public Cliente saveCliente(Cliente cliente);
    public List<Cliente> getAllClientes();
    public Cliente getClienteById(Long id);
    public void deleteClienteById(Long id);
    public void updateCliente(Cliente cliente);

}