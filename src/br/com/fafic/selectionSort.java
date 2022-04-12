package br.com.fafic;

import java.util.Arrays;

public class selectionSort {


    public static void main(String[] args) {

        int[] vetor = {1,3,2,6,4,8,7,5,10,9};

        for(int i = 0; i < vetor.length -1; i++ ){

            int index = i;

            for(int j = i+1; j < vetor.length; j++ ){
                if(vetor[j] < vetor[index]){
                    index = j;
                }
            }
            if(vetor[i] > vetor[index]){
                int aux = vetor[i];
                vetor[i] = vetor[index];
                vetor[index] = aux;
            }
        }

        System.out.println(Arrays.toString(vetor));
    }
}
