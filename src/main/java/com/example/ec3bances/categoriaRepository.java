package com.example.ec3bances;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface categoriaRepository extends PagingAndSortingRepository<categoria, Integer>,CrudRepository<categoria, Integer> {
    
    List<categoria> findByNombre(@Param("nombre") String nombre);

}