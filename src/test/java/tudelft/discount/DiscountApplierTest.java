package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void applyDiscount() {
        Product business = new Product("A4 sheets", 10, "BUSINESS");
        Product home = new Product("potatoes", 10, "HOME");

        ProductDao mockDao = Mockito.mock(ProductDao.class);
        List<Product> results = Arrays.asList(business, home);
        Mockito.when(mockDao.all()).thenReturn(results);

        DiscountApplier discounter = new DiscountApplier(mockDao);
        discounter.setNewPrices();

        Assertions.assertEquals(11D, business.getPrice());
        Assertions.assertEquals(9D, home.getPrice());
    }
}
