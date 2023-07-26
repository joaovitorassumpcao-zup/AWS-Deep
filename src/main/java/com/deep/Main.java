package com.deep;

import com.deep.service.CarroService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarroService carroService = new CarroService();
        Scanner scanner = new Scanner(System.in);

        carroService.list();

        System.out.println("    \n1 - Adicionar\n" +
                "   2 - Atualizar\n" +
                "   3 - Deletar\n");
        System.out.print(" > ");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:{
                System.out.print("  Placa: ");
                String placa = scanner.next();
                System.out.print("  Marca: ");
                String marca = scanner.next();
                System.out.print("  Modelo: ");
                String modelo = scanner.next();

                carroService.add(placa,marca,modelo);
                break;
            }
            case 2:{
                System.out.print("  Placa: ");
                String placa = scanner.next();
                System.out.print("  Coluna: ");
                String coluna = scanner.next();
                System.out.print("  Valor Atualizado: ");
                String valor = scanner.next();

                carroService.update(placa, coluna, valor);
                break;
            }
            case 3:{
                System.out.print("  Placa: ");
                String placa = scanner.next();

                carroService.delete(placa);
                break;
            }
            default:{
                System.out.println("Valor inválido");
            }
        }
    }
}
