package com.platzi.platzimarket.persistence;

import com.platzi.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzi.platzimarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //Indicando a Sprint que esta es la clase en interactuar con la BD
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    //QUERY METHOD
    public List<Producto> getByIdCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByASC(idCategoria);
    }

    public Optional<List<Producto>> gerEscasos(int CantidadStock){
    //public Optional<List<Producto>> gerEscasos(int CantidadStock, boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(CantidadStock,true);
        //return productoCrudRepository.findByCantidadStockLessThanAndEstado(CantidadStock,estado);
    }

    public Optional<Producto> getProducto(int IdProducto){
      return productoCrudRepository.findById(IdProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int IdProducto){
        productoCrudRepository.deleteById(IdProducto);
    }

}
