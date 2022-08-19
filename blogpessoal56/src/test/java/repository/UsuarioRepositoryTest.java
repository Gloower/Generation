package repository;

import com.blogpessoal.blogpessoal56.blog.repository.UsuarioRepository;
import com.blogpessoal.blogpessoal56.model.Usuario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @BeforeAll
    void start(){
        usuarioRepository.deleteAll();

        usuarioRepository.save(new Usuario(0L, "Lucas Silva", "https://i.imgur.com/Ue5leOy.jpeg", "lucas@teste.com", "lucas@123"));
        usuarioRepository.save(new Usuario(0L, "Pedro Silva", "https://i.imgur.com/Ue5leOy.jpeg", "lucas@teste2.com", "lucas@1233"));
        usuarioRepository.save(new Usuario(0L, "Joao Silva", "https://i.imgur.com/Ue5leOy.jpeg", "lucas@teste3.com", "lucas@1243"));
        usuarioRepository.save(new Usuario(0L, "Kleber Silva", "https://i.imgur.com/Ue5leOy.jpeg", "lucas@teste4.com", "lucas@1263"));

    }

    @Test
    @DisplayName("Retornar apenas 1 usuario")
    public void mustReturnOneUser(){

        Optional<Usuario> usuario = usuarioRepository.findByUsuario("lucas@teste.com");
        assertTrue(usuario.get().getUsuario().equals("lucas@teste.com"));
    }

    @Test
    @DisplayName("Retornar 3 usuarios")
    public void mustReturThreeUsers(){
        List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Silva");
        assertEquals(3, listaDeUsuarios.size());
        assertTrue(listaDeUsuarios.get(0).getNome().equals("Lucas Silva"));
        assertTrue(listaDeUsuarios.get(0).getNome().equals("Pedro Silva"));
        assertTrue(listaDeUsuarios.get(0).getNome().equals("Joao Silva"));
    }
}
