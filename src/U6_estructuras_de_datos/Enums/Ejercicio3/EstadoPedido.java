package U6_estructuras_de_datos.Enums.Ejercicio3;

public enum EstadoPedido {
    PENDIENTE, PROCESANDO, ENVIADO, ENTREGADO;

    public static void consultarEstado(EstadoPedido e) {
        switch (e) {
            case PENDIENTE:
                System.out.println("El pedido está esperando a ser atendido");
                break;
            case PROCESANDO:
                System.out.println("El pedido está siendo procesado");
                break;
            case ENVIADO:
                System.out.println("El pedido está de camino");
                break;
            case ENTREGADO:
                System.out.println("El pedido ha llegado a su destino");
                break;
        }
    }
}
