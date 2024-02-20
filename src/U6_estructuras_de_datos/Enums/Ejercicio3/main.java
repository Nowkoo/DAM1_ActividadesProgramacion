package U6_estructuras_de_datos.Enums.Ejercicio3;

public class main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        p1.cambiarEstado(EstadoPedido.valueOf("PENDIENTE"));
        p1.cambiarEstado(EstadoPedido.PROCESANDO);
        p1.cambiarEstado(EstadoPedido.ENVIADO);
        p1.cambiarEstado(EstadoPedido.ENTREGADO);
    }
}
