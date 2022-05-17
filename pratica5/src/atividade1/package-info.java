package atividade1;
package exemploarraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ExemploArrayList {
public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);

ArrayList<String> agenda = new ArrayList();

agenda.add("Juca Bala;11 1111-1111");
agenda.add("Marcos Paqueta;22 2222-2222");
agenda.add("Maria Antonieta;33 3333-3333");
agenda.add("Antônio Conselheiro;44 4444-4444");

int i;

System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
int n = agenda.size();
for (i=0; i<n; i++) {
System.out.printf("Posição %d- %s\n", i, agenda.get(i));
	}

System.out.printf("\nInforme a posição a ser excluída:\n");
i = ler.nextInt();
try {

agenda.remove(i);
} catch (IndexOutOfBoundsException e) {

System.out.printf("\nErro: posição inválida (%s).",
e.getMessage());
	}


System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
i = 0;
for (String contato: agenda) {
System.out.printf("Posição %d- %s\n", i, contato);
i++;
	}

System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
i = 0;
Iterator<String> iterator = agenda.iterator();
while (iterator.hasNext()) {
System.out.printf("Posição %d- %s\n", i, iterator.next());
i++;
		}
	}
}