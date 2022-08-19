package controller;


import com.blogpessoal.blogpessoal56.Service.UsuarioService;
import com.blogpessoal.blogpessoal56.blog.repository.UsuarioRepository;
import com.blogpessoal.blogpessoal56.model.Usuario;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @BeforeAll()
    void start(){
        usuarioRepository.deleteAll();
    }

    @Test
    @Order(1)
    @DisplayName("Cadastrar um usuario")
    public void mustCreateOneUser(){
        HttpEntity<Usuario> request = new HttpEntity<Usuario>(new Usuario(0L, "Nicolas Alves", "https://i.imgur.com/Ue5leOy.jpeg","nicolas@test.com", "nicolas123" ));

        ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);

        assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
        assertEquals(request.getBody().getNome(), resposta.getBody().getNome());
        assertEquals(request.getBody().getFoto(), resposta.getBody().getFoto());
        assertEquals(request.getBody().getUsuario(), resposta.getBody().getUsuario());
    }

    @Test
    @Order(2)
    @DisplayName("Não deve duplicar o Usuario")
    public void mustNotDumpUser(){
        usuarioService.cadastrarUsuario(new Usuario(0L, "Lucas Santos", "https://i.imgur.com/Ue5leOy.jpeg","santos@test.com", "santos123" ));

        HttpEntity<Usuario> request = new HttpEntity<Usuario>(new Usuario(0L, "Lucas Santos", "https://i.imgur.com/Ue5leOy.jpeg","santos@test.com", "santos123" ));

        ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);

        assertEquals(HttpStatus.BAD_REQUEST, resposta.getStatusCode());
    }

    @Test
    @Order(3)
    @DisplayName("Atualizar usuario")
    public void mustUptadeUser(){
        Optional<Usuario> usuarioCreate = usuarioService.cadastrarUsuario(new Usuario(0L, "Kleber Machado", "https://i.imgur.com/Ue5leOy.jpeg","klebin@test.com", "machado123" ));

        Usuario usuarioUptade = new Usuario(usuarioCreate.get().getId(), "Kleber Machado", "https://i.imgur.com/Ue5leOy.jpeg","klebin@test.com", "machado123");

        HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioUptade);

        ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("root", "root").exchange("/usuarios/atualizar", HttpMethod.PUT, request, Usuario.class);

        assertEquals(HttpStatus.OK, resposta.getStatusCode());
        assertEquals(request.getBody().getNome(), resposta.getBody().getNome());
        assertEquals(request.getBody().getFoto(), resposta.getBody().getFoto());
        assertEquals(request.getBody().getUsuario(), resposta.getBody().getUsuario());

    }

    @Test
    @Order(4)
    @DisplayName("Listar todos os usuarios")
    public void mustShowAllUsers(){
        usuarioService.cadastrarUsuario(new Usuario(0L, "Luquinhas 157", "https://i.imgur.com/Ue5leOy.jpeg","lukinha157@test.com", "lukinhas157"));

        usuarioService.cadastrarUsuario(new Usuario(0L, "Joao 157", "https://i.imgur.com/Ue5leOy.jpeg","Joao157@test.com", "Joao157"));

        ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("root", "root").exchange("/usuarios/all", HttpMethod.GET, null, String.class);


        assertEquals(HttpStatus.OK, resposta.getStatusCode());
    }
}
