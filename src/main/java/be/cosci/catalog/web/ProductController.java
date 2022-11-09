package be.cosci.catalog.web;

import be.cosci.catalog.db.ProductRepository;
import be.cosci.catalog.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewProduct(@RequestParam String name, @RequestParam String price, @RequestParam String description) {
        Product n = new Product();
        n.setName(name);
        n.setPrice(Integer.parseInt(price));
        n.setDescription(description);
        productRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping
    public @ResponseBody Optional<Product> getProduct(@RequestParam String id) {
        return productRepository.findById(Integer.parseInt(id));
    }

    @PostMapping
    public @ResponseBody void deleteProduct(@RequestParam String id) {

    }
}
