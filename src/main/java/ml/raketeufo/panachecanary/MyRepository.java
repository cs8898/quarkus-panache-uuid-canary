package ml.raketeufo.panachecanary;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class MyRepository implements PanacheRepositoryBase<MyEntity, UUID> {
}
