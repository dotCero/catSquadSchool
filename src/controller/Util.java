package controller;

/**
 *
 * @author Alumno
 */
public class Util {

    public Util() {
    }
    
    public String validarRut(String rut, boolean format) {
        
        if(format){
            rut = rut.replace(".", "");
        }
        
        int rutAux = Integer.parseInt(rut);
        int cantidad = rut.length();
        int[] vectorNum = new int[cantidad];

        for (int i = 0; i < rut.length(); i++) {
            if (i == 0) {
                vectorNum[i] = rutAux % 10;
            } else {
                rutAux = rutAux / 10;
                vectorNum[i] = rutAux % 10;
            }
        }
        int acumulador = 0;
        int cont = 2;
        for (int i = 0; i < vectorNum.length; i++) {
            if (cont <= 7) {
                acumulador = acumulador + (vectorNum[i] * cont);
                cont++;
            } else {
                cont = 2;
                acumulador = acumulador + (vectorNum[i] * cont);
                cont++;
            }
        }
        int verificador = acumulador % 11;
        verificador = 11 - verificador;
        String veriAux;
        switch (verificador) {
            case 10:
                veriAux = "k";
                break;
            case 11:
                veriAux = "0";
                break;
            default:
                veriAux = Integer.toString(verificador);
                break;
        }
        return veriAux;
    }
}
