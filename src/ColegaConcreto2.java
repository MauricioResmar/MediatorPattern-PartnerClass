public class ColegaConcreto2 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto2, envio un mensaje");
        mediator.reenvia(this);
    }
}
