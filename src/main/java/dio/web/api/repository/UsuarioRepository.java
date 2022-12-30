package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getId()==null){
           System.out.println("SAVE - Recebendo o usuário na camada do reposiório");
        }
        else {
            System.out.println("UPDATE - Recebendo o usuário na camada do repositório");
        }
        System.out.println(usuario.toString());}


    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para escluir o usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando todos os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Gleyson", " password"));
        usuarios.add(new Usuario("Biel", " masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("gleyson", "password");
    }
}


