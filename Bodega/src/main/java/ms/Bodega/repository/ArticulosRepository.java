package ms.Bodega.repository;
import ms.Bodega.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticulosRepository extends JpaRepository<Articulos,Long> {

}
