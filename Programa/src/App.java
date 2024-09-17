import javax.swing.JOptionPane;

public class App {
    private static double a, b;
    public static void main(String[] args) throws Exception {
        String operacion = " ";
        ingresarNumeros();

       char operador = ingresarOperador();

       if(operador == '+'){
        operacion = "suma";
       }else if(operador == '-'){
        operacion = "resta";
       }

       JOptionPane.showMessageDialog(null, "Operacion: "+operacion+"\nEl resultado es: "+ operarAritmeticamente(a, operador, b),  "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }

    private static void ingresarNumeros() {
        boolean isValidNumbers = false;
        do {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el numero a: "));
                b = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el numero b: ")); 
                isValidNumbers = true;   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (!isValidNumbers);
        
    }

    private static char ingresarOperador() {
        char operador = ' ';
        boolean isValidOperator = false;
        do {
            
            try {
                operador =  (JOptionPane.showInputDialog(null, "Introduzca un operador: ")).charAt(0);

                if((operador == '+')||(operador == '-')||(operador=='*')||(operador=='/')){
                  isValidOperator = true;
                }else{
                 JOptionPane.showMessageDialog(null, "Introduzca un operador", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Introduzca un operador valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
          

        } while (!isValidOperator);

            return operador;
    }


    private static double operarAritmeticamente (double a, char operador, double b) {
        double resultado = 0D;
        if(operador=='+'){
            //Realizar suma
            resultado = a + b;
        }else if(operador == '-'){
            //Realizar resta
            resultado = a - b;
        }else if(operador == '*'){
            //Realizar multiplicacion
            resultado = a * b;
        }else if(operador == '/'){
            //Realizar division
            resultado = a / b;
        }

        return resultado;
    }

}
