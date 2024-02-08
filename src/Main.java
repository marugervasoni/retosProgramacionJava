//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        String palabra1 = "hola";
        String palabra2 = "mundo";


//        Aritméticos:  + - * / %
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;
        String concatenar = palabra1 + palabra2;

//        lógicos: && ||
        boolean operadorY = (num1 == 10) && (num2 == 3);
        boolean operadorO = (num1 != 10) || (num2 == 3);

//        de igualdad y relacionales: == != > >= < <=
        boolean igualdad = num1 == num2;
        boolean desigualdad = num1 != num2;
        boolean mayorQue = num1 > num2;
        boolean menorQue = num1 < num2;
        boolean mayorOIgualQue = num1 >= num2;
        boolean menorOIgualQue = num1 <= num2;

//        asignación = += -= *= /=
        int asignacion = 5;
        int asignacionCompuestaSuma = num1 += asignacion;
        int asignacionCompuestaResta = num1 -= asignacion;
        int asignacionCompuestaMultiplicacion = num1 *= asignacion;
        int asignacionCompuestaDivision = num1 /= asignacion;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(concatenar);
        System.out.println(operadorY);
        System.out.println(operadorO);
        System.out.println(igualdad);
        System.out.println(desigualdad);
        System.out.println(mayorQue);
        System.out.println(menorQue);
        System.out.println(mayorOIgualQue);
        System.out.println(menorOIgualQue);
        System.out.println(asignacion);
        System.out.println(asignacionCompuestaSuma);
        System.out.println(asignacionCompuestaResta);
        System.out.println(asignacionCompuestaMultiplicacion);
        System.out.println(asignacionCompuestaDivision);


    }
}
