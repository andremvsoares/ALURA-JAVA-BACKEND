
public class ExercicioAliquotaComIfs {
	
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if (salario >= 3751.01 && salario<= 4664.00) {
			salario = salario -((salario/100)*22.5);
			System.out.println("Seu salário desconta 22.5% (R$ 636,00), seu novo salario é: " + salario);
			
		} else if (salario<3751 && salario>=2800.01){
			salario = salario -((salario/100)*15);
			System.out.println("Seu salário desconta 15% (R$ 350,00), seu novo salario é: " + salario);
			
		}else {
			salario = salario -((salario/100)*7.5);
			System.out.println("Seu salário desconta 7.5% (R$ 142,00), seu novo salario é: " + salario);
		}
	}
}
