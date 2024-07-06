/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Hector
 */
public class Grafo {
     private int numVertices;
    private int numAristas;
    private boolean dirigido;
    private boolean ponderado;
    private int[][] matrizAdyacencia;
    private List<Integer>[] listaAdyacencia;

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumAristas() {
        return numAristas;
    }

    public void setNumAristas(int numAristas) {
        this.numAristas = numAristas;
    }

    public boolean isDirigido() {
        return dirigido;
    }

    public void setDirigido(boolean dirigido) {
        this.dirigido = dirigido;
    }

    public boolean isPonderado() {
        return ponderado;
    }

    public void setPonderado(boolean ponderado) {
        this.ponderado = ponderado;
    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public void setMatrizAdyacencia(int[][] matrizAdyacencia) {
        this.matrizAdyacencia = matrizAdyacencia;
    }

    public List<Integer>[] getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void setListaAdyacencia(List<Integer>[] listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }
    
    public Grafo(){}

    public Grafo(int numVertices, boolean dirigido, boolean ponderado) {
        this.numVertices = numVertices;
        this.numAristas = 0;
        this.dirigido = dirigido;
        this.ponderado = ponderado;
        this.matrizAdyacencia = new int[numVertices][numVertices];
        this.listaAdyacencia = new List[numVertices];
        for (int i = 0; i < numVertices; i++) {
            listaAdyacencia[i] = new ArrayList<>();
        }
    }

    public void agregarArista(int v1, int v2, int peso) {
        if (v1 >= 0 && v1 < numVertices && v2 >= 0 && v2 < numVertices) {
            if (!dirigido) {
                matrizAdyacencia[v1][v2] = peso;
                matrizAdyacencia[v2][v1] = peso;
                listaAdyacencia[v1].add(v2);
                listaAdyacencia[v2].add(v1);
            } else {
                matrizAdyacencia[v1][v2] = peso;
                listaAdyacencia[v1].add(v2);
            }
            numAristas++;
        }
    }

    public int getGradoVertice(int v) {
        int grado = 0;
        for (int i = 0; i < numVertices; i++) {
            if (matrizAdyacencia[v][i] != 0) {
                grado++;
            }
        }
        return grado;
    }

    public boolean esConexo() {
        boolean[] visitados = new boolean[numVertices];
        dfs(0, visitados);
        for (boolean visitado : visitados) {
            if (!visitado) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int v, boolean[] visitados) {
        visitados[v] = true;
        for (int i = 0; i < numVertices; i++) {
            if (matrizAdyacencia[v][i] != 0 && !visitados[i]) {
                dfs(i, visitados);
            }
        }
    }

    public void bfs(int v) {
        boolean[] visitados = new boolean[numVertices];
        Queue<Integer> cola = new LinkedList<>();
        cola.add(v);
        visitados[v] = true;
        while (!cola.isEmpty()) {
            int u = cola.poll();
            System.out.print(u + " ");
            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[u][i] != 0 && !visitados[i]) {
                    cola.add(i);
                    visitados[i] = true;
                }
            }
        }
        System.out.println();
    }

    public void dijkstra(int origen) {
        int[] distancias = new int[numVertices];
        boolean[] visitados = new boolean[numVertices];
        PriorityQueue<Integer> cola = new PriorityQueue<>();
        cola.add(origen);
        distancias[origen] = 0;
        while (!cola.isEmpty()) {
            int u = cola.poll();
            visitados[u] = true;
            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[u][i] != 0 && !visitados[i]) {
                    int distancia = distancias[u] + matrizAdyacencia[u][i];
                    if (distancia < distancias[i]) {
                        distancias[i] = distancia;
                        cola.add(i);
                    }
                }
            }
        }
        System.out.println("Distancias desde " + origen + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + ": " + distancias[i]);
        }
    }

    // Otros métodos que podrías implementar:
    // - Algoritmo de Floyd-Warshall
    // - Algoritmo de Kruskal
    // - Algoritmo de Prim
    // - Métodos para obtener caminos y ciclos
    // - Métodos para obtener componentes conexas
    // - ...
}
