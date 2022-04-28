package pantalla1;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
public class MetodoNumEc {

	double a,b,c;
	double x1=0,x2=0;
	//este metodo se encarga de recibir las variables necesarias para determinar la ecuacion cuadratica
	
	public  MetodoNumEc(double a,double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
		public void calc(double a, double b, double c) {
		if(a==0) {
			throw new ArithmeticException("El elemento introducido a no puede ser cero"); 
		}
		else {
		double discriminante=pow(b,2)- 4* a * c;
		if (discriminante >= 0) {
            if (discriminante == 0) {
                double x = -b / (2 * a);
                //System.out.printf("La raíz única es %.3f%n", x);
                //solo cuando hay una sola raiz
                x1 =x;
                x2 =x;
                
            } else {
                
                x1 = (-b + sqrt(discriminante)) / (2 * a);
                x2 = (-b - sqrt(discriminante)) / (2 * a);
                /*
                System.out.printf("La raíz real x1 es %.3f%n", x1);
                System.out.printf("La raíz real x2 es %.3f%n", x2);
                */ 
                
                /* 
                 * cuando las raices si tienen 2 puntos 
                 * */
            }
        } else {
            double parteReal, parteImaginaria;
            discriminante = abs(discriminante);
            parteReal = -b / (2 * a);
            parteImaginaria = sqrt(discriminante) / (2 * a);
            
            //devolver cuando son imaginarias 
            /*
            System.out.printf("La raíz compleja x1 es %.3f + %.3fi%n", parteReal, parteImaginaria);
            System.out.printf("La raíz compleja x2 es %.3f - %.3fi%n", parteReal, parteImaginaria);
            */
            x1 = parteReal;
            x2 = parteImaginaria;
        }
		}
		
		
		
		/*
		r1=(-1*b);
		r2=Math.pow(b, 2);
		r3=4*(a)*(c);
		r4=2*(a);
		r5=r2-1*(r3);
		r6=Math.sqrt(r5);
		x1=(float)((r1+r6)/r4);
		x2=(float)((r1-r6)/r4);

		*/
		
		
		
		
		/*
		 * antes de enviar el a no puede ser cero
		 * cuando envias calcular no puede ser cero
		 * cuando a no es cero entonces calculas
		 * variable discriminante>=0
		 *  es el valor
		 *  discriminante
		 *  a ver cuando el valor discriminante de la ecuacion es negativo entonces no hay soluciones reales de la ecuacion por lo tanto
		 *   necesita de numeros complejos para resolver esta ecuacion
		 *   cuando el discriminante es cero entonces hay solo una solucion a las raices
		 */
		}
		
		public double getA() {
			return a;
		}
		public void setA(double a) {
			this.a = a;
		}
		public double getB() {
			return b;
		}
		public void setB(double b) {
			this.b = b;
		}
		public double getC() {
			return c;
		}
		public void setC(double c) {
			this.c = c;
		}
		public double getX1() {
			return x1;
		}
		public void setX1(double x1) {
			this.x1 = x1;
		}
		public double getX2() {
			return x2;
		}
		public void setX2(double x2) {
			this.x2 = x2;
		}
}