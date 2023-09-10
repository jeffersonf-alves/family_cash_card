package example.cashcard;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CashCardApplicationTest {
//    @Autowired
//    TestRestTemplate restTemplate;
//
//    @Test
//    void shouldReturnACashCardWhenDataIsSaved() {
//        ResponseEntity<String> response = restTemplate.getForEntity("/cashcards/99", String.class);
//
//        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//    }
}
