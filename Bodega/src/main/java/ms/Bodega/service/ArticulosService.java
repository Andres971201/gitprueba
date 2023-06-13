package ms.Bodega.service;

import ms.Bodega.entity.Articulos;
import ms.Bodega.repository.ArticulosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Articulos editarArticulo(Articulos articulos){
        Optional<Articulos> artOpt=articulosRepository.findById(articulos.getId());

        if(artOpt.isPresent()){
            return articulosRepository.save(articulos);
        }else{
            return null;
        }

    }
    public Optional<Articulos> buscarId(Long id){
        return articulosRepository.findById(id);
    }

}
