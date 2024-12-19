public class Calculadora{
    public static void main(String[] args) {
        //valores predefinidos (se pueden cambiar)
        double num1=10.5;
        char operador='*';
        double num2=3.2;
        double resultado=0;
        switch (operador) {
            case '*':
                resultado=num1*num2;
                break;
        
            default:
            System.out.println("El resultado es inválido");
                return;
        }
        System.out.println("El resultado es: "+resultado);
    }
}
