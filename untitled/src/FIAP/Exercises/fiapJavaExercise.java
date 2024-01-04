package FIAP.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class fiapJavaExercise {

    static Scanner input = new Scanner(System.in);
    static int [] arrayQuant= new int[5];
    static DecimalFormat dformat = new DecimalFormat("R$ ###,#00.00");

    public static void main(String[] args) {

        String[] cars =new String[]{"Classic","Cobalt","Onix","Prisma","Cruze"};

        double[] prices =new double[]{33600,44900,37790,43150,55400};

        System.out.println("Controle de Vendas vigorito");
        int [][] quantityCars = fillQuantityCars(cars);
        double [] totalSalesEachCar = fillTotalSalesForEachCar(prices, quantityCars);
        System.out.println("Relatório Gerencial");
        relatorioGerencial(totalSalesEachCar, arrayQuant, cars);

    }

    public static int [] [] fillQuantityCars(String [] cars){
        int [][]quantityCars = new int[4][5];


        for (int i = 0; i < 4; i++) {
            System.out.println("Vendas "+(i+1)+"º trimestre");
            for (int j = 0; j < 5; j++) {
                System.out.print("Carro "+cars[j]+":");
                quantityCars[i][j]= input.nextInt();
            }
        }

        return quantityCars;
    }

    public static double [] fillTotalSalesForEachCar(double[] prices,  int [][] quantityCars){
        double [] salesEachCar = new double[5];

        arrayQuant = fillQuantityTrimestre(quantityCars);

        for (int i = 0; i < arrayQuant.length; i++) {
            salesEachCar[i] = arrayQuant[i]*prices[i];
        }

        return salesEachCar;
    }

    public static int [] fillQuantityTrimestre(int [][] quantityCars){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                arrayQuant[i] += quantityCars[j][i];
            }
        }

        return arrayQuant;

    }

    public static void relatorioGerencial(double [] totalSalesEachCar, int [] arrayQuant, String[] cars){

        double vendasTotais =0 ;

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Carro:"+cars[i]+"\t Quantidade Geral:"+arrayQuant[i]+"\t Total: "+dformat.format(totalSalesEachCar[i]));

            vendasTotais += totalSalesEachCar[i];
        }

        System.out.println("Total geral das vendas 2014: "+dformat.format(vendasTotais));

    }
}
