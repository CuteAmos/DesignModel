package builder.simpleBuilder.product;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public void addPart(String part) {
        if (part.length() > 0) parts.add(part);
    }

    public void show() {
        if (parts.size() > 0) {
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}
