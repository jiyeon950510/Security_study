package shop.mtcoding.security_app.emv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class EnvVarTest {

    @Test
    public void property_test() {
        String name = System.getProperty("meta.name");
        System.out.println(name);
    }

    @Test
    public void secret_test() {
        String key = System.getenv("HS512_SECRET");
        System.out.println("테스트 : " + key);
    }
}
