package net.codejava;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ProductRepositoryTests {
 
    @Autowired
    private ProductRepository repo;
    @Autowired
    private Product po;
     
    // test methods for CRUD operations...
    @Test
    @Rollback(false)
    public void testCreateProduct() {
        po = new Product("ghf","iPhone 10",100);
        repo.save(po);
        assertThat(po.getId()).isGreaterThan(0);
    }
    @Test
    public void testFindProductByName() {
        Product product = repo.findByName("iPhone 10");    
        assertThat(product.getName()).isEqualTo("iPhone 10");
    }
}