package ms.Bodega.service;

import ms.Bodega.entity.Articulos;
import ms.Bodega.repository.ArticulosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticulosService {
    @Autowired
    ArticulosRepository articulosRepository;
    public Articulos agregarArticulo(Articulos articulo){
        return  articulosRepository.save(articulo);
    }
    public List<Articulos> obtenerTodosArticulos() {
        return articulosRepository.findAll();
    }
}
