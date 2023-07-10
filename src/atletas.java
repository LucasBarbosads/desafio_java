import java.util.*;

public class atletas {
       
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input=new Scanner(System.in);
		Scanner inputString=new Scanner(System.in);
		int numeroAtletas;
		
		System.out.print("Digite a quantidade de Atletas: ");
		numeroAtletas=input.nextInt();
		while(numeroAtletas<=0) {
			System.out.println("Digite o valor do números de atletas maior que zero");
			numeroAtletas=input.nextInt();
		}
		
		String[] nome=new String[numeroAtletas];
		char[] sexo=new char[numeroAtletas];
		double[] altura=new double[numeroAtletas];
		double[] peso=new double[numeroAtletas];
		
		for(int i=0;i<numeroAtletas;i++) {
			System.out.println("Digite o número do atleta "+(i+1)+"");
			System.out.print("nome: ");
			nome[i]=inputString.nextLine();
			System.out.print("sexo: ");
			sexo[i]=input.next().charAt(0);
			sexo[i]=Character.toUpperCase(sexo[i]);
			while(sexo[i]!='F' && sexo[i]!='M') {
				System.out.println("Digite f para feminino e M para masculino");
				sexo[i]=input.next().charAt(0);
				sexo[i]=Character.toUpperCase(sexo[i]);
			}
			System.out.print("Altura: ");
			altura[i]=input.nextDouble();
			while(altura[i]<=0) {
			     System.out.println("Digite a altura maior que zero");
			     altura[i]=input.nextDouble();
			     
			}
			System.out.print("Peso: ");
			peso[i]=input.nextDouble();
			while(peso[i]<=0) {
				 System.out.println("Digite o peso maior que zero");
				 peso[i]=input.nextDouble();
			}
			
		}
		
		double somaPeso=0.00;
		//soma dos pesos
		for(int i=0;i<numeroAtletas;i++) {
			somaPeso+=peso[i];
		}
		//media do peso dos atletas
		double mediaPeso;
		mediaPeso=somaPeso/numeroAtletas;
		//contagem dos atletas masculinos
		int contMas=0;
		for(int i=0;i<numeroAtletas;i++) {
		    if(sexo[i]=='M') {
		    	contMas++;
		    }
		}
		//porcentagem do sexo M
		double porcentagemHomens=(contMas*100)/numeroAtletas;
		//atleta mais alto
		double alturaMaior=0.05;
		String nomeAtletaMaior;
		nomeAtletaMaior= "";
		for(int i=0;i<numeroAtletas;i++) {
			
			if(altura[i]>alturaMaior) {
				nomeAtletaMaior=nome[i];
				alturaMaior=altura[i];
				
			}
		}
		//media das altura do sexo f
	    double contFem=0;
	    double somaFem=0.00;
	    
	    for(int i=0;i<numeroAtletas;i++) {
	    	if(sexo[i]=='F') {
	    		somaFem+=altura[i];
	    		contFem++;
	    	}
	    }
	    double alturaMediaFem=somaFem/contFem;
	    
	    System.out.println("Relátorio");
	    System.out.printf("Peso médio dos atletas: %.2f\n", mediaPeso);
	    System.out.println("Atleta mais alto: "+nomeAtletaMaior);
	    System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
	    if(contFem==0) {
	    	System.out.println("Não há mulheres cadastradas");
	    }else {
	    	System.out.printf("Altura média das mulheres: %.2f", alturaMediaFem);
	    }
	}
}
