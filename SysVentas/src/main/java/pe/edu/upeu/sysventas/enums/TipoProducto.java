package pe.edu.upeu.sysventas.enums;

public enum TipoProducto {
    Preparado("Preparado"),
    Producto("Producto"),
    Servicio("Servicio");

    String descripciòn;
    TipoProducto(String descripciòn){
        this.descripciòn=descripciòn;
    }
}
