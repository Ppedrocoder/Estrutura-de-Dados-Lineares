/*
 * Created on 01/09/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Robinson
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class testePilha {

	public static void main(String[] args) {				
		PilhaRubroNegras pp= new PilhaRubroNegras(10);
		System.out.println("inserindo");
		for(int f=0;f<7;f++){
		  System.out.println(f);
		  pp.pushPreto(f);
		}
		System.out.println(pp.getCapacidade());
		for(int f=0;f<5;f++){
		  System.out.println(f);
		  pp.pushVermelho(f);
		}
		System.out.println(pp.getCapacidade());
		System.out.println("retirando");
		for(int f=0;f<4;f++){
			  System.out.println(" - "+pp.topPreto());
			  System.out.println(" - "+pp.popPreto());
		}
		System.out.println("capacidade "+pp.getCapacidade());
		for(int f=0;f<4;f++){
			  System.out.println(" - "+pp.topVermelho());
			  System.out.println(" - "+pp.popVermelho());
		}
		System.out.println("capacidade "+pp.getCapacidade());
		System.out.println("verificando");
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		System.out.println(pp.sizePreto());
		System.out.println(pp.sizeVermelho());
		System.out.println(pp.isEmptyPreto());
		System.out.println(pp.isEmptyVermelho());

		System.out.println("retirando tudo");
		pp.popPreto();
		//pp.popVermelho();
		System.out.println(pp.isEmptyPreto());
		System.out.println(pp.isEmptyVermelho());
		System.out.println(pp.sizePreto());
		System.out.println(pp.sizeVermelho());
		System.out.println("capacidade "+pp.getCapacidade());
		System.out.println(pp.topPreto());
		System.out.println(pp.topVermelho());
		System.out.println("fim");
	}
}
