package com.platzi.platzimarket.persistence.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Column(name = "id_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCompra;

    @Column(name = "id_cliente")
    private String IdCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String MedioPago;

    private String comentario;
    private String estado;

    //Relaciones
    @JoinColumn(name = "id_cliente" , insertable = false, updatable = false)
    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    public Integer getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(Integer idCompra) {
        IdCompra = idCompra;
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String idCliente) {
        IdCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return MedioPago;
    }

    public void setMedioPago(String medioPago) {
        MedioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
