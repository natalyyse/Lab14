package com.tecsup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.model.Producto;


@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
