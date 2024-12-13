package com.springboot.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")  // Cambiado a minúsculas
    private Long idContacto;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")  // Cambiado a minúsculas
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")  // Cambiado a minúsculas
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")  // Cambiado a minúsculas
    private Empleado empleado;

    // Getters y setters
    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
