package ms.Bodega.controller;
import ms.Bodega.entity.Articulos;
import ms.Bodega.service.ArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulos")
public class ArticulosController {
   @Autowired
    ArticulosService articulosService;
   @PostMapping("/agregarArticulo")
    public Articulos agregarArticulos(@RequestBody Articulos articulos){
       return  articulosService.agregarArticulo(articulos);

   }

    @GetMapping("/obtenerTodosArticulos")
    public List<Articulos> obtenerTodosArticulos() {
        return articulosService.obtenerTodosArticulos();
    }
}
