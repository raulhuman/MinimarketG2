package tienda.com.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

}
