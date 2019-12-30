package application;

public class MainContagemNovaTest {

	public static void main(String[] args) {
		
		SLista.range = 10;
		
		ContagemNova cn = new ContagemNova();
		cn.dezenasContagemGeral();
		cn.dezenasContagemRange();
		System.out.println("GERAL");
		System.out.println(SLista.dezenaContagemGeral);
		System.out.println("RANGE");
		System.out.println(SLista.dezenaContagemRange);

		/*System.out.println("RANGE Range 255");
		//SLista.range = 255;
		cn.dezenasContagemRange();
		System.out.println(SLista.dezenaContagemRange);*/
		
		System.out.println("LINHAS");
		SLista.checkRange = true;
		//SLista.range = 2214;
		cn.dezenasContagemLinhas();
		System.out.println(SLista.dezenaContagemLinhas);
		
		System.out.println("COLUNAS");
		cn.dezenasContagemColunas();
		System.out.println(SLista.dezenaContagemColunas);
		
		System.out.println("IMPAR");
		cn.mediaImpar();
		System.out.println(SLista.mediaImpar);
		
		System.out.println("QUADRANTE");
		cn.dezenaContagemGraduante();
		//System.out.println();
		
		FatorDeRepeticao fr = new FatorDeRepeticao();

		System.out.println("Gaiola");
		System.out.println(SLista.gaiola);
		System.out.println(SLista.gaiola.size());
	}

}
