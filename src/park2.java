
import javax.swing.JOptionPane;
import java.lang.invoke.SwitchPoint;

public class park2 {

    public static void main(String[] args) {

        String placa;
        String nombre;
         double hora, resta, multi, horasalida;
        int tipo;
        int moto = 1;
        int carro = 2;


        JOptionPane.showMessageDialog(null, "Parqueadero pepe \n" +
                "Valor hora o fraccion\n" +
                "Carro : 2000$ ---- Moto: 1000$ \n");

        nombre = JOptionPane.showInputDialog("Digite su nombre");
        placa = JOptionPane.showInputDialog("Digite su placa");
        hora = Double.parseDouble(JOptionPane.showInputDialog("Digite su hora de entrada"));

        JOptionPane.showMessageDialog(null, "PARQUEADERO pepe\n " +
                "Valor hora o fraccion\n " +
                "Carro: 2000 ---- Moto: 1000 \n" +
                "El nombre del cliente es : " + nombre + "\n" +
                "La placa es : " + placa + "\n" +
                "Hora entrada : " + hora + "\n ");

        horasalida = Double.parseDouble(JOptionPane.showInputDialog("Digite la hora de la salida"));

        resta = horasalida - hora;

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si es Carrro y 2 si es Moto"));

       /* if (tipo == moto) {
            multi = Math.ceil(resta) * 2000;

            JOptionPane.showMessageDialog(null, "PARQUEADERO pepe \n " +
                    "Valor hora o fraccion \n " +
                    "Carro: 2000 ---- Moto: 1000 \n" +
                    "El nombre del cliente es : \n" + nombre +
                    "La placa es : " + placa + "\n" +
                    "Hora de entrada : " + hora + "\n" +
                    "Hora salida : " + horasalida + "\n" +
                    "Valor a pagar :" + multi + "\n" +
                    "===========================================\n");
        }
        else {

            multi = Math.ceil(resta) * 1000;
            JOptionPane.showMessageDialog(null, "PARQUEADERO pepe \n " +
                    "Valor hora o fraccion \n " +
                    "Carro: 2000 ---- Moto: 1000 \n" +
                    "El nombre del cliente es : \n" + nombre +
                    "La placa es : " + placa + "\n" +
                    "Hora de entrada : " + hora + "\n" +
                    "Hora salida : " + horasalida + "\n" +
                    "Valor a pagar :" + multi + "\n" +
                    "===========================================\n");
        }*/

        switch (tipo) {
            case 1:
                multi = Math.ceil(resta) * 2000;

                JOptionPane.showMessageDialog(null,
                        "PARQUEADERO PEPE \n " +
                        "Valor hora o fraccion \n " +
                        "Carro: 2000 ---- Moto: 1000 \n" +
                        "El nombre del cliente es : \n" + nombre +
                        "La placa es : " + placa + "\n" +
                        "Hora de entrada : " + hora + "\n" +
                        "Hora salida : " + horasalida + "\n" +
                        "Valor a pagar :" + multi + "\n");
                break;
            case 2:
                multi = Math.ceil(resta) * 1000;
                JOptionPane.showMessageDialog(null
                        "PARQUEADERO PEPE \n " +
                        "Valor hora o fraccion \n " +
                        "Carro: 2000 ---- Moto: 1000 \n" +
                        "El nombre del cliente es : " + nombre + "\n " +
                        "La placa es : " + placa + "\n" +
                        "Hora de entrada : " + hora + "\n" +
                        "Hora salida : " + horasalida + "\n" +
                        "Valor a pagar :" + multi + "\n");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion que puso no existe");
        }

        }
}


