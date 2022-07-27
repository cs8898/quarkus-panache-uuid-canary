package ml.raketeufo;

import io.quarkus.test.junit.QuarkusTest;
import ml.raketeufo.panachecanary.MyEntity;
import ml.raketeufo.panachecanary.MyService;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class MyServiceTest {

    @Inject
    MyService myService;

    private static final String PAYLOAD = "fooBar";

    @Test
    public void testPersistAndLoadByUuid() {
        MyEntity entity = myService.create(PAYLOAD);
        assertNotNull(entity);
        assertNotNull(entity.getId());
        assertEquals(PAYLOAD, entity.getPayload());


        MyEntity found = myService.findById(entity.getId());
        assertNotNull(found);
        assertEquals(PAYLOAD, found.getPayload());
    }

}