package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //LineChart lineChart = FolkDance();
        LineChart lineChart = BankShift();
        Group root = new Group(lineChart);
        Scene scene = new Scene(root,600,400);
        //stage.setTitle("Runtime Analysis of Küküllőmenti legényes Quicksort");
        stage.setTitle("Runtime Analysis of Shifting Insertation Sort");
        stage.setScene(scene);
        stage.show();

    }

    public LineChart FolkDance(){
        int[] hw2Size = {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};

        NumberAxis yAxis = new NumberAxis(0,hw2Size[hw2Size.length -1],10000);
        yAxis.setLabel("Size of Array");

        NumberAxis xAxis = new NumberAxis(0,12,4);
        xAxis.setLabel("ms");

        LineChart linechart = new LineChart(xAxis,yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("Runtime of Küküllőmenti legényes Quicksort");

        for (int j : hw2Size) {
            int[] generatedArray = Generate_Array.Generate.generateArray(j);
            series.getData().add(new XYChart.Data((FolkSortHw2(generatedArray)/1000000),j));
        }

        linechart.getData().add(series);
        return linechart;
    }

    public static long FolkSortHw2(int[] array){
        long startTime = System.nanoTime();
        Folk_Dance.FolkDance.FolkSort(array,0,array.length-1);
        return System.nanoTime() - startTime;
    }

    public LineChart BankShift(){
        int size =(int) Math.pow(2,16);

        int[] shifts = new int[17];

        for (int i = 0; i <16 ; i++) {
            shifts[i] =(int) Math.pow(2,i);
        }
        shifts[16] = size - 1;

        NumberAxis xAxis = new NumberAxis(0,100000,10000);
        xAxis.setLabel("Shifts");

        NumberAxis yAxis = new NumberAxis(0,900,200);
        yAxis.setLabel("ms");

        LineChart linechart = new LineChart(xAxis,yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("Runtime of Shifts on insertation sort");

        for (int shift : shifts) {
            series.getData().add(new XYChart.Data(shift,(BankShiftHw3(shift,size)/1000000)));
        }

        linechart.getData().add(series);
        return linechart;
    }


    public static double BankShiftHw3(int shift,int size){
        int[] H3Array  = Generate_Array.Generate.generateArraySorted(size);
        Shift.Shift.rightRotate(H3Array,shift);
        long startTime = System.nanoTime();
        Shift.Shift.insertationSort(H3Array);
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        launch();
    }
}