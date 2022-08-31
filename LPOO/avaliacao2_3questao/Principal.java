package LPOO.avaliacao2_3questao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Quadrado> quadrados = new ArrayList<>();
        Quadrado quadrado0 = new Quadrado(2, 2);
        quadrados.add(quadrado0);
        Quadrado quadrado1 = new Quadrado(3, 3);
        quadrados.add(quadrado1);
        Quadrado quadrado2 = new Quadrado(4, 4);
        quadrados.add(quadrado2);
        
        ArrayList<Retangulo> retangulos = new ArrayList<>();
        Retangulo retangulo0 = new Retangulo(2, 4);
        retangulos.add(retangulo0);
        Retangulo retangulo1 = new Retangulo(3, 6);
        retangulos.add(retangulo1);
        Retangulo retangulo2 = new Retangulo(4, 8);
        retangulos.add(retangulo2);

        System.out.println("\nListando Area e Perimetro dos Quadrados\n");
        for (int i = 0; i < quadrados.size(); i++) {
            System.out.print("Quadrado " + i + ":\n" );
            quadrados.get(i).imprimirAreaPerimetro();
            System.out.print("\n" );
        }
        
        System.out.print("\nListando Area e Perimetro dos Retangulos\n");
        for (int i = 0; i < retangulos.size(); i++) {
            System.out.print("Retangulo " + i + ":\n" );
            retangulos.get(i).imprimirAreaPerimetro();
            System.out.print("\n" );
        }
        
        System.out.println("\nListando Quadrados com os metodos da interface\n");
        for (int i = 0; i < quadrados.size(); i++) {
            System.out.print("Quadrado " + i + ":\n" );
            quadrados.get(i).metadeTamnho();
            quadrados.get(i).dobrarTamanho();
            quadrados.get(i).triplicarTamanho();
            System.out.print("\n" );
        }
        
        System.out.println("\nListando Retangulos com os metodos da interface\n");
        for (int i = 0; i < retangulos.size(); i++) {
            System.out.print("Retangulo " + i + ":\n" );
            retangulos.get(i).metadeTamnho();
            retangulos.get(i).dobrarTamanho();
            retangulos.get(i).triplicarTamanho();
            System.out.print("\n" );
        }
    }
}
