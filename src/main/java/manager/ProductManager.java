package manager;

import com.example.smart_sales_manager.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductManager {

    private static ProductManager instance;
    private static final Logger logger = LoggerFactory.getLogger(ProductManager.class);

    private ProductManager() {}

    public static ProductManager getInstance() {
        if (instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        logger.info("Ürün eklendi → İsim: {}, Fiyat: {}, Tür: {}",
                product.getName(), product.getPrice(), product.getType());
    }
}
