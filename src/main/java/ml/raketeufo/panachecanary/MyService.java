package ml.raketeufo.panachecanary;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.UUID;

@ApplicationScoped
public class MyService {
    @Inject
    MyRepository myRepository;

    @Transactional
    public MyEntity create(String payload) {
        MyEntity entity = new MyEntity();
        entity.setPayload(payload);

        myRepository.persist(entity);
        return entity;
    }

    public MyEntity findById(UUID id) {
        return myRepository.findById(id);
    }
}
