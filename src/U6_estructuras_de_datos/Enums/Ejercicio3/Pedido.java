package U6_estructuras_de_datos.Enums.Ejercicio3;

public class Pedido {
    EstadoPedido estadoActual = EstadoPedido.PENDIENTE;

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        estadoActual = nuevoEstado;
        EstadoPedido.consultarEstado(estadoActual);
    }
}
