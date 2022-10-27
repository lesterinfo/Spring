package com.platzi.platzimarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer IdProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer IdCategoria;

    @Column(name = "codigo_barras")
    private String CodigoBarras;

    @Column(name = "precio_venta")
    private Double PrecioVenta;

    @Column(name = "cantidad_stock")
    private Integer CantidadStock;

    private boolean estado;

    public Integer getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Integer idProducto) {
        IdProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        CodigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        PrecioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        CantidadStock = cantidadStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
